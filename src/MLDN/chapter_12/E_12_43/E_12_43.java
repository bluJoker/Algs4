package MLDN.chapter_12.E_12_43;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class E_12_43 {
    public static void main(String[] args) throws Exception{
        String path = File.separator + "Users" + File.separator + "matteo" + File.separator + "java_io"
                + File.separator + "test.txt";
        InputStream input = new FileInputStream(path);

        // public static void setIn(InputStream in)
        // 将标准输入重定向到参数in，即从in中读取数据
        System.setIn(input);
        byte[] b = new byte[1024];
        int len = System.in.read(b);
        System.out.println("输出：" + new String(b, 0, len));
        input.close();
    }
}
