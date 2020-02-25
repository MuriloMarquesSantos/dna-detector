package com.meli.dnadetector.service.unit.processor;

import com.meli.dnadetector.service.processor.DnaVerticalProcessor;
import org.junit.jupiter.api.Test;

import static com.meli.dnadetector.service.unit.DnaTestHelper.invalidSimianDna;
import static com.meli.dnadetector.service.unit.DnaTestHelper.validSimianDna;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DnaVerticalProcessorTest {


    private DnaVerticalProcessor dnaVerticalProcessor = new DnaVerticalProcessor();

    @Test
    void processDnaWithValidEntries_thenShouldReturnTrue() {
        assertTrue(dnaVerticalProcessor.isSimian(validSimianDna));
    }

    @Test
    void processDnaWithInvalidEntries_thenShouldReturnFalse() {
        assertFalse(dnaVerticalProcessor.isSimian(invalidSimianDna));
    }
}