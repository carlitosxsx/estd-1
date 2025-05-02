public class FilaImpressao {
    private Documento[] fila;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaImpressao(int capacidade) {
        fila = new Documento[capacidade];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public void adicionarDocumento(Documento doc) {
        if (tamanho == fila.length) {
            System.out.println("Fila de impressão cheia! Não é possível adicionar.");
        } else {
            fila[fim] = doc;
            fim = (fim + 1) % fila.length;
            tamanho++;
        }
    }

    public Documento imprimirProximo() {
        if (estaVazia()) {
            System.out.println("Nenhum documento para imprimir.");
            return null;
        } else {
            Documento doc = fila[inicio];
            inicio = (inicio + 1) % fila.length;
            tamanho--;
            System.out.println("Imprimindo: " + doc);
            return doc;
        }
    }

    public void mostrarFila() {
        System.out.println("Documentos na fila:");
        for (int i = 0; i < tamanho; i++) {
            int indice = (inicio + i) % fila.length;
            System.out.println("- " + fila[indice]);
        }
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }
}