package oo.composicao.desafio;

import java.util.LinkedList;
import java.util.List;

public class Cliente {

    String nome;
    List<Compra> compras = new LinkedList<>();

    Cliente(String nome){
        this.nome = nome;
    }

    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }
    double ObterValorTotal(){
        double total = 0;

        for (Compra compra:compras){
            total += compra.obterValorTotal();
        }

        return total;
    }
}
