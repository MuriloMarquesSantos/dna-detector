package com.meli.dnadetector.service;

import com.meli.dnadetector.service.processor.DnaDiagonalProcessor;
import com.meli.dnadetector.service.processor.DnaHorizontalProcessor;
import com.meli.dnadetector.service.processor.DnaProcessable;
import com.meli.dnadetector.service.processor.DnaVerticalProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class DnaServiceTest {

    @InjectMocks
    private DnaService dnaService;

    @Mock
    private DnaHorizontalProcessor dnaHorizontalProcessor;
    @Mock
    private DnaVerticalProcessor dnaVerticalProcessor;
    @Mock
    private DnaDiagonalProcessor dnaDiagonalProcessor;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void isSimian() {
        assertTrue(dnaService.isSimian(new String[]{"a"}));
    }
}