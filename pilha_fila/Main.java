package pilha_fila;

import pilha_fila.estruturas.Pilha;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(2);

        pilha.empilhar("CARLOS");
        pilha.empilhar("LORENZO");
        pilha.empilhar("LUANA");

        pilha.mostrarPilha();
    }
}
