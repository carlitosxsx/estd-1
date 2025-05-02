public class Lampada extends Dispositivo implements Conectavel {

    public Lampada(String nome) {
        this.setNome(nome);
        this.setLigado(false);
        this.setConectado(false);
    }

    @Override
    public void executarAcao() {
        if (isConectado()) {
            if (this.isLigado()) {
                this.setLigado(false);
                System.out.println("Agora, a lâmpada " + this.getNome() + " está desligada.");
            } else {
                this.setLigado(true);
                System.out.println("Agora, a lâmpada " + this.getNome() + " está ligada.");
            }
        } else {
            System.out.println("A lâmpada " + this.getNome() + " não está conectada. Conecte-a para executar a ação.");
        }
    }

    @Override
    public void conectar() {
        if (!isConectado()) {
            this.setConectado(true);
            System.out.println("A lâmpada " + this.getNome() + " está conectada.");
        } else {
            System.out.println("A lâmpada " + this.getNome() + " já está conectada.");
            
        }
    }

    @Override
    public void desconectar() {
        if (isConectado()) {
            this.setConectado(false);
            this.setLigado(false);
            System.out.println("A lâmpada " + this.getNome() + " está desconectada.");
        } else {
            System.out.println("A lâmpada " + this.getNome() + " já está desconectada.");
            
        }    
    }

    public void mostrarEstado() {
        System.out.println("Lâmpada " + this.getNome() + ": " + (this.isLigado() ? "Ligada" : "Desligada") + ", " + (this.isConectado() ? "Conectada" : "Desconectada"));
    }

}
