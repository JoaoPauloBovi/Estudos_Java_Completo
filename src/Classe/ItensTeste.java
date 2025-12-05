package Classe;

public class ItensTeste {
    public static void main(String[] args) {

        Itens i1 = new Itens();
        i1.nome = "Celular";
        i1.preco = 1000;

        var i2 = new Itens();
        i2.nome = "Brinquedo";
        i2.preco = 20;

        var i3 = new Itens();
        i3.nome = "Mouse";
        i3.preco = 120;

        Itens.desconto = 0.20;


        System.out.println(i1.descontoFinal());
        System.out.println(i2.descontoFinal());
        System.out.println(i3.descontoFinal());

    }
}
