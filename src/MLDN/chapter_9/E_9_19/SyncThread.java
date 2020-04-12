package MLDN.chapter_9.E_9_19;

/**
 * 可能的运行结果：
 * 卖票： ticket = 5 Thread-0
 * 卖票： ticket = 4 Thread-1
 * 卖票： ticket = 3 Thread-2
 * 卖票： ticket = 2 Thread-0
 * 卖票： ticket = 2 Thread-1
 * 卖票： ticket = 1 Thread-2
 * 卖票： ticket = 0 Thread-0
 * 卖票： ticket = -1 Thread-1
 * */

class MyThread implements Runnable{
    private int ticket = 5;
    public void run(){
        for (int i=0; i<100; ++i) {
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
}

public class SyncThread {
    public static void main(String args[]){
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        Thread t3 = new Thread(mt);
        t1.start();
        t2.start();
        t3.start();
    }
}
