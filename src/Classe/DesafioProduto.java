package Classe;

public class DesafioProduto {

    String nome;
    double preco;
    static double desconto = 0.25;


    DesafioProduto() {
    }

    DesafioProduto(String a, double b) {
        a = nome;
        b = preco;
    }

    double precoDesconto() {

        return preco * (1 - desconto);
    }
}
