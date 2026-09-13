package Classes;

import Interface.Animal;

public class OvelhaMae implements Animal {

    public int id;
    public String nome;
    public String raca;
    public int idade;

    public OvelhaMae(int id, String nome, String raca, int idade) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    @Override
    public void coletarProduto() {
        System.out.println(nome + " produziu lã!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: Mééé!");
    }
}
