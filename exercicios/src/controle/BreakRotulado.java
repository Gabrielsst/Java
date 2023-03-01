package controle;

public class BreakRotulado {
    public static void main(String[] args) {

        externo: for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (i == 1){
                    /* o continue rotulado é da mesma
                       forma que o break rotulado, ou
                       seja "continue externo" no lugar
                       de "break externo" para este caso.
                    */
                    break externo;
                }
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();
        }

        System.out.println("Fim!");
    }
}
