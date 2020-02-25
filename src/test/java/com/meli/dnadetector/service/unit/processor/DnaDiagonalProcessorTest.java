package com.meli.dnadetector.service.unit.processor;

import com.meli.dnadetector.service.processor.DnaDiagonalProcessor;
import org.junit.jupiter.api.Test;

import static com.meli.dnadetector.service.unit.DnaTestHelper.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DnaDiagonalProcessorTest {

    private DnaDiagonalProcessor diagonalProcessor = new DnaDiagonalProcessor();

    @Test
    void processDnaWithValidEntries_thenShouldReturnTrue() {
        assertTrue(diagonalProcessor.isSimian(validDiagonalSimianDna1));
        assertTrue(diagonalProcessor.isSimian(validDiagonalSimianDna2));
        assertTrue(diagonalProcessor.isSimian(validDiagonalSimianDna3));
    }

    @Test
    void processDnaWithInvalidEntries_thenShouldReturnFalse() {
        assertFalse(diagonalProcessor.isSimian(invalidSimianDna));
    }
}