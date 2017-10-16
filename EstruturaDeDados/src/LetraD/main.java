package LetraD;

import java.util.Scanner;

public class main {

    protected Celula inicio = null;
    protected Celula ultimo = null;
    public int tamanho = 0;

    public void insereInicio(int val) {
        Celula aux = new Celula(val, null);
        aux.setPonteiro(inicio);
        if (inicio == null) {
            inicio = aux;
            aux.setPonteiro(inicio);
            ultimo = inicio;
        } else {
            ultimo.setPonteiro(aux);
            inicio = aux;
        }
        tamanho++;
    }

    public void insereUltimo(int val) {
        Celula aux = new Celula(val, null);
        aux.setPonteiro(inicio);
        if (inicio == null) {
            inicio = aux;
            aux.setPonteiro(inicio);
            ultimo = inicio;
        } else {
            ultimo.setPonteiro(aux);
            ultimo = aux;
        }
        tamanho++;
    }

    public void inserePosicao(int elemento, int posicao) {
        Celula aux = new Celula(elemento, null);
        Celula proxaux = inicio;
        for (int i = tamanho - 1; i >= posicao; i--) {
            if (i == posicao) {
                Celula aux2 = proxaux.getPonteiro();
                proxaux.setPonteiro(aux);
                aux.setPonteiro(aux2);
                break;
            }
            proxaux = proxaux.getPonteiro();
        }
        tamanho++;
    }

    public void imprime() {
        System.out.print("Impressão: ");
        Celula aux = inicio;
        if (inicio.getPonteiro() == inicio) {
            System.out.print(inicio.getInfo() + "->" + aux.getInfo() + "\n");
            return;
        }
        System.out.print(inicio.getInfo() + ",");
        aux = inicio.getPonteiro();
        while (aux.getPonteiro() != inicio) {
            System.out.print(aux.getInfo() + ",");
            aux = aux.getPonteiro();
        }
        System.out.print(aux.getInfo() + ",");
        aux = aux.getPonteiro();
        System.out.print(aux.getInfo() + "\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        main principal = new main();

        int quantidade = 0;
        System.out.println("=====================================================");
        System.out.println("Digite a quantidade de elementos a serem inseridos: ");
        quantidade = sc.nextInt();
        System.out.println("Muito bem, agora insira " + quantidade + " elementos: ");
        while (quantidade > 0) {
            principal.insereUltimo(sc.nextInt());
            quantidade--;
        }
        principal.imprime();

        int tamanho = principal.tamanho - 1;
        System.out.println("Insira o elemento que quer adicionar da posição 0 a " + tamanho);

        System.out.print("Insira o elemento: ");
        int numero = sc.nextInt();
        System.out.print("Insira a posição: ");
        int posicao = sc.nextInt();
        principal.inserePosicao(numero,posicao);
        principal.imprime();
    }
}
