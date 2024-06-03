package com.circuit.breaker.controller;

import org.springframework.web.bind.annotation.*;

import com.circuit.breaker.dto.ZipCodeDto;
import com.circuit.breaker.service.ZipCodeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/address")
class ZipCodeController {
    private final ZipCodeService service;

    @GetMapping
    ZipCodeDto getAddress(@RequestParam("zip") String zipCode){
        return service.findAddress(zipCode);
    }
}
