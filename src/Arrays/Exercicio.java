package Arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notaAlunoA = new double[3];
        notaAlunoA[0] = 7.9;
        notaAlunoA[1] = 8;
        notaAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notaAlunoA));
     
        double totalAlunoA = 0;
        for (int i = 0; i < notaAlunoA.length; i++) {
            totalAlunoA += notaAlunoA[i];
        }
        System.out.println(totalAlunoA / notaAlunoA.length);
    }
}
