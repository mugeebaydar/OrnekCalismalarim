import java.util.Scanner;

public class GirilenSayiToplami {
    public static void main(String[] args) {
        Scanner girilenDeger = new Scanner(System.in);
        int i, sayi, toplam;

        System.out.println("Kaça kadar olan sayılara toplama işlemi yapılsın?");
        sayi = girilenDeger.nextInt();
        toplam = 0;
        for (i = 1; i <= sayi; i++) { //girilen sayıya kadar ve eşitlenene kadar döngüyü döndür
            toplam += i;  //değeri birer arttır
        }

        switch (sayi) {
            case 1:
                System.out.println("\n" + sayi + "=" + toplam);
                break;
            case 2:
                System.out.println("\n" + sayi + "=" + toplam);
            default:
                System.out.println("\n1+2+3+..+" + sayi + "=" + toplam);
        }
    }
}
