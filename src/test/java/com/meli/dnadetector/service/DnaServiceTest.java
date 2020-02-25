//package com.meli.dnadetector.service;
//
//import com.meli.dnadetector.service.processor.DnaDiagonalProcessor;
//import com.meli.dnadetector.service.processor.DnaHorizontalProcessor;
//import com.meli.dnadetector.service.processor.DnaVerticalProcessor;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//class DnaServiceTest {
//
//    @InjectMocks
//    private DnaService dnaService;
//
//    @Mock
//    private DnaHorizontalProcessor dnaHorizontalProcessor;
//    @Mock
//    private DnaVerticalProcessor dnaVerticalProcessor;
//    @Mock
//    private DnaDiagonalProcessor dnaDiagonalProcessor;
//
//    private static final String[] SAMPLE_DNA_ARRAY = {"AAAAA"};
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
////    @Test
////    void isSimian_whenHorizontalProcessorReturnsTrue_then_ShouldReturnTrue() {
////        when(dnaHorizontalProcessor.isSimian(any())).thenReturn(Boolean.TRUE);
////        assertTrue(dnaService.isSimian(SAMPLE_DNA_ARRAY));
////    }
////
////    @Test
////    void isSimian_whenHorizontalProcessorReturnsFalse_then_ShouldReturnFalse() {
////        when(dnaHorizontalProcessor.isSimian(any())).thenReturn(Boolean.FALSE);
////        assertFalse(dnaService.isSimian(SAMPLE_DNA_ARRAY));
////    }
////
////    @Test
////    void isSimian_whenVerticalProcessorReturnsTrue_then_ShouldReturnTrue() {
////        when(dnaVerticalProcessor.isSimian(any())).thenReturn(Boolean.TRUE);
////        assertTrue(dnaService.isSimian(SAMPLE_DNA_ARRAY));
////    }
////
////    @Test
////    void isSimian_whenVerticalProcessorReturnsFalse_then_ShouldReturnFalse() {
////        when(dnaVerticalProcessor.isSimian(any())).thenReturn(Boolean.FALSE);
////        assertFalse(dnaService.isSimian(SAMPLE_DNA_ARRAY));
////    }
////
////    @Test
////    void isSimian_whenDiagonalProcessorReturnsTrue_then_ShouldReturnTrue() {
////        when(dnaDiagonalProcessor.isSimian(any())).thenReturn(Boolean.TRUE);
////        assertTrue(dnaService.isSimian(SAMPLE_DNA_ARRAY));
////    }
////
////    @Test
////    void isSimian_whenDiagonalProcessorReturnsFalse_then_ShouldReturnFalse() {
////        when(dnaDiagonalProcessor.isSimian(any())).thenReturn(Boolean.FALSE);
////        assertFalse(dnaService.isSimian(SAMPLE_DNA_ARRAY));
//    }
//}