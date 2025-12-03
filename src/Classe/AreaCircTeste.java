package Classe;

public class AreaCircTeste {
    public static void main(String[] args) {

        AreaCirc a = new AreaCirc(10);
        //  a.PI = 10;
        a.raio = 100;

        System.out.println(a.area());

        AreaCirc b = new AreaCirc(5);
        //  b.PI = 3;
        b.raio = 50;
        System.out.println(b.area());

        // um PI para cada instancia

        AreaCirc c = new AreaCirc(3);


        System.out.println(c.area());
        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);
    }
}
