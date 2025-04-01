import estruturas.*;


public class VetorApp {

    public static void main(String[] args) {

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
        vetor.adicionarAoInicio(15);
        vetor.organizarElementos();
        vetor.mostrarElementos();

        vetor.buscaBinaria(54);

    }
}