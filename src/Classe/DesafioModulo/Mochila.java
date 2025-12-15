package Classe.DesafioModulo;

public class Mochila {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João", 90);
        Livros l1 = new Livros("D.Constitucional", 0.300);
        Livros l2 = new Livros("Direito Civil", 0.700);
        Livros l3 = new Livros("Direito Penal", 0.400);
        Livros l4 = new Livros("Direito de Processo Civil", 0.400);
        Livros l5 = new Livros("Direito de Processo Penal", 0.200);


        a1.guardar(l1);
        a1.guardar(l2);
        a1.guardar(l3);
        a1.guardar(l4);
        a1.guardar(l5);

        System.out.println(a1.apresentar());

    }
}
