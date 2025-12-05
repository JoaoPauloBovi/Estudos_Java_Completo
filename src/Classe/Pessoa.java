package Classe;

public class Pessoa {

    String nome;
    double altura;
    double peso;


    Double imc(){
        return peso / (altura * 2);
    }


}

