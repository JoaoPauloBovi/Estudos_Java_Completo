package Fundamentos;

import java.util.Scanner;

public class TipoString {
    public static void main(String[] args) {


        System.out.println("Olá, galero".charAt(2)); // numero do caractere na palavra

        String s = "Boa tarde";
        s = s.toUpperCase();
        System.out.println(s.concat((" !!!")));
        System.out.println(s + " !!!");
        System.out.println(s.startsWith("BOA"));
        System.out.println(s.toLowerCase().startsWith("Boa"));
        System.out.println(s.length());
        System.out.println(s.endsWith("TARDE"));
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "João";
        var sobreNome = "Bovi";
        var idade = 30;
        var salario = 11000.859;
        var fraseCompleta = nome + sobreNome + idade + salario;

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobreNome + "\nidade " + idade + "\nSalário R$: " + salario + "\n\n");

        System.out.printf("O Senhor %s %s tem %d anos e recebe R$ %.2f reais.\n\n", nome, sobreNome, idade, salario); //%.2f < quantas casas decimais

        System.out.println(fraseCompleta.contains("ã"));

        System.out.printf("%d %d %d %d %d",
                1, 2, 3, 4, 5);
        // na ordem %d = inteiro,
        // %f = flutuante
        // %s = string
        // "%.1f", 1234.124 = vai mostar apenas 1 apos o ponto
        //"%.1fn" com o "n" quebra linha

        Scanner entrada = new Scanner(System.in); //Systen.in = Entrada do sistema
        entrada.nextLine();
        System.out.println("Digite o seu nome: ");

    }
}
