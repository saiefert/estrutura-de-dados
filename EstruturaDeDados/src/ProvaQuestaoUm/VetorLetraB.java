package ProvaQuestaoUm;

import java.util.Arrays;

public class VetorLetraB {


    private AlunoLetraB[] alunos = new AlunoLetraB[10];
    private int totalDeAlunos = 0;

    public void adiciona(AlunoLetraB aluno) {
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    public AlunoLetraB pega(int posicao) {
        return alunos[posicao];
    }

    public void remove(int posicao) {
        for(int i = posicao; i < this.totalDeAlunos; i++) {
            this.alunos[i] = this.alunos[i+1];
        }
        totalDeAlunos--;
    }


    public boolean contem (AlunoLetraB aluno) {

        for(int i = 0; i < totalDeAlunos; i++) {
            if(aluno.equals(alunos[i])) {
                return true;
            }
        }
        return false;
    }



    public String toString() {
        return Arrays.toString(alunos);
    }
}
