package Estudo;

import java.util.Scanner;

public class VetorPrincipal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Array lista = new Array(5);

        lista.adiciona("Josmar");
        lista.adiciona("Dionizia");

        System.out.println(lista);

        System.out.println(lista.busca("Josmar"));
        System.out.println("Elemento adicionado na posição");
        lista.adicionaPosicao(0,"Adicionado");
        System.out.println(lista);


        System.out.println("Removendo elemento");
        int posicao = lista.busca("Josmar");
        lista.remove(posicao);
        System.out.println(lista);
    }
}
