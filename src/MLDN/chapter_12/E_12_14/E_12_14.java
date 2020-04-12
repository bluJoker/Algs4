package MLDN.chapter_12.E_12_14;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class E_12_14 {
    public static void main(String[] args){
        String path = File.separator + "Users" + File.separator + "matteo" + File.separator + "java_io"
                      + File.separator + "test.txt";
        File f = new File(path);
        try {
            OutputStream output = new FileOutputStream(f, true);

            // 字节流，处理的是字节数组
            String str = "\r\nbye wangw5920";
            byte[] b = str.getBytes(); //将字符串转换为字节数组

            output.write(b);
            output.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
