package com.meli.dnadetector.dto;

import lombok.*;
import org.apache.commons.lang3.StringUtils;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Arrays;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DnaRequest {

    @NotNull
    @NotEmpty
    private String[] dna;

    public void setDna(String[] dna) {
        validateDnaFormat(dna);
        this.dna = dna;
    }

    private void validateDnaFormat(String[] dna) {
        Arrays.stream(dna).filter(dnaPart ->  !(dnaPart.length() == 6) || !StringUtils.containsOnly(dnaPart, "A, T, C, G"))
                .findAny()
                .ifPresent(s -> {
                    throw new RuntimeException("Invalid format of Dna, please fix and try again");
                });
    }
}
