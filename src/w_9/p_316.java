package w_9;

class Point<T>{
    private T var;
    public T getVar(){
        return var;
    }
    public void setVar(T var){
        this.var = var;
    }
}

public class p_316 {
    public static void main(String args[]){
        Point<String> p = new Point<String>();
        p.setVar("MLDN");
        System.out.println(p.getVar().length());
    }
}
