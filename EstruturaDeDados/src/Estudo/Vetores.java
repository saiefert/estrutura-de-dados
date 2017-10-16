package Estudo;

import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vetor vetores = new Vetor(10);

        vetores.adicionaTamanho("Josmar");
        vetores.adicionaTamanho("Di");

        System.out.println(vetores);
        System.out.println("Busque um nome: ");
        System.out.println(vetores.busca(sc.next()));

        System.out.println("Adicione um elemento em qualquer posição do vetor[Digite a posição em seguida o nome]");
        vetores.adicionaPosicao(0, "Adicionado");

        System.out.println(vetores);

    }

}
