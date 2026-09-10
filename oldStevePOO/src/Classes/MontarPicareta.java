package Classes;

public class MontarPicareta {

    public String material;
    public int forca;
    public int durabilidade;

    public MontarPicareta(String material, int forca, int durabilidade){
        this.material = material;
        this.forca = forca;
        this.durabilidade = durabilidade;
    }

    public void apresentar(){
        System.out.println("=== Fabricando picareta ===");
        System.out.println("Material: " + material);
        System.out.println("Força: " + forca);
        System.out.println("Durabilidade: " + durabilidade);
        System.out.println("Picareta de "+ material + " fabricada com sucesso!");
        System.out.println();

    }

    public void minerar(int quantidade){
        if (durabilidade <= 0) {
            System.out.println("Picareta quebrada!");
            return;
        }
        int blocosMinerados = 0;
        for (int i = 0; i < quantidade; i++)
        {
            if (durabilidade <= 0) {
            System.out.println("A picareta quebrou!"); break; }
            durabilidade--;
            blocosMinerados++;
        }
        System.out.println("Blocos minerados: " + blocosMinerados);
        System.out.println("Durabilidade restante: " + durabilidade);
        System.out.println(); }

    public void reparar(int quantidade) {
        System.out.println();
        System.out.println("=== Reparando picareta de " + material + " ===");
        System.out.println("Durabilidade atual: " + durabilidade);
        System.out.println("Quantidade a reparar: " + quantidade);

        int durabilidadeNova = durabilidade + quantidade;
        int limiteMaximo = 0;

        switch (material.toLowerCase()) {
        case "prata": limiteMaximo = 45;
        break;
        case "ouro": limiteMaximo = 75;
        break;
        case "diamante": limiteMaximo = 105;
        break;
        case "netherita": limiteMaximo = 150;
        break;
        default: limiteMaximo = 60; }
        if (durabilidadeNova > limiteMaximo) {
        System.out.println("Reparo limitado a " + limiteMaximo);
        durabilidadeNova = limiteMaximo;
    }
        durabilidade = durabilidadeNova;
        System.out.println("Durabilidade nova: " + durabilidade);
        System.out.println(); }
    }

