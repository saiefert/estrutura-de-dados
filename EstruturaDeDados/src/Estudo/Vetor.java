package Estudo;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho = 0;

    public Vetor(int quantidade) {
        elementos = new String[quantidade];
    }

    public void adiciona(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }

    public void adicionaTamanho(String elemento) {
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
        aumentaCapacidade();
    }

    public String busca(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(nome)) {
                return "Nome existe";
            }
        }
        return "Não existe";

    }

    public void remove(){

    }


    public void adicionaPosicao(int posicao, String nome) {
        for (int i = tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = nome;
        this.tamanho++;

        aumentaCapacidade();
    }

    public void aumentaCapacidade(){
        if (tamanho == this.elementos.length){
            String [] novoTamanho = new String[elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++){
                novoTamanho[i] = this.elementos[i];
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }
}
