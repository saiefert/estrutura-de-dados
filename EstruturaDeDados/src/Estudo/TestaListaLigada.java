package Estudo;

public class TestaListaLigada {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco(1);
        System.out.println(lista);
        lista.adicionaNoComeco(2);
        System.out.println(lista);
        lista.adicionaNoComeco(3);
        System.out.println(lista);
        lista.adiciona(4);
        System.out.println(lista);

    }
}
