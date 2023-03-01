package fundamentos;

/* dentro do cmd coloca jshell e da enter para entrar no interpretador do java
   e testar conceitos. */
public class Temperatura {
	public static void main(String[] args) {
		final int AJUSTE = 32;
		final double FATOR = 5/9.0;
		double fahrenheit = 86;
		
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		// Alt + seta move a linha para onde quiser
		// CTRL + ALT + seta copia a linha e cola embaixo.
		System.out.println("O resultado é " + celsius + "°C."); 
	}
}
