package MLDN.chapter_9.E_9_9;

/**
 * 主方法直接通过Runnable接口的子类对象调用其中的run()方法，另外一个是通过线程对象调用start()方法启动的
 * 从结果中发现，主方法实际上也是一个线程
 *
 * 主方法实际上也是一个线程
 * 在Java运行时至少会启动两个线程：main线程、垃圾收集线程
 * */

class MyThread implements Runnable{
    public void run(){
        for (int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName() + "运行, i= " + i);
        }
    }
}

public class CurrentThreadDemo {
    public static void main(String[] args) {
        MyThread my = new MyThread();
        new Thread(my).start();
        my.run();
    }
}

/*
 * 主方法实际上也是一个线程
 * 在Java运行时至少会启动两个线程：main线程、垃圾收集线程
 * */
