import estruturas.*;

public class VetorApp {

    public static void main(String[] args) {

        // -------------VETOR-------------
        Vetor vetor = new Vetor(10);

        vetor.adicionar(50);
        vetor.adicionar(12);
        vetor.adicionar(54);
        vetor.adicionar(33);
        vetor.adicionar(7);
        vetor.adicionar(9);
        vetor.adicionar(21);
        vetor.adicionar(16);
        vetor.adicionar(42);
        vetor.adicionar(27);

        vetor.mostrarElementos();

        System.out.println("Adicionando no inicio...");
        vetor.adicionarAoInicio(15);
        vetor.mostrarElementos();

        System.out.println("Procurando por busca binaria...");
        String mensagem = vetor.buscaBinaria(1)
                ? "Valor encontrado!"
                : "Valor não encontrado :(";
        System.out.println(mensagem);

        // -------------LISTAS-------------
        Lista lista = new Lista();

        lista.adicionarAoInicio(50);
        lista.adicionarAoInicio(12);
        lista.adicionarAoInicio(54);
        lista.adicionarAoInicio(33);
        lista.adicionarAoInicio(7);
        lista.adicionarAoInicio(9);
        lista.adicionarAoInicio(21);
        lista.adicionarAoInicio(16);
        lista.adicionarAoInicio(42);
        lista.adicionarAoInicio(27);

        lista.mostrarNos();

        System.out.println("Adicionando ao final...");
        lista.adicionarAoFim(15);
        lista.mostrarNos();

        System.out.println("Contando Nos... Quantidade: " + lista.contaNos());

        // -------------ITERADOR-------------
        Iterador iterador = lista.getIterador();

        // avança até o índice 2;
        iterador.proximo();
        iterador.proximo();
        System.out.println("Inserindo valor APOS atual...");
        iterador.inserirAposAtual(26);
        lista.mostrarNos();

        // avança até o índice 5
        iterador.proximo();
        iterador.proximo();
        iterador.proximo();
        System.out.println("Removendo valor APOS atual...");
        iterador.removerAposAtual();
        lista.mostrarNos();

        // avança até o índice 6
        iterador.proximo();
        System.out.println("Inserindo valor ANTES atual...");
        iterador.inserirAntesAtual(61);
        lista.mostrarNos();

        System.out.println("Removendo valor ANTES atual...");
        iterador.removerAntesAtual();
        lista.mostrarNos();
    }
}