package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		/* Pode ser criado como var e esperar que ele infira
		   o tipo de valor, porém ele deve ser inicializado 
		   no momento de sua declaração. */
		var a = 4.5;
		System.out.println(a);
		
		double b;
		b = 123.65;
		System.out.println(b);
		
		/* 
		   - Inteiros podem ser colocados em doubles, mas o 
		   inverso não funciona. 
		   - Depois de inferido o tipo não pode ser modificado. 
		*/
	}
}
