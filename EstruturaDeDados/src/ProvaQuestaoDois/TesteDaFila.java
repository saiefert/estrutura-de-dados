package ProvaQuestaoDois;

import java.util.LinkedList;
import java.util.Queue;

public class TesteDaFila {

    public static void main(String[] args) {
        Fila fila = new Fila();

        //fila.adiciona("Mauricio");
        //fila.adiciona("Guilherme");

        //System.out.println(fila);

        //String x1 = fila.remove();
        //System.out.println(x1);
        //System.out.println(fila);


        //Fila é uma estrutura de dados onde o primeiro a entrar é o primeiro a sair. É como uma fila de banco: o primeiro que chega na fila é o primeiro a ser atendido.

        Queue<String> filaDoJava = new LinkedList<String>();
        filaDoJava.add("3");
        filaDoJava.add("Paulo");
        filaDoJava.add("Guilherme");
        filaDoJava.poll();
        filaDoJava.poll();
        filaDoJava.add("3");
        filaDoJava.add("Paulo");
        filaDoJava.add("Guilherme");
        filaDoJava.add("3");
        filaDoJava.add("Paulo");
        filaDoJava.add("Guilherme");
        filaDoJava.poll();
        System.out.println(filaDoJava);

    }

}
