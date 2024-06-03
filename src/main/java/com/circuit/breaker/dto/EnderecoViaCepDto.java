package com.circuit.breaker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record EnderecoViaCepDto(@JsonProperty("cep") String zipCode,
                                @JsonProperty("logradouro") String publicPlace,
                                @JsonProperty("localidade") String city,
                                @JsonProperty("uf") String state,
                                @JsonProperty("bairro") String neighborhood) {
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
