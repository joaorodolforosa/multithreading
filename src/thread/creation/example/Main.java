package thread.creation.example;

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
            // código que será executado na nova thread
            System.out.println("Estamos em thread: " + Thread.currentThread().getName()); 
        }
    }
}
