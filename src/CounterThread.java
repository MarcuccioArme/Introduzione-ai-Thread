public class CounterThread extends Thread {

    public void run() {
        try {
            for (int i=0; i<10; i++) {
                System.out.println(i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("ERRORE");
        }
    }

}
