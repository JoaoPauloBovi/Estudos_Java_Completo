package Fundamentos;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {

        double a = 1; //conversao implicita
        System.out.println(a);

        float b = (float) 1.231234151245; //conversao explicita (CAST)
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; //explicita (CAST)
        System.out.println(d);

    }
}
