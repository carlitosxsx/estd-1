import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcao;

        Scanner scanner = new Scanner(System.in);
        Lampada lampada = new Lampada("Inteligente");

        do {

            System.out.println("==========MENU==========");
            System.out.println("[1] Ligar / Desligar");
            System.out.println("[2] Conectar");
            System.out.println("[3] Desconectar");
            System.out.println("[4] Mostrar estado atual da lâmpada");
            System.out.println("[0] Sair");
            System.out.println("Escolha uma opção para a lâmpada " + lampada.getNome() + ": ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    lampada.executarAcao();
                    break;
                case 2:
                    lampada.conectar();
                    break;
                case 3:
                    lampada.desconectar();
                    break;
                case 4:
                    lampada.mostrarEstado();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
            
        } while (opcao != 0);

        scanner.close();
        System.out.println("Programa encerrado.");

    }
}
