package com.meli.dnadetector.service.unit.processor;

import com.meli.dnadetector.service.processor.DnaHorizontalProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.meli.dnadetector.service.unit.DnaTestHelper.invalidSimianDna;
import static com.meli.dnadetector.service.unit.DnaTestHelper.validSimianDna;
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
        assertTrue(dnaHorizontalProcessor.isSimian(validSimianDna));
    }

    @Test
    void processDnaWithInValidEntry_thenShouldReturnFalse() {
        assertFalse(dnaHorizontalProcessor.isSimian(invalidSimianDna));
    }
}