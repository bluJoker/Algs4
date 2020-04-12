package MLDN.chapter_12.E_12_53;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // 修改输入数据的分隔符
        scan.useDelimiter("\n");
        System.out.print("输入数据：");
        String str = scan.next();
        System.out.println("输出：" + str);
    }
}
