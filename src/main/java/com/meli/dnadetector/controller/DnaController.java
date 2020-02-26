package com.meli.dnadetector.controller;

import com.meli.dnadetector.dto.DnaRequest;
import com.meli.dnadetector.dto.DnaResponse;
import com.meli.dnadetector.dto.StatsResponse;
import com.meli.dnadetector.service.DnaService;
import com.meli.dnadetector.service.StatsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static com.meli.dnadetector.controller.DnaController.BASE_PATH;

@RestController
@AllArgsConstructor
@RequestMapping(BASE_PATH)
public class DnaController {

    private DnaService dnaService;

    private StatsService statsService;

    public static final String BASE_PATH = "/dna";

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("simian")
    public DnaResponse isSimian(@RequestBody DnaRequest dnaRequest) {
        return dnaService.isSimian(dnaRequest);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("stats")
    public StatsResponse getStats() {
        return statsService.getDnaStats();
    }


}
