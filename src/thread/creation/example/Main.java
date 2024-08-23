package thread.creation.example;

/**
 *
 * @author Joao Rodolfo
 */
public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // código que será executado com uma nova thread
                System.out.println("Estamos em thread: " + Thread.currentThread().getName());

            }
        });

        System.out.println("Estamos em um thread: "
                + Thread.currentThread().getName() + " antes de iniciar uma nova thread");
        thread.start();
        System.out.println("Estamos em um thread: "
                + Thread.currentThread().getName() + " após finalizar uma nova thread");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Erro em " + Thread.currentThread().getName() + ": " + ex);
        }
    }
}
