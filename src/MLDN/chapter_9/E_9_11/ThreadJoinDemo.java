package MLDN.chapter_9.E_9_11;

class MyThread implements Runnable{
    public void run(){
        for (int i=0; i<50; i++){
            System.out.println(Thread.currentThread().getName() + "运行, i= " + i);
        }
    }
}

public class ThreadJoinDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt, "线程");
        t.start();
        for (int i = 0; i < 50; i++){
            /*if (i > 10){
                try {
                    t.join();
                }catch (Exception e){}
            }*/
            System.out.println("Main 线程运行 --> " + i);
        }
    }
}
