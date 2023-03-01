package oo.composicao.desafio;

import java.util.LinkedList;
import java.util.List;

public class Compra {

    List <Item> itens = new LinkedList<>();

    void adicionarItem(String nome, int qtd, double preco){
        this.itens.add(new Item(qtd, new Produto(nome, preco)));
    }
    double obterValorTotal(){
        double total = 0;

        for (Item item:itens) {
           total += (item.qtd * item.produto.Preco);
        }

        return total;
    }
}
