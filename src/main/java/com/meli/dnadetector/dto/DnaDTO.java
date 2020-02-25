package com.meli.dnadetector.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
public class DnaDTO {

    @NotNull
    @NotEmpty
    private String[] dna;
}
