package com.meli.dnadetector.service;

import com.meli.dnadetector.dto.DnaRequest;
import com.meli.dnadetector.dto.DnaResponse;
import com.meli.dnadetector.service.processor.DnaDiagonalProcessor;
import com.meli.dnadetector.service.processor.DnaHorizontalProcessor;
import com.meli.dnadetector.service.processor.DnaVerticalProcessor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DnaService {

    private DnaHorizontalProcessor dnaHorizontalProcessor;
    private DnaVerticalProcessor dnaVerticalProcessor;
    private DnaDiagonalProcessor dnaDiagonalProcessor;

    public DnaResponse isSimian(DnaRequest dnaRequest) {
        String[] dna = dnaRequest.getDna();
        boolean isSimian = false;

       isSimian = (dnaHorizontalProcessor.isSimian(dna) || dnaVerticalProcessor.isSimian(dna) || dnaDiagonalProcessor.isSimian(dna));

       return DnaResponse.builder()
               .dna(dnaRequest.getDna())
               .isSimian(isSimian)
               .build();
    }
}
