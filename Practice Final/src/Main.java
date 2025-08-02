public class Main {
    public static void main(String[] args) {
        // create a new thread
        Thread thread = new Thread(new NumberPrinter());

        // start the thread
        thread.start();

        // wait for the thread to complete
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread has finished.");
    }
}
