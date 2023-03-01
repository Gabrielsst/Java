package arrays;

public class ExercicioForeach {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        double totalAlunoA = 0;
        for (double nota: notasAlunoA) {
            totalAlunoA += nota;
        }

        System.out.println(totalAlunoA / notasAlunoA.length);
    }
}
