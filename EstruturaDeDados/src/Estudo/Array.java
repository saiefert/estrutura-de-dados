package Estudo;

import java.util.Arrays;

public class Array {
    private String[] elemento;
    private int tamanho = 0;

    public Array(int tamanho) {
        this.elemento = new String[tamanho];
    }

    public void adiciona(String elemento) {
        this.elemento[this.tamanho] = elemento;
        this.tamanho++;
    }

    public int busca(String elemento) {
        for (int i = 0; i < this.elemento.length; i++) {
            if (this.elemento[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    //Se a posicao que passei for maior que o tamanho não entra no laco
    //Se for, entra no laco
    //vetor[5] = vetor [4] << tamanho -1 é o quatro
    //vetor[4] = vetor [3]
    //vetor[3] = vetor [2]
    //vetor[2] = vetor [1]
    //vetor[1] = vetor [0]
    public void adicionaPosicao(int posicao, String elemento) {
        for (int i = tamanho - 1; i >= posicao; i--) {
            this.elemento[i + 1] = this.elemento[i];
        }
        this.elemento[posicao] = elemento;
        tamanho++;
    }

    //vetor [1] = vetor [2]
    //vetor [2] = vetor [3]
    //vetor [3] = vetor [4]
    public void remove(int posicao) {
        for (int i = posicao; i < this.tamanho; i++) {
            this.elemento[posicao] = this.elemento[i];
        }
        tamanho--;

    }

    @Override
    public String toString() {
        return Arrays.toString(elemento);
    }
}
