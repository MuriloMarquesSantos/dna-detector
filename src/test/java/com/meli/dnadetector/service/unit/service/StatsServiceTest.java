package com.meli.dnadetector.service.unit.service;

import com.meli.dnadetector.dto.StatsResponse;
import com.meli.dnadetector.entity.Dna;
import com.meli.dnadetector.repository.DnaRepository;
import com.meli.dnadetector.service.StatsService;
import com.meli.dnadetector.service.unit.DnaTestHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static com.meli.dnadetector.service.unit.DnaTestHelper.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class StatsServiceTest {

    @InjectMocks
    StatsService statsService;

    @Mock
    DnaRepository dnaRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getDnaStatsWithSingleValidSimianDna_then_shouldReturnListWithOneSimianDna() {
        when(dnaRepository.findByIsSimian(true)).thenReturn(Optional.of(Collections.singletonList(getValidDnaEntityWithIsSimianTrue())));
        StatsResponse statsResponse = statsService.getDnaStats();

        assertNotNull(statsResponse);
        assertEquals( 1, statsResponse.getCount_mutant_dna());
    }

    @Test
    void getDnaStatsWithSingleValidSimianAndHumanDna_then_shouldReturnListWithOneSimianAndOneHumanDna() {
        when(dnaRepository.findByIsSimian(true)).thenReturn(Optional.of(Collections.singletonList(getValidDnaEntityWithIsSimianTrue())));
        when(dnaRepository.findByIsSimian(false)).thenReturn(Optional.of(Collections.singletonList(getInvalidEntityWithIsSimianFalse())));
        StatsResponse statsResponse = statsService.getDnaStats();

        assertNotNull(statsResponse);
        assertEquals( 1, statsResponse.getCount_mutant_dna());
        assertEquals( 1, statsResponse.getCount_human_dna());
        assertEquals( 1, statsResponse.getRatio());
    }
}