package com.meli.dnadetector.controller;

import com.meli.dnadetector.dto.DnaDTO;
import com.meli.dnadetector.service.DnaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping
public class DnaController {

    private DnaService dnaService;

    public static final String BASE_PATH = "/dna";

    @PostMapping("simian")
    public DnaDTO isSimian(@RequestBody DnaDTO dnaDTO) {
        return dnaService.isSimian(dnaDTO);
    }


}
