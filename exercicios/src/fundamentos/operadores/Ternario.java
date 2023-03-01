package fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 8.6;
        String resultadoFinal = media >= 7 ? "aprovado" : media >= 5 ? "em recuperação" : "reprovado";

        System.out.printf("O aluno está %s", resultadoFinal);

        double nota = 9.9;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "Sim." : "Não.";

        System.out.printf("\nTem desconto? %s", resultado);
    }
}
