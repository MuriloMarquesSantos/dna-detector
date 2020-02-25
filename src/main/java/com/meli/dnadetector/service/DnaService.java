package com.meli.dnadetector.service;

import com.meli.dnadetector.dto.DnaRequest;
import com.meli.dnadetector.dto.DnaResponse;
import com.meli.dnadetector.entity.Dna;
import com.meli.dnadetector.exception.NotSimianException;
import com.meli.dnadetector.repository.DnaRepository;
import com.meli.dnadetector.service.processor.DnaDiagonalProcessor;
import com.meli.dnadetector.service.processor.DnaHorizontalProcessor;
import com.meli.dnadetector.service.processor.DnaVerticalProcessor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.meli.dnadetector.utils.DnaMapper.createDnaArrayFromString;
import static com.meli.dnadetector.utils.DnaMapper.getDnaStringFromArray;

@Service
@AllArgsConstructor
public class DnaService {

    private DnaHorizontalProcessor dnaHorizontalProcessor;
    private DnaVerticalProcessor dnaVerticalProcessor;
    private DnaDiagonalProcessor dnaDiagonalProcessor;

    private DnaRepository dnaRepository;

    public DnaResponse isSimian(DnaRequest dnaRequest) {
        String[] dna = dnaRequest.getDna();

        checkIfDnaExists(dna);

        Boolean isSimian = getIsSimian(dna);

        Dna savedDna = saveDna(dnaRequest, isSimian);

        if (!savedDna.getIsSimian()) {
            throw new NotSimianException();
        }

        return DnaResponse.builder()
                .dna(createDnaArrayFromString(savedDna.getDna()))
                .isSimian(savedDna.getIsSimian())
                .build();
    }

    private void checkIfDnaExists(String[] dna) {
        dnaRepository.findByDna(getDnaStringFromArray(dna))
                .ifPresent(s -> {
                    throw new RuntimeException("You can't submit a Dna that has already been registered");
                });
    }

    private boolean getIsSimian(String[] dna) {
        return dnaHorizontalProcessor.isSimian(dna) || dnaVerticalProcessor.isSimian(dna) || dnaDiagonalProcessor.isSimian(dna);
    }

    private Dna saveDna(DnaRequest dnaRequest, Boolean isSimian) {
        return dnaRepository.save(Dna.builder()
                .dna(getDnaStringFromArray(dnaRequest.getDna()))
                .isSimian(isSimian)
                .build());
    }

}
