package com.circuit.breaker.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.circuit.breaker.dto.EnderecoBrasilApiDto;

@FeignClient(name = "BrasilApiClient", url = "${api-brasil.url}")
public interface BrasilApiClient {
    @GetMapping("/api/cep/v1/{cep}")
    EnderecoBrasilApiDto findAddress(@PathVariable("cep") String zipCode);
}
