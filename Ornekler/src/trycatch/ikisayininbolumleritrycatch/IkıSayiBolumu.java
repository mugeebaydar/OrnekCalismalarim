package trycatch.ikisayininbolumleritrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Klavyeden girilen iki sayıyı birbirlerine bölen ve sonucu ekrana yazdıran try catch blokları içind
olan program.
 */
public class IkıSayiBolumu {
    public static void main(String[] args) {

        try {
            Scanner sayiGirisi = new Scanner(System.in);
            System.out.print("1.sayıyı giriniz: ");
            double bolunenSayi = sayiGirisi.nextDouble();
            System.out.print("2.sayıyı giriniz: ");
            double bolenSayi = sayiGirisi.nextDouble();
            double sonuc = bolunenSayi / bolenSayi;
            System.out.println("Sonuç: " + sonuc);
        } catch (InputMismatchException hata1) {
            System.out.println("Lütfen sadece sayı giriniz.." + "Exception hatası: " + hata1);
        } catch (ArithmeticException hata2) {
            System.out.println("Bölen sayı 0 olamaz!"+ "Exception hatası: "+hata2);
        } finally {
            System.out.println("İşlem sonlandı...");
        }

    }
}
