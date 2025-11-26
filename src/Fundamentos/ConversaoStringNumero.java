package Fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {

        // Abre uma janela para digitar
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");

        String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");

        System.out.println(valor1 + valor2);

        // Usar o .parseDouble passa o numero para String
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;

        System.out.println("Soma é " + soma);
        System.out.println("Média é " + soma / 2);

    }

    public static class Aritmeticos {
        public static void main(String[] args) {

            System.out.println(2+3);

            var x = 34.56;
            double y = 2.2;

            System.out.println(x + y);
            System.out.println(x - y);
            System.out.println(x * y);
            System.out.println(x / y);

            int a = 8;
            int b = 3;

            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a / (double) b);
            System.out.println(a / (float) b);

            //módulo = resto da divisão
            System.out.println(a % b);
            System.out.println(8 % 3);

        }
    }
}
