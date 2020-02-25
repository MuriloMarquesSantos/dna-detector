package com.meli.dnadetector.service;

import com.meli.dnadetector.dto.StatsResponse;
import com.meli.dnadetector.repository.DnaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@AllArgsConstructor
public class StatsService {

    private DnaRepository dnaRepository;

    public StatsResponse getDnaStats() {
        int simianCount = findByIsSimian(true);
        int humanCount = findByIsSimian(false);

       return StatsResponse.builder()
                .count_human_dna(humanCount)
                .count_mutant_dna(simianCount)
                .ratio(getRatio(simianCount, humanCount))
                .build();
    }

    private int findByIsSimian(boolean isSimian) {
        return dnaRepository.findByIsSimian(isSimian).
                orElse(Collections.emptyList()).size();
    }

    private double getRatio(int simianCount, int humanCount) {
        double ratio = 0;

        if (humanCount != 0) {
            ratio = (simianCount / humanCount);
        }
        return ratio;
    }
}
