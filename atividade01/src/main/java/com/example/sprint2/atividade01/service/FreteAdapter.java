package com.example.sprint2.atividade01.service;

import org.springframework.stereotype.Service;

@Service("externa")
public class FreteAdapter implements FreteStrategy{
    private final TransportadoraExterna transportadoraExterna;

    public FreteAdapter(TransportadoraExterna transportadoraExterna) {
        this.transportadoraExterna = transportadoraExterna;
    }

    @Override
    public double calcular(double valor){
        return transportadoraExterna.calcular(valor);
    }

    @Override
    public String modalidade() {
        return transportadoraExterna.modalidade();
    }
}
