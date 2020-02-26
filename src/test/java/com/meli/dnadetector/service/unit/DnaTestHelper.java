package com.meli.dnadetector.service.unit;

import com.meli.dnadetector.dto.DnaRequest;
import com.meli.dnadetector.dto.DnaResponse;
import com.meli.dnadetector.dto.StatsResponse;
import com.meli.dnadetector.entity.Dna;

import java.util.List;

import static com.meli.dnadetector.utils.DnaMapper.getDnaStringFromArray;

public class DnaTestHelper {

    public static String[] validSimianDna = {"ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"};
    public static String[] validDiagonalSimianDna1 = {"ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"};
    public static String[] validDiagonalSimianDna2 = {"GTGCGA", "CAGTGC", "TTGTGT", "AGAGGG", "CCCCGA", "TCACTG"};
    public static String[] validDiagonalSimianDna3 = {"GTGCGA", "CAGTGC", "TAGTGT", "AGAGGG", "CCCAAA", "TCACAG"};
    public static String[] invalidDiagonalSimianDna = {"GTGCGA", "CAGTGC", "TATTGT", "AGAGGG", "CCCATA", "TCACAG"};
    public static String[] invalidSimianDna = {"AAATTC", "GGGAAA", "TTTGCC", "AGAACG", "CCCTTG", "CCCGAA"};


    public static Dna getValidDnaEntityWithIsSimianTrue() {
        return Dna.builder().dna(getDnaStringFromArray(validSimianDna)).isSimian(true).build();
    }

    public static DnaRequest getValidDnaRequest() {
        return DnaRequest.builder().dna(validSimianDna).build();
    }

    public static DnaRequest getInvalidDnaRequest() {
        return DnaRequest.builder().dna(invalidSimianDna).build();
    }

    public static Dna getInvalidEntityWithIsSimianFalse() {
        return Dna.builder().dna(getDnaStringFromArray(invalidSimianDna)).isSimian(false).build();
    }

    public static StatsResponse getValidStatsResponse() {
        return StatsResponse
                .builder()
                .count_mutant_dna(1)
                .count_human_dna(2)
                .ratio((double) (2))
                .build();
    }

    public static DnaResponse getValidDnaResponse() {
        return DnaResponse
                .builder()
                .isSimian(true)
                .dna(validSimianDna)
                .build();
    }

    public static DnaResponse getInvalidDnaResponse() {
        return DnaResponse
                .builder()
                .isSimian(false)
                .dna(invalidSimianDna)
                .build();
    }
}
