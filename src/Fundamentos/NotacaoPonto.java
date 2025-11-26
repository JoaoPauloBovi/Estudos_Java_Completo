package Fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        double a = 2.3;
        String s = "Bom dia X";
        s = s.replace("X", "Senhor");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String b = "Bom dia x"
                .replace("x", "Jp")
                .concat(" bovi")
                .toUpperCase();
        System.out.println(s + b);

    }
}
