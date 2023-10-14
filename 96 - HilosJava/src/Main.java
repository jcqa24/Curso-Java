public class Main {
    public static void main(String[] args) {
        Mitarea1 m1 = new Mitarea1();
        Thread h1 = new Thread(m1);

        Mitarea2 m2 = new Mitarea2();
        Thread h2 = new Thread(m2);

        h1.start();
        h2.start();
    }
}

class Mitarea1 implements Runnable{
    public void run(){
        System.out.println("Hola soy un hilo");
    }
}

class Mitarea2 implements Runnable{
    public void run(){
        System.out.println("Hola soy el hilo 2");
    }
}