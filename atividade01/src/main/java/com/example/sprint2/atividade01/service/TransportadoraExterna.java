package com.example.sprint2.atividade01.service;

import org.springframework.stereotype.Service;

@Service("externo")
public class TransportadoraExterna implements FreteStrategy{
    @Override
    public double calcular(double peso){
        return peso + (peso * 3.0);
    }

    @Override
    public String modalidade() {
        return "Externa";
    }
}
