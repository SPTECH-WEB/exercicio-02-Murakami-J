package com.example.sprint2.atividade01.service;

import org.springframework.stereotype.Component;

@Component
public class EntregaEconomica implements FreteStrategy {
    @Override
    public double calcular(double peso) {
        return peso + (peso * 1.5);
    }

    @Override
    public String modalidade() {
        return "Economica";
    }
}
