package MLDN.chapter_7.E_7_13;

class Math{
    public int div(int i, int j) throws Exception{
        System.out.println("*****计算开始*****");
        int temp = 0;
        try {
            temp = i / j;
        }catch (Exception e){
            throw e;
        }finally {
            System.out.println("*****计算结束*****");
        }
        return temp;
    }
}
public class E_7_13 {
    public static void main(String args[]){
        Math m = new Math();
        try {
            System.out.println("除法操作：" + m.div(10, 0));
        }catch (Exception e){
            System.out.println("异常产生：" + e);
        }
    }
}
