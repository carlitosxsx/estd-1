import estruturas.*;


public class VetorApp {

    public static void main(String[] args) {
        /*Lista lista = new Lista();
        lista.adicionarAoInicio(28);
        lista.adicionarAoInicio(27);
        lista.adicionarAoInicio(24);
        lista.adicionarAoInicio(21);
        lista.adicionarAoInicio(32);
        lista.adicionarAoInicio(12);
        lista.adicionarAoInicio(2);
        lista.mostrarNos();
        System.out.println("-----");
        lista.remover(21);
        lista.mostrarNos();*/

        Vetor vetor = new Vetor(10);

        vetor.adicionar(2);
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

        vetor.adicionarAoInicio(28);

        vetor.mostrarElementos();

    }
}