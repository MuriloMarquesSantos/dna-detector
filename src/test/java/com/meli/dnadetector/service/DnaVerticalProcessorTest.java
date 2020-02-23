package com.meli.dnadetector.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.meli.dnadetector.service.DnaProcessorTestHelper.validSimianDna;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DnaVerticalProcessorTest {


    private DnaVerticalProcessor dnaVerticalProcessor = new DnaVerticalProcessor();

    @BeforeEach
    void setUp() {

    }

    @Test
    void processDna() {
        assertTrue(dnaVerticalProcessor.processDna(validSimianDna));
    }
}