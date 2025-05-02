public class EditorTexto {
    private String textoAtual;
    private Pilha pilhaDesfazer;
    private Pilha pilhaRefazer;

    public EditorTexto(int capacidade) {
        this.textoAtual = "";
        this.pilhaDesfazer = new Pilha(capacidade);
        this.pilhaRefazer = new Pilha(capacidade);
    }

    public void inserirTexto(String novoTexto) {
        pilhaDesfazer.empilhar(textoAtual);
        textoAtual += (textoAtual.isEmpty() ? "" : " ") + novoTexto;
        pilhaRefazer = new Pilha(pilhaRefazerCapacidade());
    }    

    public void desfazer() {
        if (!pilhaDesfazer.estaVazia()) {
            pilhaRefazer.empilhar(textoAtual); 
            textoAtual = pilhaDesfazer.desempilhar(); 
        } else {
            System.out.println("Não há nada para desfazer.");
        }
    }

    public void refazer() {
        if (!pilhaRefazer.estaVazia()) {
            pilhaDesfazer.empilhar(textoAtual); 
            textoAtual = pilhaRefazer.desempilhar(); 
        } else {
            System.out.println("Não há nada para refazer.");
        }
    }

    public void mostrarTexto() {
        System.out.println("Texto atual: " + textoAtual);
    }
    
    private int pilhaRefazerCapacidade() {
        return 10; 
    }
}