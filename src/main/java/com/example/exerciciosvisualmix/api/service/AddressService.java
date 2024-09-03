package com.example.exerciciosvisualmix.api.service;

import com.example.exerciciosvisualmix.api.dto.AddressResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class AddressService {

    private final RestTemplate restTemplate = new RestTemplate();

    public AddressResponseDTO getAddress(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        try {
            return restTemplate.getForObject(url, AddressResponseDTO.class);
        } catch (HttpClientErrorException e) {
            if (e.getStatusCode() == HttpStatus.BAD_REQUEST) {
                return null;
            }
            throw e;
        }
    }

}
