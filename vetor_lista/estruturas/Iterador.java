public class Iterador {

    Lista lista;
    No atual;

    public Iterador(Lista lista, No atual) {
        this.lista = lista;
        this.atual = atual;
    }

    public Boolean haProximo() {
        return this.atual.proximo != null;
    }

    public Boolean haAnterior() {
        return this.atual.anterior != null;
    }

    public void proximo() {
        this.atual = atual.proximo;
    }

    public int getDadoAnterior() {
        return this.atual.anterior.dado;
    }

    public int getDadoProximo() {
        return this.atual.proximo.dado;
    }

    public int getDado() {
        return this.atual.dado;
    }

    public No getAtual() {
        return this.atual;
    }

    public void resetar() {
        this.atual = this.lista.inicio;
    }

    public void display() {
        if (this.haAnterior()) {
            System.out.print("Anterior -> " + this.getDadoAnterior() + " | ");
        }

        System.out.print("No " + this.getDado());

        if (this.haProximo()) {
            System.out.println(" | Proximo -> " + this.getDadoProximo());
        }
        this.proximo();
        System.out.println();
    }

    public void inserirAposAtual(int valor) {
        No novo = new No(valor);
        No atual = this.atual;

        novo.anterior = atual;
        novo.proximo = atual.proximo;

        if (atual.proximo != null) {
            atual.proximo.anterior = novo;
        }

        atual.proximo = novo;
    }

    public void removerAposAtual() {
        if (this.atual.proximo == null) {
            System.out.println("Não há nó após o atual.");
            return;
        }

        No remover = this.atual.proximo;
        this.atual.proximo = remover.proximo;

        if (remover.proximo != null) {
            remover.proximo.anterior = this.atual;
        }

        remover.proximo = null;
        remover.anterior = null;
    }

    public void inserirAntesAtual(int valor) {
        No novo = new No(valor);

        if (this.atual.anterior == null) {
            novo.proximo = this.atual;
            this.atual.anterior = novo;
            this.lista.inicio = novo;
        } else {
            novo.anterior = this.atual.anterior;
            novo.proximo = this.atual;
            this.atual.anterior.proximo = novo;
            this.atual.anterior = novo;
        }
    }

    public void removerAntesAtual() {
        if (this.atual.anterior == null) {
            System.out.println("Não há nó antes do atual.");
            return;
        }

        No remover = this.atual.anterior;

        if (remover.anterior != null) {
            remover.anterior.proximo = this.atual;
            this.atual.anterior = remover.anterior;
        } else {
            this.atual.anterior = null;
            this.lista.inicio = this.atual;
        }

        remover.proximo = null;
        remover.anterior = null;
    }
}
