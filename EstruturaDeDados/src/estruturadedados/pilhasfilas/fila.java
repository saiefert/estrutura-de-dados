package estruturadedados.pilhasfilas;

public class fila {

    public tipoNo cabeca;

    fila() {
        System.out.println("Criando fila...(construtor fila)");
    }

    public void insereFinal(int info) {
        if (cabeca == null) {
            cabeca = new tipoNo();
            cabeca.setInfo(info);
            cabeca.setProx(null);
        } else {
            tipoNo aux, novo;
            novo = new tipoNo();
            novo.setInfo(info);
            novo.setProx(null);
            aux = cabeca;
            while (aux.getProx() != null)
                aux = aux.getProx();
            aux.setProx(novo);
        }

        System.out.println("Elemento " + info + " inserido com sucesso! ");
    }

    /****************************************/
    public void insereFinalCirc(int info) {
        if (cabeca == null) {
            cabeca = new tipoNo();
            cabeca.setInfo(info);
            cabeca.setProx(cabeca);
        } else {
            tipoNo aux, novo;

            novo = new tipoNo();
            novo.setInfo(info);
            novo.setProx(cabeca);

            aux = cabeca;
            while (aux.getProx() != cabeca)
                aux = aux.getProx();

            aux.setProx(novo);
        }
    }

    /****************************************/
    public void insereInicio(int info) {
        if (cabeca == null) {
            cabeca = new tipoNo();
            cabeca.setInfo(info);
            cabeca.setProx(null);
        } else {
            tipoNo novo;
            novo = new tipoNo();
            novo.setInfo(info);
            novo.setProx(cabeca);
            cabeca = novo;
        }
        System.out.println("Elemento " + info + " inserido com sucesso! ");
    }

    /***********************/
    public void removeInicioCirc() {

        if (cabeca != null) {

            if (cabeca.getProx() == cabeca) {
                cabeca = null;
            } else {
                tipoNo aux;
                aux = cabeca;

                while (aux.getProx() != cabeca)
                    aux = aux.getProx();

                aux.setProx(cabeca.getProx());
                int valor = cabeca.getInfo();
                cabeca = cabeca.getProx();
                System.out.println("Removido: " + valor);

            }

        }

    }

    /***********************/

    public void imprimeCirc() {

        System.out.println("Impressao: ");
        if (cabeca != null) {
            tipoNo aux = cabeca;
            System.out.print(aux.getInfo() + " ");
            aux = aux.getProx();

            while (aux != cabeca) {
                System.out.print(aux.getInfo() + " ");
                aux = aux.getProx();
            }
            System.out.println("");
        }
    }

    public void removeFinal() {
        if (cabeca != null) {
            if (cabeca.getProx() == null) {
                int valor = cabeca.getInfo();
                System.out.println("Elemento " + valor + " removido com sucesso! ");
                cabeca = null;
            } else {
                tipoNo aux;
                aux = cabeca;
                while ((aux.getProx()).getProx() != null)
                    aux = aux.getProx();
                int valor = (aux.getProx()).getInfo();
                System.out.println("Elemento " + valor + " removido com sucesso! ");
                aux.setProx(null);
            }
        }
    }

    ////// exercicio 01 ////////////
    public void removenesimo(int n) {

        if (cabeca == null) {
            System.out.println("Lista vazia!");
        } else {
            //remocao do primeiro
            int valor;
            if (n == 1) {
                valor = cabeca.getInfo();
                cabeca = cabeca.getProx();
                System.out.println("Valor " + valor + " removido!");
            } else {
                int pos = 1;
                tipoNo aux;
                aux = cabeca;

                while (aux.getProx() != null && pos != n - 1) {
                    aux = aux.getProx();
                    pos++;
                }
                if (aux.getProx() != null) {
                    valor = aux.getProx().getInfo();
                    aux.setProx(aux.getProx().getProx());
                    System.out.println("Valor " + valor + " removido!");
                } else {
                    System.out.println("Posicao inexistente!");
                }
            }

        }

    }

    ////////////////////////exercicio 02///////////////////////////////

    public void dividirLista(int n) {
        if (cabeca != null) {
            int pos = 1;
            tipoNo aux;
            aux = cabeca;
            tipoNo novaCabeca;
            while (pos != n) {
                aux = aux.getProx();
                pos++;
            }
            tipoNo novaAux;
            novaCabeca = aux;
            novaCabeca = novaCabeca.getProx();
            aux.setProx(null);
            novaAux = novaCabeca;
            System.out.println("Nova Lista");
            while (novaAux != null) {
                System.out.print(novaAux.getInfo() + " ");
                novaAux = novaAux.getProx();
            }
        } else if (cabeca.getProx() == null) {
            System.out.println("Lista possui apenas um elemento");
        } else {
            System.out.println("Lista Vazia");
        }
    }

    public void imprime() {
        tipoNo aux = cabeca;
        System.out.println("Impressao: ");
        while (aux != null) {
            System.out.print(aux.getInfo() + " ");
            aux = aux.getProx();
        }
        System.out.println("");
    }

    public void menu() {
        int valor, opcao = 0, n = 0;
        System.out.print("\n------------ Menu ------------\n");
        while (opcao != -1) {
            opcao = Input.readInt("\nDigite a opcao: \n(1) Insere Inicio \n(2) Insere Fim \n(3) Remove Inicio \n(4) Remove Fim \n(5) Imprime\n(6) Remove n-esimo\n(7) Insere Circ\n(8) Remove Circ\n(9) Imprime Circ\n(-1) Sair \nOpcao: ");
            switch (opcao) {

                case 1: //insereInicio
                    valor = Input.readInt("Valor: ");
                    insereInicio(valor);
                    break;

                case 2: //insereFinal
                    valor = Input.readInt("Valor: ");
                    insereFinal(valor);
                    break;

                case 3: //removeInicio
                    //removeInicio();
                    break;

                case 4: //removeFinal
                    removeFinal();
                    break;

                case 5: //imprime
                    imprime();
                    break;

                case 6:
                    n = Input.readInt("Digite o n-esimo: ");
                    removenesimo(n);
                    break;

                case 7:
                    valor = Input.readInt("Valor: ");
                    insereFinalCirc(valor);
                    break;
                case 8:
                    removeInicioCirc();
                    break;

                case 9:
                    imprimeCirc();
                    break;
                case 0:
                    System.out.println("Selecione a posição para dividir a lista");
                    dividirLista(n);
                    break;

                case -1: //sair
                    System.out.println("Saindo!");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;

            }

        }
    }

    public static void main(String args[]) {
        System.out.println("\n************ Lista Encadeada Dinâmica ************\n");
        fila F = new fila();
        F.menu();
        System.out.println("\n************ Fim programa ************\n");
    }
}