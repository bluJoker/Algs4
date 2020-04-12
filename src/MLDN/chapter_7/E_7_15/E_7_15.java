package MLDN.chapter_7.E_7_15;

/*
* 自定义异常只需要继承Exception类即可
* */

class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}

public class E_7_15 {
    public static void main(String args[]){
        try {
            throw new MyException("自定义异常");
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println(e);
        }
    }
}
