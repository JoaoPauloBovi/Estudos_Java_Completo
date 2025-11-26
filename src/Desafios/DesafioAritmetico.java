package Desafios;

public class DesafioAritmetico {
    public static void main(String[] args) {
        //        int a = 2 + 3 * 4;
//        int b = (int) Math.pow(a, 3); //= a elevado a 3º potencia
//        double c =  Math.pow(a, 3);
//
//        System.out.println(b);
//        System.out.println(c);

        int a = 6;
        int b = 3;
        int c = 2;
        int d = 1;
        int e = 5;
        int f = 2;
        int g = 7;

        int conta = (b + c) * a;
        double conta1 = Math.pow(conta, 2);
        double conta2 = conta1 / 3 * 2;

        int sub = d - e;
        int sub2 = f - g;

        int mult = (sub * sub2) / 2;
        double mult2 = Math.pow(mult, 2);

        double resultado = conta2 - mult2;
        double resultado2 = Math.pow(resultado, 3);
        double potencia = Math.pow(10, 3);

        double resultadoFinal = resultado2 / potencia;

        System.out.println(resultadoFinal);

    }
}
