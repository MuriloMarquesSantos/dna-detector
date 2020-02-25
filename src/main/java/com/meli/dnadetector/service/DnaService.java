package com.meli.dnadetector.service;

import com.meli.dnadetector.dto.DnaDTO;
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

    public boolean isSimian(DnaDTO dnaDTO) {
        String[] dna = dnaDTO.getDna();
       return (dnaHorizontalProcessor.isSimian(dna) || dnaVerticalProcessor.isSimian(dna) || dnaDiagonalProcessor.isSimian(dna));
    }
}
