package Estudo;

public class TestaListaLigada {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco("Josmar");
        System.out.println(lista);
        lista.adicionaNoComeco("Jorge");
        System.out.println(lista);
        lista.adicionaNoComeco("Vilso");
        System.out.println(lista);
    }
}
