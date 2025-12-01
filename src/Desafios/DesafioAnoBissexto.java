package Desafios;

import java.util.Scanner;

public class DesafioAnoBissexto {
    public static void main(String[] args) {

        //2. Criar um programa informa se o ano atual é um ano bissexto

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos dias tem o ano atual (365 ou 366) ? ");
        int ano = entrada.nextInt();

        if (ano % 2 == 0) {
            System.out.println("O ano é bissexto");

        } else {
            System.out.println(" O ano é comum");
        }
        entrada.close();
    }
}
