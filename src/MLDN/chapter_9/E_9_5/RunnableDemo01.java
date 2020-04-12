package MLDN.chapter_9.E_9_5;

/**
 * 无论是使用Thread还是Runnable实现多线程，最终都必须依靠Thread类才能启动多线程
 * */

class MyThread implements Runnable{
    private String name;
    public MyThread(String name){
        this.name = name;
    }
    public void run(){
        for (int i = 0; i < 10; ++i){
            System.out.println(name + "运行，i = " + i);
        }
    }
}

public class RunnableDemo01 {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("Thread A ");
        MyThread mt2 = new MyThread("Thread B ");
        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);
        t1.start();
        t2.start();
    }
}
