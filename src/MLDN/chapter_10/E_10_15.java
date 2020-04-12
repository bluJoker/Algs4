package MLDN.chapter_10;

/*
* 通配符
* */

class Info<T>{
    private T var;
    public T getVar(){
        return this.var;
    }
    public void setVar(T var){
        this.var = var;
    }
    public String toString(){
        return this.var.toString();
    }
}

public class E_10_15 {
    public static void main(String args[]){
        Info<String> i = new Info<String>();
        i.setVar("李兴华");
        fun(i);
    }
    public static void fun(Info<?> temp){
        System.out.println("内容：" + temp);
    }
}
