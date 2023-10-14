import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private int contador = 0;
    //private final Object lock = new Object();

    private ReentrantLock lock =new ReentrantLock();


    public void realizarTarea(){

        int i;
        for(i=0; i<1000;i++){
            try {
                if(lock.tryLock(20, TimeUnit.MILLISECONDS)){
                    try {
                        contador++;
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }finally {
                        lock.unlock();
                    }
                }else{
                    System.out.println("No logré hacer mi tarea :c");
                }
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
        Thread t3 = new Thread( () -> m1.realizarTarea());

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Contador: "+ m1.obtenerContador());
    }
}