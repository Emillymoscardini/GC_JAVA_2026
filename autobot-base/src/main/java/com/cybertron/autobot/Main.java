package com.cybertron.autobot;

/**
 *  Demonstra o cadastro, a busca, o reparo e a classificação dos robôs
 */

public class Main {

    public static void main(String[] args) {

        GerenciadorAutobots gerenciador = new GerenciadorAutobots();

        //Criação dos Autobots com seus níveis de energia e experiência.
        Autobot optimus = new Autobot("Optimus Prime", 850.0, 10);
        Autobot bumblebee = new Autobot("Bumblebee", 320.0, 5);
        Autobot ratchet = new Autobot("Ratchet", 180.0, 7);

        gerenciador.adicionar(optimus);
        gerenciador.adicionar(bumblebee);
        gerenciador.adicionar(ratchet);

        System.out.println("Energon total: " + gerenciador.calcularEnergonTotal());


        Autobot encontrado = gerenciador.buscar("Bumblebee");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getNome());
        } else {
            System.out.println("Autobot nao encontrado");
        }

        gerenciador.reparar(ratchet);
        System.out.println("Energon do Ratchet: " + ratchet.getEnergia());
        System.out.println("Classificacao: " + gerenciador.classificar(ratchet));
    }
}