package com.meli.dnadetector.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DnaHorizontalProcessor implements DnaProcessable {

    public boolean processDna(String[] dna) {
        return Arrays.stream(dna).anyMatch(this::validateDna);
    }

    private boolean validateDna(String dnaRow) {
        return dnaRow.contains("AAAAA") ||
                dnaRow.contains("TTTT") ||
                dnaRow.contains("CCCC") ||
                dnaRow.contains("GGGG");
    }
}
