package com.circuit.breaker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record EnderecoBrasilApiDto(@JsonProperty("cep") String zipCode,
                                   @JsonProperty("street") String publicPlace,
                                   String city,
                                   String state,
                                   String neighborhood) {
        public ZipCodeDto toZipCodeDto() {
            return ZipCodeDto.builder()
                    .city(city)
                    .neighborhood(neighborhood)
                    .publicPlace(publicPlace)
                    .state(state)
                    .zipCode(zipCode)
                    .build();
        }
}
