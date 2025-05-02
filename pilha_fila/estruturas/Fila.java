public class Fila {
    private String[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    public Fila(int capacidade) {
        elementos = new String[capacidade];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public void enfileirar(String item) {
        if (tamanho == elementos.length) {
            System.out.println("Fila cheia! Não é possível enfileirar.");
        } else {
            elementos[fim] = item;
            fim = (fim + 1) % elementos.length;
            tamanho++;
        }
    }

    public String desenfileirar() {
        if (estaVazia()) {
            System.out.println("Fila vazia! Não é possível desenfileirar.");
            return null;
        } else {
            String item = elementos[inicio];
            inicio = (inicio + 1) % elementos.length;
            tamanho--;
            return item;
        }
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void mostrarFila() {
         System.out.print("Fila: ");
         for (int i = 0; i < tamanho; i++) {
             int indice = (inicio + i) % elementos.length;
             System.out.print(elementos[indice] + " ");
         }
         System.out.println();
    }
}
