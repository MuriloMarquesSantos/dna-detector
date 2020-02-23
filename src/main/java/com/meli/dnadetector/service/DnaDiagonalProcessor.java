package com.meli.dnadetector.service;

import org.springframework.stereotype.Service;

@Service
public class DnaDiagonalProcessor implements DnaProcessable {

    public boolean processDna(String[] dna) {
        for (int i = 0; i < dna.length; i++) {
            if (validateDnaDiagonals(dna, i)) return true;
        }
        return false;
    }

    private boolean validateDnaDiagonals(String[] dna, int i) {
        for (int j = 0; j < dna.length; j++) {
            if (hasRoomToValidateFromLeftToRight(i, j)) {
                if (validateFromLeftToRight(dna, i, j)) {
                    return true;
                }
            }
            if (hasRoomToValidateFromRightToLeft(dna, i, j)) {
                if (validateFromRightToLeft(dna, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasRoomToValidateFromRightToLeft(String[] dna, int i, int j) {
        return j <= dna.length - 4 && i<= dna.length - 4;
    }

    private boolean hasRoomToValidateFromLeftToRight(int i, int j) {
        return j >= 3 && i <= 2;
    }

    private boolean validateFromRightToLeft(String[] dna, int i, int j) {
        return dna[i].charAt(j) == dna[i + 1].charAt(j + 1)
                && dna[i + 1].charAt(j + 1) == dna[i + 2].charAt(j + 2)
                && dna[i + 2].charAt(j + 2) == dna[i + 3].charAt(j + 3);
    }

    private boolean validateFromLeftToRight(String[] dna, int i, int j) {
        return dna[i].charAt(j) == dna[i + 1].charAt(j - 1)
                && dna[i + 1].charAt(j - 1) == dna[i + 2].charAt(j - 2)
                && dna[i + 2].charAt(j - 2) == dna[i + 3].charAt(j - 3);
    }

}
