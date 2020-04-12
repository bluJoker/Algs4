package MLDN.chapter_9.E_9_14;

class MyThread implements Runnable{
    public void run(){
        while (true){
            System.out.println(Thread.currentThread().getName() + "在运行。");
        }
    }
}

public class ThreadDaemon {
    public static void main(String[] args) {
        MyThread my = new MyThread();
        Thread t = new Thread(my, "线程-");
        t.setDaemon(true);
        t.start();
    }
}
