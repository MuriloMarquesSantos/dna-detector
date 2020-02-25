package com.meli.dnadetector.utils;

public class DnaMapper {

    public static String getDnaStringFromArray(String dna[]){

        return String.join("," , dna);
    }

    public static String[] createDnaArrayFromString(String dna) {
        String[] dnaArray;

        dnaArray = dna.split(",");

        return dnaArray;
    }
}
