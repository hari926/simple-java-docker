public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Springboot/Java container started...");

        while (true) {
            System.out.println("App is running... " + java.time.LocalDateTime.now());
            Thread.sleep(5000); // keep container alive
        }
    }
}
