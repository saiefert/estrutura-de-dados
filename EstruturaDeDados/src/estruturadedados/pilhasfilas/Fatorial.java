package estruturadedados.pilhasfilas;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fat = 0;
        int fatorial = 1;

        System.out.println("Calculo de fatorial!");
        System.out.println("=====================");
        System.out.println("Digite o número: ");
        fat = sc.nextInt();

        while (fat > 1) {
            fatorial *= fat;
            fat--;
        }
        System.out.println(fatorial);
    }
}