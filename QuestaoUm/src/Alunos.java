public class Alunos {

    int matricula;
    String nome;
    double nota1;
    double nota2;
    double notaTrabalho;

    public Alunos(int matricula, String nome, double nota1, double nota2, double notaTrabalho){
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;

    }

    public double media(){
        return ((nota1 * 2.5) + (nota2 * 2.5) + (notaTrabalho * 2) ) / 7;

    }

    public double quantoFalta() {

        if (media() >= 7) {
            return 0;
        } else {
            return 14 - media();
        }

    }

    public void mostrarDados() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Precisa tirar para passar: " + quantoFalta());

    }

}