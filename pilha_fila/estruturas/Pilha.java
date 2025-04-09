package pilha_fila.estruturas;

public class Pilha {
    private int topo;
    private String[] elementos;
    private int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new String[this.capacidade];
        this.topo = -1;
    }

    public void aumentarCapacidade(){
        System.out.println("Aumentando capacidade de " + this.capacidade + " para " + (this.capacidade += (this.capacidade / 2)));
        this.capacidade += (this.capacidade / 2);
    }

    public void empilhar(String novoElemento){
        if (this.topo >= this.capacidade - 1){
            this.aumentarCapacidade();
        }
        System.out.println(topo);
        this.topo++;
        System.out.println(topo);
        this.elementos[topo] = novoElemento;
    }

    public void mostrarPilha(){
        for (int i = 0; i < capacidade; i++) {
            System.out.println("| " + this.elementos[i] + " |");
        }
    }
}
