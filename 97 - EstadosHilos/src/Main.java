
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //getState()

        Thread thread = new Thread(() -> { // NEW
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hola soy un hilo");
        });

        System.out.println("Estado actual del hilo: "+thread.getState());

        thread.start(); //Runnable
        System.out.println("Estado despues de iniciar el hilo :"+thread.getState());

        thread.sleep(200); // Timed_Waiting -> tiempo limitado
        System.out.println("Estado despues de un tiempo de ejecucion "+thread.getState());

        // Blocked
        // Waiting

        thread.join();
        System.out.println("Estado despues de unirse al hilo: "+thread.getState());
    }
}
