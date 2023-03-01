package lambdas;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {

        Produto p = new Produto("iPad", 3235.89, 0.13);

        Function <Produto, Double> precoReal = produto -> {
            double ValorComDesconto = produto.preco * (1 - produto.desconto);
            return ValorComDesconto;
        };

        UnaryOperator <Double> impostoMunicipal = preco -> preco >= 2500
                ? preco * (1 + 0.085) : preco;

        UnaryOperator <Double> frete = preco -> preco >= 3000
                ? preco + 100 : preco + 50;

        Function <Double, String> precoArredondado = preco -> {
            DecimalFormat df = new DecimalFormat("0.00");
            df.setRoundingMode(RoundingMode.HALF_UP);
            return df.format(preco);};

        UnaryOperator <String> precoFormatado = preco -> ("R$" + preco)
                .replace(".", ",");

        System.out.println("O preço final é " + precoReal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(precoArredondado)
                .andThen(precoFormatado)
                .apply(p));
    }
}
