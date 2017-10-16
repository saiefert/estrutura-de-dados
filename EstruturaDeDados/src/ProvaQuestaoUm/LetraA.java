package ProvaQuestaoUm;
import java.util.Scanner;

public class LetraA {
    public static void main(String[] args) {
        int qtdeNumeros1, qtdeNumeros2,qtdeNumeros3, aux, cont =0;
        int[] numeros1, numeros2, numeros3;

        System.out.println("Quantidade de números do primeiro conjunto:");
        qtdeNumeros1 = new Scanner(System.in).nextInt();
        numeros1 = new int[qtdeNumeros1];
        while(cont <qtdeNumeros1){
            System.out.println("Entre com o "+(cont +1)+"º número:");
            numeros1[cont] = new Scanner(System.in).nextInt();
            cont++;
        }
        boolean troca = true;
        while(troca){
            troca = false;
            cont = 0;
            while(cont < (qtdeNumeros1-1)){
                if(numeros1[cont] > numeros1[cont +1]){
                    aux = numeros1[cont];
                    numeros1[cont] = numeros1[cont +1];
                    numeros1[cont +1] = aux;
                    troca = true;
                }
                cont++;
            }
        }
        cont =0;
        System.out.println("Quantidade de números do segundo conjunto:");
        qtdeNumeros2 = new Scanner(System.in).nextInt();
        numeros2 = new int[qtdeNumeros2];
        while(cont <qtdeNumeros2){
            System.out.println("Entre com o "+(cont + 1 )+" número:");
            numeros2[cont] = new Scanner(System.in).nextInt();
            cont++;
        }
        boolean muda = true;
        while(muda){
            muda = false;
            cont = 0;
            while(cont < (qtdeNumeros2-1)){
                if(numeros2[cont] > numeros2[cont +1]){
                    aux = numeros2[cont];
                    numeros2[cont] = numeros2[cont +1];
                    numeros2[cont +1] = aux;
                    muda = true;
                }
                cont++;
            }
        }
        System.out.println("Os dois conjuntos ordenados de forma crescente separadamente");
        cont = 0;
        System.out.print("1º conjunto: ");
        while(cont <qtdeNumeros1){
            System.out.print(+numeros1[cont]+",");
            cont++;
        }
        System.out.print("\n");
        cont = 0;
        System.out.print("2º conjunto: ");
        while(cont <qtdeNumeros2){
            System.out.print(+numeros2[cont]+",");
            cont++;
        }
        System.out.println("\n");
        qtdeNumeros3 = qtdeNumeros1 + qtdeNumeros2;
        numeros3 = new int[qtdeNumeros3];
        int i = 0;
        cont = 0;
        while(cont < qtdeNumeros1){
            numeros3[i] = numeros1[cont];
            cont++;
            i++;
        }
        cont = 0;
        while(cont < qtdeNumeros2){
            numeros3[i] = numeros2[cont];
            cont++;
            i++;
        }
        boolean agrupa = true;
        while(agrupa){
            agrupa = false;
            i = 0;
            while(i < (qtdeNumeros3-1)){
                if(numeros3[i] > numeros3[i+1]){
                    aux = numeros3[i];
                    numeros3[i] = numeros3[i+1];
                    numeros3[i+1] = aux;
                    agrupa = true;
                }
                i++;
            }
        }

        i = 0;
        System.out.println("Os numeros dos dois conjuntos ordenados de forma crescente:");
        while(i < qtdeNumeros3){
            System.out.print(+numeros3[i]+",");
            i++;
        }
    }
}