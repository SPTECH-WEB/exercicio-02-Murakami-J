package com.example.sprint2.atividade01.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreteService {
    private final List<FreteStrategy> estrategias;
    public FreteService(List<FreteStrategy> estrategias) {
        this.estrategias = estrategias;
    }

    public double calcular(String tipo, double peso){
        return estrategias.stream()
                .filter(e -> e.modalidade().equalsIgnoreCase(tipo))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Modalidade de Frete inválido"))
                .calcular(peso);
    }
}
