package fileislemleri;

import java.io.File;

public class DeleteAFile {
    public static void main(String[] args) {
        File file=new File("C:\\DosyaIslemleri\\dosyaOlustur.txt");
        file.delete();
    }
}
