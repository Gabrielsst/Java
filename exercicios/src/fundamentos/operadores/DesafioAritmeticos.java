package fundamentos.operadores;

public class DesafioAritmeticos {
    public static void main(String[] args) {
        int numA = (int) Math.pow(6*(3+2), 2);
        int primeiraFracao = numA/(3 * 2);

        int segundaFracao = (int) Math.pow(((1 - 5)
                * (2 - 7)) / 2, 2);

        int numeradorEquacao = (int) Math.pow(primeiraFracao
                - segundaFracao, 3);

        int denominadorEquacao = (int) Math.pow(10, 3);

        int resultado = numeradorEquacao / denominadorEquacao;
        System.out.println("O resultado é " + resultado);
    }
}
