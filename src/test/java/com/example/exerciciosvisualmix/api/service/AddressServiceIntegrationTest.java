package com.example.exerciciosvisualmix.api.service;

import com.example.exerciciosvisualmix.api.dto.AddressResponseDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AddressServiceIntegrationTest {

    AddressService addressService = new AddressService();

    @Test
    void deveRetornarDTOCorretamente() {
        AddressResponseDTO address = addressService.getAddress("01001000");

        assertEquals("01001-000", address.getCep());
        assertEquals("Praça da Sé", address.getLogradouro());
        assertEquals("lado ímpar", address.getComplemento());
        assertEquals("Sé", address.getBairro());
        assertEquals("São Paulo", address.getLocalidade());
        assertEquals("SP", address.getUf());
        assertEquals("3550308", address.getIbge());
    }

    @Test
    void deveRetornarDTOComValoresNulosQuandoCepInexistente() {
        AddressResponseDTO address = addressService.getAddress("00000000");

        assertNull(address.getCep());
    }

    @Test
    void deveRetornarNullQuandoCepInvalido() {
        AddressResponseDTO address = addressService.getAddress("oemoifm");

        assertNull(address);
    }
}