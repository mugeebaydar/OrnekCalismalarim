package fileislemleri;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DosyayaYazdir {
    public static void main(String[] args) {

        String str="Bunu dosyaya yazdir";
        File file=new File("C:\\DosyaIslemleri","dosya.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
                FileWriter fileWriter=new FileWriter(file);
                BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                bufferedWriter.write(str);
                bufferedWriter.write("devam eden yazı");
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
