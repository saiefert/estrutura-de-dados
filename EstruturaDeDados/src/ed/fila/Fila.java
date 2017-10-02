package ed.fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {

    private List<String> alunos = new LinkedList<String>();

    public void adiciona(String aluno) {
        alunos.add(aluno);
    }

    @Override
    public String toString() {
        return alunos.toString();
    }

}
