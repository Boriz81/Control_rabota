package classWorks;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new ExampleThread1();
        Thread thread1 = new ExampleThread1();
        Thread thread2 = new ExampleThread1();
        thread.start();
        thread1.start();
        System.out.println(thread.getState());
        Thread[] arrThread = {thread, thread1, thread2};
        ThreadProcessor.findAndStartThread(arrThread);
    }
}
