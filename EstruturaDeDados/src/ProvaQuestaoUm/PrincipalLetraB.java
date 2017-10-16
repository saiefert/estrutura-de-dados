package ProvaQuestaoUm;

import java.util.Collections;
import java.util.Scanner;

public class PrincipalLetraB {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AlunoLetraB[] alunos = new AlunoLetraB[10];
        VetorLetraB lista = new VetorLetraB();

        int qtd;

        System.out.println("Digite a Quantidade de Alunos: ");

        qtd = sc.nextInt();
        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o nome do " + (i + 1) + "º Aluno");
            alunos[i] = new AlunoLetraB(sc.next());
            lista.adiciona(alunos[i]);
        }

        System.out.println(lista);

         System.out.println("Veja se a lista contém Aluno: ");
         AlunoLetraB a3 = new AlunoLetraB(sc.next());
         System.out.println(lista.contem(a3));

        System.out.println("Digite uma posição para remover: ");
        lista.remove(sc.nextInt());
        System.out.println(lista);

    }
}
