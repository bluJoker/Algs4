package MLDN.chapter_9.E_9_20;

class MyThread implements Runnable{
    private int ticket = 5;
    public void run(){
        for (int i=0; i<100; ++i) {
            this.sale();
        }
    }
    public synchronized void sale(){
        if (ticket > 0) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("卖票： ticket = " + ticket-- + " " +
                    Thread.currentThread().getName());
        }
    }
}

public class SyncDemo02 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        Thread t3 = new Thread(mt);
        t1.start();
        t2.start();
        t3.start();
    }
}
