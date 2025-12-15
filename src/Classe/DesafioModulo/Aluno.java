package Classe.DesafioModulo;

public class Aluno {
    String nome;
    double peso;

    Aluno(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void guardar(Livros livros){
        this.peso += livros.peso;
    }

    String apresentar(){
        return String.format("Olá, eu sou o %s e eu estou com %.2fkg porque minha mochila está muito pesada", this.nome,this.peso);
    }
}
