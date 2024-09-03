package com.example.exerciciosvisualmix.api.controller;

import com.example.exerciciosvisualmix.api.dto.AddressResponseDTO;
import com.example.exerciciosvisualmix.api.dto.AddressRequestDTO;
import com.example.exerciciosvisualmix.api.service.AddressService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {


    private final AddressService apiViaCep = new AddressService();

    @Value("${token.security}")
    private String tokenAuthorization;

    @PostMapping("/address/search")
    public ResponseEntity<?> searchAddress(
            @RequestHeader(HttpHeaders.AUTHORIZATION) String token,
            @RequestBody AddressRequestDTO request
    ) {

        if (!tokenAuthorization.equals(token)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Token não autorizado.");
        }

        AddressResponseDTO address = apiViaCep.getAddress(request.getCep());

        if (address == null || address.getCep() == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("CEP não encontrado");
        }

        return ResponseEntity.ok(address);
    }

}
