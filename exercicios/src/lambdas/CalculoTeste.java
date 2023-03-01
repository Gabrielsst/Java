package lambdas;

import org.w3c.dom.ls.LSOutput;

public class CalculoTeste {

    public static void main(String[] args) {

        Calculo calc = (x, y) -> { return x + y; };
        System.out.println(calc.executar(3,2));

        calc = (x, y) -> x * y;
        System.out.println(calc.executar(3,2));

        calc = (x, y) -> x / y;
        System.out.println(calc.executar(3,2));

        calc = (x, y) -> x - y;
        System.out.println(calc.executar(3,2));
    }
}
