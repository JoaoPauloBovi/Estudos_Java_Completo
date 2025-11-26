package Fundamentos;

public class ConversaoNumeroString {
    public static void main(String[] args) {

        Integer num1 = 10000;
        System.out.println(num1.toString().length());
        // Se converter para String, pode utilizar funções disponiveis apenas na String
        // A função .length mostra a quantidade de caractere

        int num2 = 10000;
        System.out.println(Integer.toString(num2).length());
        //Posso passar o tipo primitivo "int" para String,
        // mas tem que passar para o Integer primeiro

        System.out.println(("" + num2).length());
        //Concatenando o "" com a variável para transformar em String

    }
}
