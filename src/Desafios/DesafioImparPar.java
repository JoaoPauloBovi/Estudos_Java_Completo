package Desafios;

import java.util.Scanner;

public class DesafioImparPar {
    public static void main(String[] args) {

        //1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é Par");
        } else {
            System.out.println("O número é Impar");
        }
        entrada.close();
    }
}
