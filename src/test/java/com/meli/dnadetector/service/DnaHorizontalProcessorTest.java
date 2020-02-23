package com.meli.dnadetector.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static com.meli.dnadetector.service.DnaProcessorTestHelper.invalidSimianDna;
import static com.meli.dnadetector.service.DnaProcessorTestHelper.validSimianDna;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

class DnaHorizontalProcessorTest {

    @Mock
    DnaHorizontalProcessor dnaHorizontalProcessor;

    @BeforeEach
    void setUp() {
        dnaHorizontalProcessor = new DnaHorizontalProcessor();
    }

    @Test
    void processDnaWithValidEntry_thenShouldReturnTrue() {
        assertTrue(dnaHorizontalProcessor.processDna(validSimianDna));
    }

    @Test
    void processDnaWithInValidEntry_thenShouldReturnFalse() {
        assertFalse(dnaHorizontalProcessor.processDna(invalidSimianDna));
    }
}