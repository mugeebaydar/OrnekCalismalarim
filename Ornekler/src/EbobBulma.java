import java.util.Scanner;

public class EbobBulma {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int birinciSayi=input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int ikinciSayi=input.nextInt();

        System.out.println("İki sayının ebobu: "+ebobAlma(birinciSayi,ikinciSayi));
    }

    public static int ebobAlma(int sayi1, int sayi2) {

        int ebob = 1;
        for (int i = 1; i <= sayi1 && i <= sayi2; i++) {
            if ((sayi1 % i == 0) && (sayi2 % i == 0)) {
                ebob = i;
            }
        }
        return ebob;
    }
}
