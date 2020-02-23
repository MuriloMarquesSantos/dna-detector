package com.meli.dnadetector.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.meli.dnadetector.service.DnaProcessorTestHelper.*;
import static org.junit.jupiter.api.Assertions.*;

class DnaDiagonalProcessorTest {

    private DnaDiagonalProcessor diagonalProcessor = new DnaDiagonalProcessor();

    @BeforeEach
    void setUp() {
    }

    @Test
    void processDna() {
        assertTrue(diagonalProcessor.processDna(validDiagonalSimianDna1));
        assertTrue(diagonalProcessor.processDna(validDiagonalSimianDna2));
        assertTrue(diagonalProcessor.processDna(validDiagonalSimianDna3));
    }
}