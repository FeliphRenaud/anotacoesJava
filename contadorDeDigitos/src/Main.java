import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Montar um codigo que leia o numero digitado pelo usuario
        // que retorne a quantidade de digitos
        //ex: 50 possui dois digitos

        // parte do codigo responsavel por solicitar e ler informação fornecida por usuario
        Scanner lerNumeros = new Scanner(System.in);
        System.out.println("Digite um numero positivo maior que zero: ");
        int numero = lerNumeros.nextInt();

        // parte do codigo que fara as tratativas de digitos

        if(numero <=0){
            System.out.println("Somente numeros positivos maiores que zero são validos");
            return;
        }if(numero >=1 && numero <9){
            System.out.println("esse numero tem um digito");
        } else if (numero>=10 && numero <100  ) {
            System.out.println("numero possui dois digitos ");
        } else if (numero >=100 && numero < 1000) {
            System.out.println("numero possui tres digitos ");
        }else if (numero >=1000 && numero < 10000) {
            System.out.println("numero possui quatro digitos ");
        }else {
            System.out.println("Numero com 5 ou mais digitos");
        }



    }
}