package Classe;

public class DataTeste {
    public static void main(String[] args) {

//        Data d1 = new Data();
//        d1.dia = 22;
//        d1.mes = 8;
//        d1.ano = 1995;
//
//        var d2 = new Data();
//        d2.dia = 5;
//        d2.mes = 2;
//        d2.ano = 1995;

        Data d1 = new Data(22, 8, 1995);
        Data d2 = new Data();

        System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
       // System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);

        String dataD1 = d1.obterDataFormatada();
        String dataD2 = d2.obterDataFormatada();

        System.out.println(dataD1 + "\n" + dataD2);
    }
}
