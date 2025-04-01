package estruturas;

public class Vetor {

    public Integer[] elementos; // 3fc -> 4fd
    private int tamanho;
    private int capacidade;

    public Vetor(int capacidade) {
        this.elementos = new Integer[capacidade];
        this.capacidade = capacidade;
        this.tamanho = 0;
    }

    public void adicionar(Integer valor) {
        if (this.capacidade == this.tamanho) {
            this.aumentarCapacidade();
        }

        this.elementos[this.tamanho] = valor;
        this.tamanho++;
    }

    public void adicionarAoInicio(Integer valor){
        if (this.capacidade == this.tamanho) {
            this.aumentarCapacidade();
        }

        this.moverElementos();

        this.elementos[this.tamanho - this.tamanho] = valor;
        this.tamanho++;

    }

    private void aumentarCapacidade() {
        int novaCapacidade = this.capacidade + (this.capacidade/2);
        Integer[] novosElementos = new Integer[novaCapacidade];

        for (int i =0; i<this.tamanho; i++) {
            novosElementos[i] = this.elementos[i];
        }

        this.elementos = novosElementos;
        this.capacidade = novaCapacidade;
    }

    public void mostrarElementos() {
        System.out.print("Elementos no vetor:");
        for (int i=0; i < tamanho; i++) {
            System.out.print(" " + this.elementos[i] + " ");
        }
        System.out.println();
    }

    public void moverElementos(){
        for (int i = this.tamanho; i >= 0; i--) {
            if (this.elementos[i+1] == null){
                this.elementos[i+1] = this.elementos[i];
                this.elementos[i] = null;
            }
        }
    }

    public void contem(Integer valor) {
        for (int i=0; i < tamanho; i++) {
            if (this.elementos[i] == valor) {
                System.out.println("Valor encontrado");
                return;
            }
        }
        System.out.println("Valor não encontrado");
    }

    public void remover(int posicao) {
        if (posicao > this.tamanho) {
            System.out.println("Posição informada é inválida");
            return;
        }

        for (int i = posicao; i < this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }

        this.elementos[this.tamanho-1] = null;
        this.tamanho--;
    }

    public void removerPorValor(Integer valor) {
        for (int i=0; i<this.tamanho; i++) {
            if (this.elementos[i] == valor) {
                this.remover(i);
                System.out.println("Item removido");
                return;
            }
        }

        System.out.println("Item não encontrado");
    }

    public void buscaBinaria(Integer valor){
        this.organizarElementos();

        Vetor vetorAux = this;
        int meio;

        while (vetorAux.tamanho > 0) {
            meio = vetorAux.tamanho / 2;
            if (vetorAux.elementos[meio] == valor) {
                System.out.println("Valor encontrado na posição: " + meio);
                return;
            } else if (valor > vetorAux.elementos[meio]) { 
                for (int i = meio; i < vetorAux.tamanho; i++) {
                    vetorAux.elementos[i-meio] = vetorAux.elementos[i];
                }
                vetorAux.tamanho -= meio;
            } else if (valor < vetorAux.elementos[meio]){
                for (int i = 0; i < meio; i++) {
                    vetorAux.elementos[meio-1] = vetorAux.elementos[i];
                }
                vetorAux.tamanho -= meio;
            }
            vetorAux.mostrarElementos();
        }

    }

    public void organizarElementos(){
        if (this.capacidade == this.tamanho) {
            this.aumentarCapacidade();
        }
        int aux;
        for (int i = 0; i < this.tamanho; i++) {
            for (int j = 0; j < this.tamanho; j++) {
                if (this.elementos[j] > this.elementos[i]) {
                    aux = this.elementos[j];
                    this.elementos[j] = this.elementos[i];
                    this.elementos[i] = aux;

                }
            }
        }
    }
}