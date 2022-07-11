public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listenerdone = System.out::println;
        OnTaskErrorListener listenererror = System.out::println;

        Worker worker = new Worker(listenerdone, listenererror);
        worker.start();
    }
}
