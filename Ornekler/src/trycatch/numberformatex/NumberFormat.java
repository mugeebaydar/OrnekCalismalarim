package trycatch.numberformatex;

public class NumberFormat {
    public static void main(String[] args) {
        try {
            String b = "1d";
            int a;
            a = Integer.parseInt(b);
            System.out.println("Bu kod çalıştırılmayacak.");
        } catch (NumberFormatException hata) {
            hata.printStackTrace(); //hatanın bulunduğu satırı gösterir
            System.out.println("Yanlış tip dönüştürme yaptınız.");
        }
    }
}
