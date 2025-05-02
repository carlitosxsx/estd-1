public class Pilha {
    private String[] elementos;
    private int topo;
    
    public Pilha(int capacidade) {
        elementos = new String[capacidade];
        topo = -1; 
    }

    public void empilhar(String item) {
        if (topo < elementos.length - 1) {
            topo++;
            elementos[topo] = item;
        } else {
            System.out.println("Pilha cheia! Não é possível empilhar.");
        }
    }

    public String desempilhar() {
        if (!estaVazia()) {
            String item = elementos[topo];
            topo--;
            return item;
        } else {
            System.out.println("Pilha vazia! Não é possível desempilhar.");
            return null;
        }
    }
    
    public boolean estaVazia() {
        return topo == -1;
    }
    
    public String verTopo() {
        if (!estaVazia()) {
            return elementos[topo];
        } else {
            return null;
        }
    }

    public void mostrarPilha(){
        for (int i = 0; i < elementos.length; i++) {
            System.out.println("| " + this.elementos[i] + " |");
        }
    }
    
}