package com.meli.dnadetector.service.unit.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.meli.dnadetector.controller.DnaController;
import com.meli.dnadetector.exception.ResponseExceptionHandler;
import com.meli.dnadetector.service.DnaService;
import com.meli.dnadetector.service.StatsService;
import com.meli.dnadetector.service.unit.DnaTestHelper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;

import static com.meli.dnadetector.service.unit.DnaTestHelper.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class DnaControllerTest {


    private MockMvc mockMvc;

    private ObjectMapper jsonObjectMapper;

    @InjectMocks
    private DnaController dnaController;

    @Mock
    private DnaService dnaService;

    @Mock
    private StatsService statsService;

    private static final String STATS_URL = "/stats";
    private static final String SIMIAN_URL = "/simian";

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(dnaController)
                .setControllerAdvice(new ResponseExceptionHandler())
                .build();
        jsonObjectMapper = new ObjectMapper();
    }

    @Test
    public void performGetStats_then_ShouldReturnOkResponse() throws Exception {
        when(statsService.getDnaStats()).thenReturn(getValidStatsResponse());

        mockMvc.perform(get(DnaController.BASE_PATH + STATS_URL)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void performIsSimian_then_ShouldReturnOkResponse() throws Exception {
        when(dnaService.isSimian(any())).thenReturn(getValidDnaResponse());

        mockMvc.perform(post(DnaController.BASE_PATH + SIMIAN_URL)
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonObjectMapper.writeValueAsString(getValidDnaRequest())))
                .andExpect(status().isOk());
    }
}
