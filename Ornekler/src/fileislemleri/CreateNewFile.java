package fileislemleri;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) {
        File file= new File("C:\\DosyaIslemleri\\dosyaOlustur.txt");
        try {
            file.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
