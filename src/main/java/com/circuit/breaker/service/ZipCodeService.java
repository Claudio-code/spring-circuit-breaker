package com.circuit.breaker.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.circuit.breaker.client.BrasilApiClient;
import com.circuit.breaker.client.ViaCepClient;
import com.circuit.breaker.dto.ZipCodeDto;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;

@Slf4j
@Service
@RequiredArgsConstructor
public class ZipCodeService {
    private final ViaCepClient viaCepClient;
    private final BrasilApiClient brasilApiClient;

    @CircuitBreaker(name = "Address", fallbackMethod = "fallBackFindAddress")
    public ZipCodeDto findAddress(final String zipCode) {
        if (zipCode.contains("9")) {
            throw new RuntimeException("ViaCep: Error");
        }
        log.info("M=findAddress out fallback");
        return viaCepClient.findAddress(zipCode).toZipCodeDto();
    }

    public ZipCodeDto fallBackFindAddress(final String zipCode, final Exception e) {
        log.info("M=fallBackFindAddress In fallback");
        return brasilApiClient.findAddress(zipCode).toZipCodeDto();
    }
}
