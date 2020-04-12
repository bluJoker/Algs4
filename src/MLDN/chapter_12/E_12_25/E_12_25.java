package MLDN.chapter_12.E_12_25;

import java.io.*;

public class E_12_25 {
    public static void main(String[] args) throws Exception{
        String path = File.separator + "Users" + File.separator + "matteo" + File.separator + "java_io"
                + File.separator + "test.txt";
        File f = new File(path);
        Reader re = new FileReader(f);

        char[] c = new char[1024];
        int temp = 0;
        int len = 0;
        while ((temp = re.read()) != -1){
            c[len] = (char)temp;
            len++;
        }
        re.close();
        System.out.println(new String(c, 0, len));
    }
}
