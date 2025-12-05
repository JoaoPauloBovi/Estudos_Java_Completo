package Classe;

public class Itens {

    String nome;
    double preco;
    static double desconto = 0;

    double descontoFinal(){
       return preco * ( 1 - desconto);
    }

}
