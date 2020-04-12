package MLDN.chapter_9.E_9_8;

class MyThread implements Runnable{
    public void run(){
        for (int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName() + "运行, i= " + i);
        }
    }
}

public class ThreadNameDemo {
    public static void main(String[] args) {
        MyThread my = new MyThread();
        new Thread(my).start();
        new Thread(my, "线程-A").start();
        new Thread(my, "线程-B").start();
        new Thread(my).start();
        new Thread(my).start();
    }
}
