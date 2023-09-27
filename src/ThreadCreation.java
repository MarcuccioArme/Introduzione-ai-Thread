public class ThreadCreation implements Runnable {

    public ThreadCreation() {
        Thread ct = Thread.currentThread();
        ct.setName("Thread Principale (padre)");

        Thread t1 = new Thread(this, "Thread Figlio 1");
        Thread t2 = new Thread(this, "Thread Figlio 2");

        System.out.println("Il Thread attuale: " + ct);
        System.out.println("Thread Figlio 1: " + t1);
        System.out.println("Thread Figlio 2: " + t2);

        //Facciamo partire i Thread Figli
        t1.start();
        t2.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread Principale (padre) è stato interrotto.");
        }

        System.out.println("Il Thread Principale (padre) termina.");

    }

    public void run() {
        try {
            for (int i=10; i>0; i--) {
                System.out.println(" "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread figlio è stato interrotto.");
        }
    }

    public static void main(String[] args) {
        ThreadCreation tc = new ThreadCreation();
    }

}
