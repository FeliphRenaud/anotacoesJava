import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lerIdade = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = lerIdade.nextInt();

        System.out.println("Sua idade é: " + idade);

        boolean maiorIdade = idade>=18;


        if (maiorIdade == false) {
            Scanner possuiAcompanhante = new Scanner(System.in);
            System.out.println("Digite o numero 1 caso possua acompanhante  digite qualquer outro numero caso não possua: ");
            int acompanhado = possuiAcompanhante.nextInt();
            if (acompanhado == 1) {
                System.out.println("Entrada autorizada pois possui acompanhante");
            }else{
                System.out.println("entrada recusada pois não possui acompanhante");
            }
        }else{
            System.out.println("Entrada liberada pois é maior de idade");
        }



    }
}