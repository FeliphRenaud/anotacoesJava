import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner variavel1 = new Scanner(System.in);
        //essa linha scaneia o que o cliente digitara e armazena na memoria
        System.out.print("Digite o primeiro numero a ser somado e pressione tecla enter ");
        //essa linha serve como comando para o cliente saber que deve digitar a variavel
        int numero1 = variavel1.nextByte();
        // essa linha transforma a memoria do que foi digitado em variavel

        Scanner variavel2 = new Scanner(System.in);
        //essa linha scaneia o que o cliente digitara e armazena na memoria
        System.out.print("Digite o segundo numero a ser somado e pressione tecla enter  ");
        //essa linha serve como comando para o cliente saber que deve digitar a variavel
        int numero2 = variavel2.nextByte();
        // essa linha transforma a memoria do que foi digitado em variavel

        int soma = numero1 + numero2;
        //aqui é realizada a soma das duas variaveis digitadas
        System.out.println("O resultado da sua soma é : " + soma);
        // e aqui é finalmente retornado o resultado da soma
    }
}