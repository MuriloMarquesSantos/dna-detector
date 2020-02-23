package com.meli.dnadetector.service;

import com.meli.dnadetector.service.processor.DnaDiagonalProcessor;
import org.junit.jupiter.api.Test;

import static com.meli.dnadetector.service.DnaProcessorTestHelper.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DnaDiagonalProcessorTest {

    private DnaDiagonalProcessor diagonalProcessor = new DnaDiagonalProcessor();

    @Test
    void processDnaWithValidEntries_thenShouldReturnTrue() {
        assertTrue(diagonalProcessor.processDna(validDiagonalSimianDna1));
        assertTrue(diagonalProcessor.processDna(validDiagonalSimianDna2));
        assertTrue(diagonalProcessor.processDna(validDiagonalSimianDna3));
    }

    @Test
    void processDnaWithInvalidEntries_thenShouldReturnFalse() {
        assertFalse(diagonalProcessor.processDna(invalidSimianDna));
    }
}