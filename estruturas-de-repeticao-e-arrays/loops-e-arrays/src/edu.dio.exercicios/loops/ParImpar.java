import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = 0;
        int numero = 0;
        int qtdPares = 0, qtdImpares = 0;
        

        System.out.println("Quantidades de números: ");
        n = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Números: ");
            numero = scan.nextInt();
            count++;

            if (numero % 2 == 0)
                qtdPares++;
            else
                qtdImpares++;

        } while(count < n);

        System.out.println("Quantidade pares: " + qtdPares);
        System.out.println("Quantidade ímpares: " + qtdImpares);
    }
}
