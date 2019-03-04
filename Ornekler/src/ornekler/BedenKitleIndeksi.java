package ornekler;

import java.util.Scanner;

public class BedenKitleIndeksi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kilonuzu giriniz: ");
        double kilo=input.nextDouble();
        System.out.print("Boyunuzu giriniz: ");
        double boy=input.nextDouble();

        double bedenKitle=kilo/(boy*boy);

        System.out.println("Beden Kitle indeksi: "+bedenKitle);

    }
}
