package com.meli.dnadetector.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.meli.dnadetector.service.DnaProcessorTestHelper.invalidSimianDna;
import static com.meli.dnadetector.service.DnaProcessorTestHelper.validSimianDna;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DnaHorizontalProcessorTest {

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