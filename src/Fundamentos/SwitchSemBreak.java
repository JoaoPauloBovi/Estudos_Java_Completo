package Fundamentos;

public class SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "laranja";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei o Kata da faixa preta");
            case "marrom":
                System.out.println("Sei o Kata da faixa marrom");
            case "roxa":
                System.out.println("Sei o Kata da faixa roxa");
            case "verde":
                System.out.println("Sei o Kata da faixa verde");
            case "laranja":
                System.out.println("Sei o Kata da faixa laranja");
            case "vermelha":
                System.out.println("Sei o Kata da faixa vermelha");
            case "amarela":
                System.out.println("Sei o Kata da faixa amarela");
                break;
            default:
                System.out.println("Não sei nada");
        }
    }
}
