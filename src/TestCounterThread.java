public class TestCounterThread {
    public static void main(String[] args) {
        CounterThread ct = new CounterThread();
        ct.start();

        FiglioCheStampa fs = new FiglioCheStampa();
        fs.start();

        System.out.println("Il Padre muore.");
    }
}
