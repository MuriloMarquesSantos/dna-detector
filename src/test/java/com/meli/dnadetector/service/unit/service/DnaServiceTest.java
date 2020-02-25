package com.meli.dnadetector.service.unit.service;

import com.meli.dnadetector.dto.DnaRequest;
import com.meli.dnadetector.dto.DnaResponse;
import com.meli.dnadetector.entity.Dna;
import com.meli.dnadetector.repository.DnaRepository;
import com.meli.dnadetector.service.DnaService;
import com.meli.dnadetector.service.processor.DnaDiagonalProcessor;
import com.meli.dnadetector.service.processor.DnaHorizontalProcessor;
import com.meli.dnadetector.service.processor.DnaVerticalProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static com.meli.dnadetector.service.unit.DnaTestHelper.getValidDnaEntityWithIsSimianTrue;
import static com.meli.dnadetector.service.unit.DnaTestHelper.getValidDnaRequest;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class DnaServiceTest {

    @InjectMocks
    private DnaService dnaService;

    @Mock
    private DnaHorizontalProcessor dnaHorizontalProcessor;
    @Mock
    private DnaVerticalProcessor dnaVerticalProcessor;
    @Mock
    private DnaDiagonalProcessor dnaDiagonalProcessor;

    @Mock
    DnaRepository dnaRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void isSimian_whenHorizontalProcessorReturnsTrueAndDnaDoesntExist_then_ShouldReturnTrue() {
        Dna dna = getValidDnaEntityWithIsSimianTrue();

        DnaRequest dnaRequest = getValidDnaRequest();

        when(dnaRepository.findByDna(any())).thenReturn(Optional.empty());
        when(dnaHorizontalProcessor.isSimian(any())).thenReturn(Boolean.TRUE);
        when(dnaRepository.save(any())).thenReturn(dna);

        DnaResponse dnaResponse = dnaService.isSimian(dnaRequest);

        assertNotNull(dnaResponse);
        assertTrue(dnaResponse.getIsSimian());
    }

    @Test
    void isSimian_whenVerticalProcessorReturnsTrueAndDnaDoesntExist_then_ShouldReturnTrue() {
        Dna dna = getValidDnaEntityWithIsSimianTrue();

        DnaRequest dnaRequest = getValidDnaRequest();

        when(dnaRepository.findByDna(any())).thenReturn(Optional.empty());
        when(dnaVerticalProcessor.isSimian(any())).thenReturn(Boolean.TRUE);
        when(dnaRepository.save(any())).thenReturn(dna);

        DnaResponse dnaResponse = dnaService.isSimian(dnaRequest);

        assertNotNull(dnaResponse);
        assertTrue(dnaResponse.getIsSimian());
    }

    @Test
    void isSimian_whenDiagonalProcessorReturnsTrueAndDnaDoesntExist_then_ShouldReturnTrue() {
        Dna dna = getValidDnaEntityWithIsSimianTrue();

        DnaRequest dnaRequest = getValidDnaRequest();

        when(dnaRepository.findByDna(any())).thenReturn(Optional.empty());
        when(dnaDiagonalProcessor.isSimian(any())).thenReturn(Boolean.TRUE);
        when(dnaRepository.save(any())).thenReturn(dna);

        DnaResponse dnaResponse = dnaService.isSimian(dnaRequest);

        assertNotNull(dnaResponse);
        assertTrue(dnaResponse.getIsSimian());
    }

    @Test
    void isSimian_whenDnaDoesExist_then_ShouldReturnThrowRunTimeException() {
        when(dnaRepository.findByDna(any())).thenReturn(Optional.of(getValidDnaEntityWithIsSimianTrue()));

        assertThrows(RuntimeException.class, () -> dnaService.isSimian(getValidDnaRequest()));
    }

    @Test
    void isSimian_whenDnaDoesnotExist_then_ShouldReturnThrowRunTimeException() {
        when(dnaRepository.findByDna(any())).thenReturn(Optional.empty());

        when(dnaDiagonalProcessor.isSimian(any())).thenReturn(Boolean.FALSE);
        when(dnaHorizontalProcessor.isSimian(any())).thenReturn(Boolean.FALSE);
        when(dnaVerticalProcessor.isSimian(any())).thenReturn(Boolean.FALSE);

        assertThrows(RuntimeException.class, () -> dnaService.isSimian(getValidDnaRequest()));
    }
}