package MLDN.chapter_7.E_7_3;

public class E_7_3 {
    public static void main(String args[]){
        System.out.println("*****计算开始*****");
        int i = 10;
        int j = 0;
        try {
            int temp = i / j;
            System.out.println("两个数字相除结果：" + temp);
        }catch (ArithmeticException e){
            System.out.println("出现异常：" + e);
        }finally {
            System.out.println("不管是否出现异常，都执行此代码");
        }
        System.out.println("*****计算结束*****");
    }
}
