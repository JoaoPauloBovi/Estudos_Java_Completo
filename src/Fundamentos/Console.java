package Fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //Systen.in = Entrada do sistema
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine(); // atribui o que o usuário colocou na entrada em uma String

        System.out.print("Digite o seu cargo: ");
        String cargo = entrada.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();
        //pega inteiro e armazena int, nao pode ser String


        System.out.printf("Olá, %s !!! você tem %d e está esta no cargo de %s. ", nome, idade, cargo);

        entrada.close();

    }
}
