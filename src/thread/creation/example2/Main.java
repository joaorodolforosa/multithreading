package thread.creation.example2;

/**
 *
 * @author Joao Rodolfo
 */
public class Main {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // código que executa uma nova thread
                System.out.println("Hello world from " + Thread.currentThread().getName());
            }
        });

        thread.start();
    }
}
