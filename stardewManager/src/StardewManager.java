import Classes.*;
import Interface.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class StardewManager {

    static int carteira = 500;

    public static void main(String[] args) {

        VacaMae vaca = new VacaMae(112, "Katherine", "Senepol", 19);
        GalinhaMae galinha = new GalinhaMae(113, "Caroline", "Leghorn", 17);
        Pintinho pintinho = new Pintinho(114, "Stefan", "Leghorn", 4);
        Bezerro bezerrinho = new Bezerro(115, "Damon", "Senepol", 5);
        OvelhaMae ovelha = new OvelhaMae(116, "Rebekah", "Polwarth", 20);
        Cordeiro cordeirinho = new Cordeiro(117, "Niklaus", "Polwarth", 3);
        CabraMae cabra = new CabraMae(118, "Bonnie", "Boer", 18);
        Cabrito cabritinho = new Cabrito(119, "Enzo", "Boer", 2);

        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(vaca);
        animais.add(galinha);
        animais.add(pintinho);
        animais.add(bezerrinho);
        animais.add(ovelha);
        animais.add(cordeirinho);
        animais.add(cabra);
        animais.add(cabritinho);


        menuPrincipal(animais, vaca, galinha, pintinho, bezerrinho, ovelha, cordeirinho, cabra, cabritinho);
    }

    public static void animaisCurral(ArrayList<Animal> animais) {

        System.out.println("------------------------------------------------------");
        System.out.println("🐾 ANIMAIS NO CURRAL:");
        System.out.println("------------------------------------------------------");

        for (Animal animal : animais) {
            mostrarDados(animal);
            System.out.println();
            animal.coletarProduto();
            animal.emitirSom();
            System.out.println();
        }

        System.out.println("------------------------------------------------------");
    }


    public static void mostrarDados(Animal animal) {

        if (animal instanceof VacaMae) {

            VacaMae vaca = (VacaMae) animal;
            System.out.println("[ID: " + vaca.id + "] " + vaca.nome + " (Vaca)");
            System.out.println("- Raça: " + vaca.raca);
            System.out.println("- Idade: " + vaca.idade);

        } else if (animal instanceof GalinhaMae) {

            GalinhaMae galinha = (GalinhaMae) animal;
            System.out.println("[ID: " + galinha.id + "] " + galinha.nome + " (Galinha)");
            System.out.println("- Raça: " + galinha.raca);
            System.out.println("- Idade: " + galinha.idade);

        } else if (animal instanceof OvelhaMae) {

            OvelhaMae ovelha = (OvelhaMae) animal;
            System.out.println("[ID: " + ovelha.id + "] " + ovelha.nome + " (Ovelha)");
            System.out.println("- Raça: " + ovelha.raca);
            System.out.println("- Idade: " + ovelha.idade);

        } else if (animal instanceof CabraMae) {

            CabraMae cabra = (CabraMae) animal;

            System.out.println("[ID: " + cabra.id + "] " + cabra.nome + " (Cabra)");
            System.out.println("- Raça: " + cabra.raca);
            System.out.println("- Idade: " + cabra.idade);
        }
    }


    public static void comprarProdutos() {

        Scanner scanner = new Scanner(System.in);

        int opc;

        do {
            System.out.println();
            System.out.println("Produtos disponíveis na vendinha:");
            System.out.println("1 - Ovos R$10");
            System.out.println("2 - Leite R$5");
            System.out.println("3 - Leite de cabra R$7");
            System.out.println("4 - Leite de soja R$8");
            System.out.println("5 - Lã R$15");
            System.out.println("6 - Sair");

            opc = scanner.nextInt();

            switch (opc) {

                case 1:

                    if (carteira >= 10) {
                        carteira -= 10;
                        System.out.println();
                        System.out.println("Ovos comprados!");
                        System.out.println("Saldo: R$" + carteira);

                    } else {

                        System.out.println("Dinheiro insuficiente!");
                    }

                    break;


                case 2:

                    if (carteira >= 5) {
                        carteira -= 5;
                        System.out.println();
                        System.out.println("Leite comprado!");
                        System.out.println("Saldo: R$" + carteira);

                    } else {

                        System.out.println("Dinheiro insuficiente!");
                    }

                    break;


                case 3:

                    if (carteira >= 7) {
                        carteira -= 7;
                        System.out.println();
                        System.out.println("Leite de cabra comprado!");
                        System.out.println("Saldo: R$" + carteira);

                    } else {

                        System.out.println("Dinheiro insuficiente!");
                    }

                    break;


                case 4:

                    if (carteira >= 8) {
                        carteira -= 8;
                        System.out.println();
                        System.out.println("Leite de soja comprado!");
                        System.out.println("Saldo: R$" + carteira);

                    } else {

                        System.out.println("Dinheiro insuficiente!");
                    }

                    break;


                case 5:

                    if (carteira >= 15) {
                        carteira -= 15;
                        System.out.println();
                        System.out.println("Lã comprada!");
                        System.out.println("Saldo: R$" + carteira);

                    } else {

                        System.out.println("Dinheiro insuficiente!");
                    }
                    break;


                case 6:
                    break;


                default:
                    System.out.println("Opção inválida!");
            }

        } while (opc != 6);
    }

    public static void comprarAnimais(VacaMae vaca, GalinhaMae galinha, Pintinho pintinho, Bezerro bezerrinho, OvelhaMae ovelha, Cordeiro cordeirinho, CabraMae cabra, Cabrito cabritinho) {

        Scanner scanner = new Scanner(System.in);

        int opc;

        do {

            System.out.println("---------------------------------------------");
            System.out.println("          ANIMAIS DISPONÍVEIS");
            System.out.println("---------------------------------------------");

            System.out.println("1 - Vaca " + vaca.nome + " - R$150");
            System.out.println("2 - Galinha " + galinha.nome + " - R$50");
            System.out.println("3 - Pintinho " + pintinho.nome + " - R$25");
            System.out.println("4 - Bezerro " + bezerrinho.nome + " - R$100");
            System.out.println("5 - Ovelha " + ovelha.nome + " - R$130");
            System.out.println("6 - Cordeiro " + cordeirinho.nome + " - R$80");
            System.out.println("7 - Cabra " + cabra.nome + " - R$120");
            System.out.println("8 - Cabrito " + cabritinho.nome + " - R$70");
            System.out.println("9 - Sair");

            System.out.println("---------------------------------------------");

            opc = scanner.nextInt();

            switch (opc) {

                case 1:
                    if (carteira >= 150) {
                        carteira -= 150;
                        System.out.println(vaca.nome + " foi comprado!");
                        System.out.println("Saldo: R$" + carteira);

                    } else {

                        System.out.println("Dinheiro insuficiente!");
                    }

                    break;


                case 2:

                    if (carteira >= 50) {
                        carteira -= 50;
                        System.out.println(galinha.nome + " foi comprada!");
                        System.out.println("Saldo: R$" + carteira);

                    } else {

                        System.out.println("Dinheiro insuficiente!");
                    }

                    break;


                case 3:

                    if (carteira >= 25) {
                        carteira -= 25;
                        System.out.println(pintinho.nome + " foi comprado!");
                        System.out.println("Saldo: R$" + carteira);

                    } else {

                        System.out.println("Dinheiro insuficiente!");
                    }

                    break;


                case 4:

                    if (carteira >= 100) {
                        carteira -= 100;
                        System.out.println(bezerrinho.nome + " foi comprado!");
                        System.out.println("Saldo: R$" + carteira);

                    } else {

                        System.out.println("Dinheiro insuficiente!");
                    }

                    break;


                case 5:

                    if (carteira >= 130) {
                        carteira -= 130;
                        System.out.println(ovelha.nome + " foi comprada!");
                        System.out.println("Saldo: R$" + carteira);

                    } else {

                        System.out.println("Dinheiro insuficiente!");
                    }

                    break;


                case 6:

                    if (carteira >= 80) {
                        carteira -= 80;
                        System.out.println(cordeirinho.nome + " foi comprado!");
                        System.out.println("Saldo: R$" + carteira);

                    } else {

                        System.out.println("Dinheiro insuficiente!");
                    }

                    break;


                case 7:

                    if (carteira >= 120) {
                        carteira -= 120;
                        System.out.println(cabra.nome + " foi comprada!");
                        System.out.println("Saldo: R$" + carteira);

                    } else {

                        System.out.println("Dinheiro insuficiente!");
                    }

                    break;


                case 8:

                    if (carteira >= 70) {
                        carteira -= 70;
                        System.out.println(cabritinho.nome + " foi comprado!");
                        System.out.println("Saldo: R$" + carteira);

                    } else {
                        System.out.println("Dinheiro insuficiente!");
                    }

                    break;


                case 9:
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opc != 9);
    }

    public static void venderAnimais() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Vender animais ===");

        System.out.println("1 - Vaca - R$150");
        System.out.println("2 - Galinha - R$50");
        System.out.println("3 - Pintinho - R$25");
        System.out.println("4 - Bezerro - R$100");
        System.out.println("5 - Ovelha - R$130");
        System.out.println("6 - Cordeiro - R$80");
        System.out.println("7 - Cabra - R$120");
        System.out.println("8 - Cabrito - R$70");
        System.out.println("9 - Voltar");

        int pet = scanner.nextInt();

        switch (pet) {

            case 1:
                carteira += 150;
                System.out.println("Vaca vendida por R$150.");
                break;

            case 2:
                carteira += 50;
                System.out.println("Galinha vendida por R$50.");
                break;

            case 3:
                carteira += 25;
                System.out.println("Pintinho vendido por R$25.");
                break;

            case 4:
                carteira += 100;
                System.out.println("Bezerro vendido por R$100.");
                break;

            case 5:
                carteira += 130;
                System.out.println("Ovelha vendida por R$130.");
                break;

            case 6:
                carteira += 80;
                System.out.println("Cordeiro vendido por R$80.");
                break;


            case 7:
                carteira += 120;
                System.out.println("Cabra vendida por R$120.");
                break;


            case 8:
                carteira += 70;
                System.out.println("Cabrito vendido por R$70.");
                break;


            case 9:
                break;

            default:
                System.out.println("Opção inválida!");
        }

        System.out.println("Seu saldo agora é: R$" + carteira);
    }

    public static void comercio(VacaMae vaca, GalinhaMae galinha, Pintinho pintinho, Bezerro bezerrinho, OvelhaMae ovelha, Cordeiro cordeirinho, CabraMae cabra, Cabrito cabritinho) {
        Scanner scanner = new Scanner(System.in);

        int op;

        do {

            System.out.println("------------------------------------------------------");
            System.out.println("                 VENDINHA STARDEW");
            System.out.println("------------------------------------------------------");

            System.out.println("1 - Consultar carteira");
            System.out.println("2 - Comprar produtos");
            System.out.println("3 - Comprar animais");
            System.out.println("4 - Vender ração");
            System.out.println("5 - Vender animais");
            System.out.println("6 - Voltar");

            op = scanner.nextInt();

            switch (op) {

                case 1:
                    System.out.println("Seu saldo total é: R$" + carteira);
                    break;

                case 2:
                    comprarProdutos();
                    break;

                case 3:
                    comprarAnimais(vaca, galinha, pintinho, bezerrinho, ovelha, cordeirinho, cabra, cabritinho);
                    break;

                case 4:
                    System.out.println();
                    System.out.println("Você vendeu um saco de ração por R$20.");
                    carteira += 20;
                    System.out.println("Seu saldo agora é: R$" + carteira);
                    break;

                case 5:
                    venderAnimais();
                    break;

                case 6:
                    System.out.println("Volte sempre!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (op != 6);
    }

    public static void menuPrincipal(ArrayList<Animal> animais, VacaMae vaca, GalinhaMae galinha, Pintinho pintinho, Bezerro bezerrinho, OvelhaMae ovelha, Cordeiro cordeirinho, CabraMae cabra, Cabrito cabritinho) {

        Scanner scanner = new Scanner(System.in);

        int op;

        do {

            System.out.println();
            System.out.println("--- MENU PRINCIPAL ---");
            System.out.println("1 - Ver animais do curral");
            System.out.println("2 - Comércio");
            System.out.println("3 - Consultar carteira");
            System.out.println("4 - Sair");

            System.out.print("Escolha uma opção: ");

            op = scanner.nextInt();

            switch (op) {

                case 1:
                    animaisCurral(animais);
                    break;


                case 2:
                    comercio(vaca, galinha, pintinho, bezerrinho, ovelha, cordeirinho, cabra, cabritinho);
                    break;


                case 3:
                    System.out.println("Seu saldo é: R$" + carteira);
                    break;


                case 4:
                    System.out.println("Saindo do Stardew Manager...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (op != 4);
    }
}