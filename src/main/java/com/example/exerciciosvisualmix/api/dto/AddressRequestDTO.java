package com.example.exerciciosvisualmix.api.dto;

public class AddressRequestDTO {
    private String cep;
    private String date;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
