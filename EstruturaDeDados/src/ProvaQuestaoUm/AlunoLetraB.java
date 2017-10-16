package ProvaQuestaoUm;

public class AlunoLetraB {

    String nome;

    public AlunoLetraB(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        AlunoLetraB outro = (AlunoLetraB) obj;
        return outro.getNome().equals(this.nome);
    }

    @Override
    public String toString() {
        return nome;
    }

}
