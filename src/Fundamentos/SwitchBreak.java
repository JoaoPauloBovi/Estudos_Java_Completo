package Fundamentos;

import java.util.Scanner;

public class SwitchBreak {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String conceito = "";
        System.out.println("Nota: ");
        int nota = entrada.nextInt();

        switch (nota) {
            case 10: //case 9: << juntar 2 case
                conceito = "A";
                break;
            case 9:
                conceito = "A";
                break;
            case 8:
                conceito = "B";
                break;
            case 7:
                conceito = "B";
                break;
            case 6:
                conceito = "C";
            case 5:
                conceito = "C";
            case 4:
                conceito = "D";
                break;
            case 3:
                conceito = "D";
                break;
            case 2:
                conceito = "E";
                break;
            case 1:
                conceito = "E";
                break;
            default: conceito = "não encontrado";
        }
        System.out.println("Conceito " + conceito);
    }
}
