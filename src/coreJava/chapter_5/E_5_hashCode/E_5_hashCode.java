package coreJava.chapter_5.E_5_hashCode;

/*
* 字符串的散列码是由内容导出的，故str1 == str3*/
public class E_5_hashCode {
    public static void main(String[] args){
        String str1 = "hello";
        String str2 = "hell0";
        String str3 = "hello";

        System.out.println("str1: " + str1.hashCode() + ", str2: " + str2.hashCode()
                           + ", str3: " + str3.hashCode());
    }
}
