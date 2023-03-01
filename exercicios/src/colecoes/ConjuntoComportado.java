package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        Set<String> alunosAprovados = new TreeSet<>();
        alunosAprovados.add("Carlos");
        alunosAprovados.add("Luiz");
        alunosAprovados.add("Luana");
        alunosAprovados.add("Sabrina");

        for (String nome: alunosAprovados) {
            System.out.println(nome);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(120);
        nums.add(39);
        nums.add(40);

        for (int numero: nums){
            System.out.println(numero);
        }
    }
}
