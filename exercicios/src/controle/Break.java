package controle;

public class Break {
    public static void main(String[] args) {

        int contador = 0;
        while(true){

            if (contador == 5){
                break;
            }
            else {
                System.out.println(contador);
                contador++;
            }
        }
    }
}
