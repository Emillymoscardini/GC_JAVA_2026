package Classes;

import Interface.Animal;

public class CabraMae implements Animal {

    public int id;
    public String nome;
    public String raca;
    public int idade;

    public CabraMae(int id, String nome, String raca, int idade) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    @Override
    public void coletarProduto() {
        System.out.println(nome + " produziu leite de cabra!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: Mééé!");
    }
}