package classWorks;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new ExampleThread1();
        Thread thread1 = new ExampleThread1();
        Thread thread2 = new ExampleThread1();
        thread.start();
        thread.join();
        System.out.println(thread.getState());
        Thread[] arrThread = {thread, thread1, thread2};
        ThreadProcessor.findAndStartThread(arrThread);
    }
}

// https://docs.google.com/forms/d/e/1FAIpQLSep0aEbYth-WApnyJaVkNOq_tbRZvZWng18oN_6Lw7QOP1RNQ/viewscore?viewscore=AE0zAgBWePnQ7XU76593iddv1S45OYLyNDaUpYXWACBUmQU54CDPNGFQ_yzR3sM93UEpA_M
// https://docs.google.com/forms/d/e/1FAIpQLSfARLQG1RKXIl8Rp0rqJqd0cJwza1Zvg5yIQwI4OAfhXJOVHQ/viewscore?viewscore=AE0zAgAxO9yusR_nfR-k3makw3GOIBEnKztf9NgKEHGVbnLK1KtShY_RrKLAYXjc8As4-NY
// https://docs.google.com/forms/d/e/1FAIpQLSfXJN_7ENILvW5gj6W50f8EOeaEtfIvIn_EtglhIFacB1xFOQ/viewscore?viewscore=AE0zAgDMxCKEvzOktD_1mUiUJOcd48PfEJBLGKj47Y_kcynT6qJdg4F3JeGcT3gx5M6usiY