package com.circuit.breaker.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.circuit.breaker.dto.EnderecoViaCepDto;

@FeignClient(name = "ViaCepClient", url = "${via-cep.url}")
public interface ViaCepClient {
    @GetMapping("/ws/{cep}/json/")
    EnderecoViaCepDto findAddress(@PathVariable("cep") String zipCode);
}
