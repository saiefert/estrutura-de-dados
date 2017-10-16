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

    public void inserePosicao(int val, int pos) {

        Celula nptr = new Celula(val, null);
        Celula ptr = inicio;
        for (int i = tamanho - 1; i >= pos; i--) {
            if (i == pos) {
                Celula tmp = ptr.getPonteiro();
                ptr.setPonteiro(nptr);
                nptr.setPonteiro(tmp);
                break;
            }
            ptr = ptr.getPonteiro();
        }
        tamanho++;
    }

    public void imprime() {
        System.out.print("Impressão: ");
        Celula aux = inicio;
        if (inicio.getPonteiro() == inicio) {
            System.out.print(inicio.getInfo() + "<" + aux.getInfo() + "\n");
            return;
        }
        System.out.print(inicio.getInfo() + " < ");
        aux = inicio.getPonteiro();
        while (aux.getPonteiro() != inicio) {
            System.out.print(aux.getInfo() + " < ");
            aux = aux.getPonteiro();
        }
        System.out.print(aux.getInfo() + " < ");
        aux = aux.getPonteiro();
        System.out.print(aux.getInfo() + "\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        main principal = new main();

        int quantidade = 0;
        int tam = 0;
        System.out.println("=====================================================");
        System.out.println("Digite a quantidade de elementos a serem inseridos: ");
        quantidade = sc.nextInt();
        System.out.println("Muito bem, agora insira " + quantidade + " elementos: ");
        while (quantidade > 0) {
            principal.insereUltimo(sc.nextInt());
            quantidade--;
            tam++;
        }
        principal.imprime();

        int tamanho = principal.tamanho - 1;
        System.out.println("Insira o elemento que quer adicionar da posição 1 a " + tamanho);

        System.out.print("Insira o elemento: ");
        int numero = sc.nextInt();
        int posicao;

        do {
            System.out.print("Insira a posição: ");
            posicao = sc.nextInt();

            if (posicao == 0){
                System.out.println("Você digitou uma posição incorreta!");
            }else if (posicao >= tam){
                System.out.println("Você digitou uma posição maior ou iguao o tamanho!");
            }else {
                principal.inserePosicao(numero, posicao);
                principal.imprime();
            }
        }while (posicao != 0);

    }
}
