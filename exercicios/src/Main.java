import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //exercicio 1
        String nome = "Emilly";
        System.out.println("Seu nome é: " + nome);

        //exercicio 2
        System.out.println("Digite um número: ");
        int numero1 = scanner.nextInt();


        System.out.print("Digite mais um número: ");
        int numero2 = scanner.nextInt();

        System.out.println("O primeiro número é: " + numero1 + " o segundo número é: " + numero2);

        //exercicio 3

        System.out.println("Digite um número: ");
        int numeroMn = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int numeroMn1 = scanner.nextInt();

        System.out.println("Digite mais um número; ");
        int numeroMn2 = scanner.nextInt();

        int soma = numeroMn + numeroMn1 + numeroMn2;
        int media = soma / 3;

        if (numeroMn > numeroMn1 && numeroMn > numeroMn2 ) {
            System.out.println("O maior número é: " + numeroMn);
        }else if(numeroMn1 > numeroMn && numeroMn1 > numeroMn2){
            System.out.println("O maior número  é: " + numeroMn1);
        } else if(numeroMn2 > numeroMn1 && numeroMn2 > numeroMn){
            System.out.println("O número maior é: " + numeroMn2);
        } else{
            System.out.println("Erro!");
        }

        if (numeroMn < numeroMn1 && numeroMn < numeroMn2 ) {
            System.out.println("O menor número é: " + numeroMn);
        }else if(numeroMn1 < numeroMn && numeroMn1 < numeroMn2){
            System.out.println("O menor número é: " + numeroMn1 );
        } else if (numeroMn2 < numeroMn1 && numeroMn2 < numeroMn1){
            System.out.println("o número menor é: " + numeroMn2);
        }else{
            System.out.println("Erro!");
        }

        System.out.println("A média é: " + media);

        //exercicio4

        double salarioMinimo = 1320;
        System.out.println("Qual o seu salário?");
        double salario = scanner.nextInt();

        double conta = salario / salarioMinimo;

        System.out.println("O usuário recebe R$ " + Math.round(conta) + " salários mínimos.");

        //exercicio5

        int segundos = 25;

        int minutos = 1;

        int horas = 13;

        int segundosPassados = (horas * 3600) + (minutos * 60) + segundos;

        int segundosRestantes = 86400 - segundosPassados;

        System.out.println("Segundos que já passaram desde 00:00: " + segundosPassados);
        System.out.println("Segundos que faltam para 00:00: " + segundosRestantes);
        //exercicio 6

        System.out.println("Qual a sua idade? ");
        int idade = scanner.nextInt();

        if(idade < 16){
            System.out.println("Você não pode votar! ");
        } else if(idade > 15 && idade > 65){
            System.out.println("Você pode votar! Mas é facultativo, então é opcional!");
        } else if(idade > 17 && idade < 66){
            System.out.println("Você pode e deve votar! ");
        } else{
            System.out.println("Erro");
        }

        //exercicio 7

        System.out.println("Qual sua idade? ");
        int idadeUsuario = scanner.nextInt();

        System.out.println("Qual seu salário? ");
        double salarioUsuario = scanner.nextDouble();

        if (idadeUsuario >= 18 && salarioUsuario >= 2000){
            System.out.println("Você pode comprar um carro!");
        }else{
            System.out.println("Você não pode comprar um carro!");
        }

        //exercicio 8

        System.out.println("Gestante - idoso - PCD - nenhuma das alternativas (NDA) ");
        System.out.println("Selecione uma opção");
        String op = scanner.next();
        scanner.nextLine();

        if (op == "Gestante" || op == "idoso" || op == "PCD" ){
            System.out.println("Você tem prioridade na fila!");
        } else if (op == "NDA"){
            System.out.println("Você não tem prioridade na fila!");
        } else {
            System.out.println("Erro!");
        }

    }
}