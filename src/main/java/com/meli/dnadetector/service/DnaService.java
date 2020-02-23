package com.meli.dnadetector.service;

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

    public boolean isSimian(String[] dna) {
       return (dnaHorizontalProcessor.processDna(dna) || dnaVerticalProcessor.processDna(dna) || dnaDiagonalProcessor.processDna(dna));
    }
}