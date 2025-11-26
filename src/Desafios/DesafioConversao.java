package Desafios;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salário 1: ");
        String salario1 = entrada.nextLine().replace(",",".");

        //Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salário 2: ");
        String salario2 = entrada.nextLine().replace(",",".");


        //Scanner entrada3 = new Scanner(System.in);
        System.out.println("Digite o salário 3: ");
        String salario3 = entrada.nextLine().replace(",",".");


        double valor1 = Double.parseDouble(salario1);
        double valor2 = Double.parseDouble(salario2);
        double valor3 = Double.parseDouble(salario3);

        double soma = valor1 + valor2 + valor3;

        System.out.println("Soma é " + soma);
        System.out.println("Média é " + soma / 3);

        entrada.close();
    }
}
