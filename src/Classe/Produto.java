package Classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto() {

    }

    Produto(String nomeInicial) {
        nome = nomeInicial;
    }

    double area (){
        return desconto;
    }

    Produto (String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
       // desconto = descontoInicial;
    }
    double precoDescontoGeral(){
        return preco * (1 - desconto);
    }

    double precoComDesconto() {
        return preco * ( 1 - desconto);
    }

    double precoDesconto (double descontoGerente) {
        return preco * (1 - desconto + descontoGerente);
    }


}
