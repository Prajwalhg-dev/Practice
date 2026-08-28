class Mythread extends Thread {
    public void run() {
        System.out.println("This is the thread");
    }
    public void runnable() {
        System.out.println("This is the runnable thread");
    }

}
    public class Main {
    public static void main (String[] args) {
        Mythread mythread = new Mythread();
        mythread.runnable();
        System.out.println("This is the main thread");

    }
}