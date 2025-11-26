package Desafios;

public class DesafioLogicos {
    public static void main(String[] args) {

        //Trabalho na terça (v ou f)
        //Trabalho na quinta (v ou f)
        // se 1 trabalho der certo = comprar TV 32"
        // se os 2 trabalhos derem certo = comprar TV 50"
        // se comprar qlqr TV = familia tomar sorvete
        // se nao tiver trabalho = familia fica em casa

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        boolean ficaramCasa = !trabalho1 || !trabalho2;

        System.out.println("Comprou Tv 50\"? " + comprouTv50);
        System.out.println("Comprou a Tv 32\"? " + comprouTv32);
        System.out.println("Compou Sorvete? " + comprouSorvete);
        System.out.println("Ficaram em casa? " + ficaramCasa);
    }
}
