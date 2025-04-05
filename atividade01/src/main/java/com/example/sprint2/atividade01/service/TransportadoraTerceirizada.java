package com.example.sprint2.atividade01.service;

import org.springframework.stereotype.Component;

@Component
public class TransportadoraTerceirizada implements FreteStrategy{
    @Override
    public double calcular(double peso){
        return peso + (peso * 2.2);
    }

    @Override
    public String modalidade() {
        return "Terceirizada";
    }
}
