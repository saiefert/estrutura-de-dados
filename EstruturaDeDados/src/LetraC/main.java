package LetraC;

import java.util.Scanner;

public class main {

    public Celula cabeca;


    //adicionar no inicio da celula

    public void adicionaInicio(String info) {
        if (cabeca == null) {
            cabeca = new Celula();
            cabeca.setInfo(info);
            cabeca.setPonteiro(null);
        } else {
            Celula aux, novo;
            novo = new Celula();
            novo.setInfo(info);
            novo.setPonteiro(null);
            aux = cabeca;
            while (aux.getPonteiro() != null) {
                aux = aux.getPonteiro();
            }
            aux.setPonteiro(novo);
        }
    }

    public void imprime() {
        Celula aux = cabeca;
        System.out.print("Impressão: [");
        while (aux != null) {
            System.out.print(aux.getInfo() + ",");
            aux = aux.getPonteiro();
        }
        System.out.print("]");
    }

    public void inverte() {
        Celula aux = cabeca;
        Celula aux2 = null;
        Celula proxAux = null;
        while (aux != null) {
            proxAux = aux.getPonteiro();
            aux.setPonteiro(aux2);
            aux2 = aux;
            aux = proxAux;
        }cabeca = aux2;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        main principal = new main();

        int elemento = 1;
        int quantidade = 0;
        System.out.println("=====================================================");
        System.out.print("Digite a quantidade de elementos a serem inseridos: ");
        quantidade = sc.nextInt();
        System.out.println("Muito bem, agora insira " + quantidade + " elementos: ");
        System.out.print("Insira o primeiro elemento: ");
        while (quantidade > 0) {
            principal.adicionaInicio(sc.next());
            System.out.print(elemento + "º Elemento inserido com sucesso! ");
            quantidade--;
            if (quantidade == 0) continue;
            System.out.print("Insira mais um! ");
            elemento++;
        }

        System.out.println("\n");
        principal.imprime();

        principal.inverte();
        System.out.print("\n\nA Lista invertida é: ");
        principal.imprime();


    }
}
