package com.meli.dnadetector.service;

public class DnaProcessorTestHelper {

    static String[] validSimianDna = {"ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"};
    static String[] validDiagonalSimianDna1 = {"ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"};
    static String[] validDiagonalSimianDna2 = {"GTGCGA", "CAGTGC", "TTGTGT", "AGAGGG", "CCCCGA", "TCACTG"};
    static String[] validDiagonalSimianDna3 = {"GTGCGA", "CAGTGC", "TAGTGT", "AGAGGG", "CCCAAA", "TCACAG"};
    static String[] invalidDiagonalSimianDna = {"GTGCGA", "CAGTGC", "TATTGT", "AGAGGG", "CCCATA", "TCACAG"};
    static String[] invalidSimianDna = {"AAATTC", "GGGAAA", "TTTGCC", "AGAACG", "CCCTTG", "CCCGAA"};
}
