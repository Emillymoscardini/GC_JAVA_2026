package com.cybertron.forja.model;
/**
 * Representa um Autobot da base.
 *
 * <p>Esta é uma classe de modelo: ela só carrega dados.
 * Não tem lógica de negócio e não sabe nada sobre banco de dados.</p>
 */
public class Autobot {
    private final String nome;
    private double energon;
    /**
     * Cria um Autobot.
     *
     * @param nome nome do Autobot
     * @param energon quantidade inicial de Energon
     */
    public Autobot(String nome, double energon) {
        this.nome = nome;
        this.energon = energon;
    }
    public String getNome() {
        return nome;
    }
    public double getEnergon() {
        return energon;
    }
    public void adicionarEnergon(double quantidade) {
        this.energon += quantidade;
    }
}