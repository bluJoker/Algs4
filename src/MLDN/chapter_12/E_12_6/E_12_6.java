package MLDN.chapter_12.E_12_6;

import java.io.File;

public class E_12_6 {
    public static void main(String[] args){
        File f = new File(File.separator + "Users" + File.separator + "matteo" + File.separator + "java_io"
                         + File.separator + "test.txt");
        if (f.exists()){
            f.delete();
        }else {
            try {
                f.createNewFile();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
