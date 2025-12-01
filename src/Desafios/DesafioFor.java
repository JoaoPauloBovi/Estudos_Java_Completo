package Desafios;

public class DesafioFor {
    public static void main(String[] args) {

        String valor = "#";
        for (int i = 1; i <= 5 ; i++){
            System.out.println(valor);
            valor += "#";
        }

        //Desafio = Não pode usar valor numério para controlar o laço


        for (String d = "#"; !d.equals("#######"); d+= "#"){
            System.out.println(d);
        }
    }
}






