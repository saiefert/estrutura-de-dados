package estruturadedados.pilhasfilas;

import java.util.Scanner;

class Aluno {
    int nome;
    double notaUm, notaDois;
    double media = 0;

    double calculaMedia() {
        return this.media = (notaUm + notaDois) / 2;
    }
}

public class revisao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantidade de Alunos: ");
        Aluno[] aluno = new Aluno[sc.nextInt()];
        int qtdAcimaMedia = 0;

        for (int i = 0; i < aluno.length; i++) {
            aluno[i] = new Aluno();
            System.out.println("Digite a primeira nota do aluno " + i + ": ");
            aluno[i].notaUm = sc.nextDouble();
            System.out.println("Digite a segunda nota do aluno " + i + ": ");
            aluno[i].notaDois = sc.nextDouble();
            aluno[i].calculaMedia();

            if (aluno[i].media >= 6) {
                qtdAcimaMedia++;
            }

        }System.out.println("A quantidade de alunos acima da média é: " + qtdAcimaMedia);
    }
}
