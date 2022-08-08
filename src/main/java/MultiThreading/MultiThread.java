package MultiThreading;

public class MultiThread implements Runnable{

	public static void main(String[] args) {
        Thread t1 = new Thread("Thread1");
        Thread t2 = new Thread("Thread2");
        t1.start();
        t2.start();
        System.out.println("Thread names are following:");
        System.out.println(t1.getName() + " " + t2.getName());
    }
    public void run() {
    }
}
