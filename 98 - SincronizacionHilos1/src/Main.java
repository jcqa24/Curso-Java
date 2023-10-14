public class Main {
    private int contador = 0;
    private final Object lock = new Object();


    public void realizarTarea(){

        int i;
        for(i=0; i<1000;i++){
                synchronized (lock){
                    contador++;
                }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int obtenerContador(){
        return contador;
    }

    public static void main(String[] args) throws InterruptedException {
        Main m1 = new Main();

        Thread t1 = new Thread( () -> m1.realizarTarea());
        Thread t2 = new Thread( () -> m1.realizarTarea());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Contador: "+ m1.obtenerContador());
    }
}