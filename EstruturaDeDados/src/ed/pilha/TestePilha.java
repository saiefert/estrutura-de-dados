package ed.pilha;
import java.util.Stack;

public class TestePilha {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        //pilha.insere("Mauricio");
        //System.out.println(pilha);

        //pilha.insere("Guilherme");
        //System.out.println(pilha);

        //String r1 = pilha.remove();
        //System.out.println(r1);

        //String r2 = pilha.remove();
        //System.out.println(r2);

        //System.out.println(pilha);

        //System.out.println(pilha.vazia());


        //pilhas metodos
        Stack<String> stack = new Stack<String>();
        stack.push("Mauricio"); //entra
        stack.push("Marcelo"); //
        stack.pop();
        stack.push("Guilherme");
        stack.push("Paulo");
        stack.pop();
        stack.push("João");
        String nome = stack.peek();

        System.out.println(stack);


        //Pilha é uma estrutura de dados na qual o último elemento a entrar é o primeiro a sair, também conhecida como LIFO(Last-In First-Out), por exemplo, uma pilha de pratos.

    }



}
