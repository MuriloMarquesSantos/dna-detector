package com.meli.dnadetector.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StatsResponse {

    private Integer count_mutant_dna;

    private Integer count_human_dna;

    private Double ratio;
}
