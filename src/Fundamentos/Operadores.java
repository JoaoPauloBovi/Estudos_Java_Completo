package Fundamentos;

public class Operadores {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);
        System.out.println(!condicao2);

//        Tabela verdade "E = &&"
//        System.out.println(true && true); = true
//        System.out.println(true && false); = true
//        System.out.println(false && true); = true
//        System.out.println(false && false); = false

//        Tabela verdade "OU = ||
//        System.out.println(true || true); = true
//        System.out.println(true || false); = true
//        System.out.println(false || true); = true
//        System.out.println(false || false); = false

//        Tabela verdade "OU Exclusivo (XOR)
//        System.out.println(true ^ true); = false
//        System.out.println(true ^ false); = true
//        System.out.println(false ^ true); = true
//        System.out.println(false ^ false); = false

//        Tabela verdade "NOT = !
//        System.out.println(!true); = false
//        System.out.println(!false); = true

    }
}
