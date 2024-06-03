package com.circuit.breaker.dto;

import lombok.Builder;

@Builder
public record ZipCodeDto(String zipCode,
                         String publicPlace,
                         String city,
                         String state,
                         String neighborhood) {
}
