package java_interview.p_58;

class Obj implements Cloneable{
    private int aInt = 0;
    public int getaInt(){
        return aInt;
    }
    public void setaInt(int int1){
        this.aInt = int1;
    }
    public void changeInt(){
        this.aInt = 1;
    }

    public Object clone(){
        Object o = null;
        try {
            o = (Obj)super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }

        return o;
    }
}

public class clone {
    public static void main(String[] args){
        Obj a = new Obj();
        Obj b = (Obj)a.clone();
        //Obj b = a;
        b.changeInt();
        System.out.println("a: " + a.getaInt());
        System.out.println("b: " + b.getaInt());
    }
}
