package oo.composicao.desafio;

public class clienteTeste {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 100, 1);
        compra1.adicionarItem("Notebook", 2, 2000);

        Compra compra2 = new Compra();
        compra1.adicionarItem("Caderno", 10, 10);
        compra1.adicionarItem("Impressora", 1, 1000);

        Cliente cliente = new Cliente("Maria Julia Moraes");
        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        System.out.println(cliente.ObterValorTotal());
    }
}
