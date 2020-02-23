package com.meli.dnadetector.service;

import com.meli.dnadetector.service.processor.DnaVerticalProcessor;
import org.junit.jupiter.api.Test;

import static com.meli.dnadetector.service.DnaProcessorTestHelper.invalidSimianDna;
import static com.meli.dnadetector.service.DnaProcessorTestHelper.validSimianDna;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DnaVerticalProcessorTest {


    private DnaVerticalProcessor dnaVerticalProcessor = new DnaVerticalProcessor();

    @Test
    void processDnaWithValidEntries_thenShouldReturnTrue() {
        assertTrue(dnaVerticalProcessor.processDna(validSimianDna));
    }

    @Test
    void processDnaWithInvalidEntries_thenShouldReturnFalse() {
        assertFalse(dnaVerticalProcessor.processDna(invalidSimianDna));
    }
}