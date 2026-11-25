package com.cybertron.autobot;

import java.util.ArrayList;
import java.util.List;

/**
 * Faz o processo de adicionar, localizar, reparar e classificar os robôs.
 */



public class GerenciadorAutobots {

    // Lista que armazena os Autobots cadastrados na base.
    private List<Autobot> lista = new ArrayList<>();

    // Adiciona um novo Autobot para a lista de robos.
    public void adicionar(Autobot robo) {
        lista.add(robo);
    }

    // Retorna os elementos da lista.
    public double calcularEnergonTotal() {
        double total = 0;
        for (int i = 0; i < lista.size(); i++) {
            total += lista.get(i).getEnergia();
        }
        return total;
    }


    // Procura um Autobot pelo nome
    public Autobot buscar(String nome) {
        for (Autobot robo : lista) {
            if (robo.getNome().equals(nome)) {
                return robo;
            }
        }
        return null;
    }

    // Nomeia os valores para eles terem um contexto dentro do código.
    private static final double ENERGIA_MINIMA_ELITE = 500;
    private static final double ENERGIA_MINIMA_PADRAO = 200;
    private static final double ENERGIA_REPARO = 100;

    public void reparar(Autobot robo) {
        try {
            if (robo.getEnergia() < 0) {
                throw new Exception("Energia negativa");
            }
            robo.adicionarEnergia(ENERGIA_REPARO);
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro! " + ex.getMessage());
        }
    }

    // Classifica o Autobot conforme sua quantidade de energia
    public String classificar(Autobot robo) {
        if (robo.getEnergia() > ENERGIA_MINIMA_ELITE) {
            return "ELITE";
        } else if (robo.getEnergia() > ENERGIA_MINIMA_PADRAO) {
            return "PADRAO";
        } else {
            return "RESERVA";
        }
    }


}
