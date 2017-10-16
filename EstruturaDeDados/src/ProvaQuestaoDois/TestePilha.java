package ProvaQuestaoDois;

import java.util.Stack;

public class TestePilha {

    public static void main(String[] args) {
        //pilhas metodos
        Stack<String> stack = new Stack<String>();

        //stack.pop();
        stack.push("1");
        stack.pop();
        stack.push("2");
        stack.push("3");
        stack.pop();
        stack.pop();
        stack.push("4");
        stack.push("5");
        stack.push("6");
        stack.push("7");
        stack.push("8");
        stack.push("9");
        stack.push("10");
        stack.push("11");
        stack.push("12");
        stack.push("13");
        stack.push("14");
        stack.push("15");
        stack.push("16");
        stack.push("17");
        stack.push("18");
        stack.pop();
        stack.push("19");
        stack.push("20");
        stack.push("21");
        stack.push("22");
        stack.push("23");
        stack.push("24");
        stack.push("25");
        stack.push("26");
        stack.push("27");
        stack.push("28");
        stack.push("29");
        stack.push("30");
        stack.push("31");
        stack.push("32");
        stack.push("33");
        stack.push("34");
        stack.push("35");
        stack.push("36");
        stack.pop();



        String nome = stack.peek();

        System.out.println("O Primeiro elemento da minha pilha é o 35");
        System.out.println("O resultado é: " + stack);



    }



}
