package exercise2;

public class SleepWaitDemo {
    private static Object lock = new Object();
	public static void main(String[] args) throws InterruptedException{
        Thread.sleep(5000);
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 5 second");
        synchronized (lock) {
            lock.wait(3000);
            System.out.println("Object '" + lock + "' is woken after waiting for 3 second");
            System.out.println("Thread '" + Thread.currentThread());
        }


	}

}
