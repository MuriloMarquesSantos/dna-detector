package com.meli.dnadetector.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DnaHorizontalProcessor {

    public boolean processDna(String[] dna) {
        return Arrays.stream(dna).anyMatch(this::processDnaRow);
    }

    private boolean processDnaRow(String dnaRow) {
        return dnaRow.charAt(0) == dnaRow.charAt(1) &&
                dnaRow.charAt(0) == dnaRow.charAt(2) &&
                dnaRow.charAt(0) == dnaRow.charAt(3);
    }
}
