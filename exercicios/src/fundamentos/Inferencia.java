package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		/* Pode ser criado como var e esperar que ele infira
		   o tipo de valor, por�m ele deve ser inicializado 
		   no momento de sua declara��o. */
		var a = 4.5;
		System.out.println(a);
		
		double b;
		b = 123.65;
		System.out.println(b);
		
		/* 
		   - Inteiros podem ser colocados em doubles, mas o 
		   inverso n�o funciona. 
		   - Depois de inferido o tipo n�o pode ser modificado. 
		*/
	}
}
