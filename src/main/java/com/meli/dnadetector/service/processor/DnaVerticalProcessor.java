package com.meli.dnadetector.service.processor;

import org.springframework.stereotype.Service;

@Service
public class DnaVerticalProcessor implements DnaProcessable {

    public boolean processDna(String[] dna) {
        char[] dnaBases = new char[dna.length];

        for (int i = 0; i < dna.length; i++) {
            if (validateDnaColumns(dna, dnaBases, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean validateDnaColumns(String[] dna, char[] dnaBases, int i) {
        for (int j = 0; j < dna.length; j++) {
            dnaBases[j] = dna[j].charAt(i);
        }
        return validateDna(String.valueOf(dnaBases));
    }

    private boolean validateDna(String dnaRow) {
        return dnaRow.contains("AAAAA") ||
                dnaRow.contains("TTTT") ||
                dnaRow.contains("CCCC") ||
                dnaRow.contains("GGGG");
    }


}
