package thread.creation.example2;

/**
 *
 * @author Joao Rodolfo
 */
public class Main {

    public static void main(String[] args) {
        Thread thread = new NovaThread();
        thread.start();

    }

    private static class NovaThread extends Thread {

        @Override
        public void run() {
            System.out.println("Hello world from " + this.getName());
        }
    }
}
