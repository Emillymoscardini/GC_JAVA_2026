import Classes.MontarPicareta;
import java.util.Scanner;

public class oldStevePOO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MontarPicareta picareta =
                new MontarPicareta("prata", 80, 45);

        MontarPicareta picareta2 =
                new MontarPicareta("ouro", 100, 75);

        MontarPicareta picareta3 =
                new MontarPicareta("diamante", 150, 105);

        MontarPicareta picareta4 =
                new MontarPicareta("netherita", 200, 150);

        picareta.apresentar();
        picareta2.apresentar();
        picareta3.apresentar();
        picareta4.apresentar();


        System.out.println("===Picaretas do velho Steve===");
        System.out.println("1 - Picareta de prata");
        System.out.println("2 - Picareta de ouro");
        System.out.println("3 - Picareta de diamante");
        System.out.println("4 - Picareta de netherita");
        System.out.println();


        System.out.print("Escolha uma picareta: ");
        int opcao = scanner.nextInt();

        MontarPicareta escolhida;

        switch (opcao) {
            case 1:
                escolhida = picareta;
                break;

            case 2:
                escolhida = picareta2;
                break;

            case 3:
                escolhida = picareta3;
                break;

            case 4:
                escolhida = picareta4;
                break;

            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }

        System.out.print("Quantos blocos deseja minerar? ");
        int quantidade = scanner.nextInt();


        escolhida.minerar(quantidade);
        System.out.print("Quanto deseja reparar? ");
        int quantidadeReparo = scanner.nextInt();
        escolhida.reparar(quantidadeReparo);
        scanner.close();

    }
    }
