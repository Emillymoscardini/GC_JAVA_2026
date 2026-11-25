package com.cybertron.autobot;

/**
 *  armazena informações permitindo consultar e atualizar a energia do Autobot da base!
 */

public class Autobot {

    private String nome;
    private double energia;
    private int nivel;

    // Responsável por fazer a criação do Autobot e suas características
    public Autobot(String nome, double energia, int nivel) {
        this.nome = nome;
        this.energia = energia;
        this.nivel = nivel;
    }
    public String getNome() {
        return nome;
    }

    public double getEnergia() {
        return energia;
    }

    public int getNivel() {
        return nivel;
    }

    public void adicionarEnergia(double quantidade) {
        energia += quantidade;
    }
}