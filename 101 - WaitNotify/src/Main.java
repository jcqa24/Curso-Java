class EsperaNoti{
    public synchronized void Esperar() throws InterruptedException {
        System.out.println("Esperando...");
        wait();
        System.out.println("Liberado...");
    }

    public synchronized void Liberar() throws InterruptedException {
        System.out.println("Llegando a liberar");
        Thread.sleep(2000);
        notify();
        System.out.println("El hilo ha sido liberado");
    }

}

public class Main {
    public static void main(String[] args) {
        EsperaNoti en = new EsperaNoti();

        Thread espera = new Thread( () -> {
            try {
                en.Esperar();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } );

        Thread liberar = new Thread( () -> {
            try {
                en.Liberar();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } );

        espera.start();
        liberar.start();
    }
}