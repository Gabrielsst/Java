package oo.heranca.desafio;

public class Carro {

    protected final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual;

    protected Carro (int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){
        int delta = 5;
        if (velocidadeAtual + delta >= VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
        else{
            velocidadeAtual += delta;
        }
    }

    public void frear(){
        if (this.velocidadeAtual >= 0){
            this.velocidadeAtual -= 5;
        }
    }

    public String toString() {
        return "Velocidade Atual é " + velocidadeAtual + "Km/h.";
    }
}
