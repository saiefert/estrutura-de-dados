package ed.fila;

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
        filaDoJava.add("Mauricio"); // primeiro a entrar
        filaDoJava.add("Paulo"); // segundo a entrar
        filaDoJava.add("Guilherme"); // terceiro a entrar
        filaDoJava.poll(); // remove o primeiro a entrar
        filaDoJava.add("João"); // quarto a entrar
        filaDoJava.poll(); // remove o segundo a entrar
        System.out.println(filaDoJava);

    }

}
