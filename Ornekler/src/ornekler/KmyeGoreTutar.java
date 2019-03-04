package ornekler;

import java.util.Scanner;

public class KmyeGoreTutar {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Aracınız kilometrede kaç kuruş yakıyor? örneğin:0,32");
        double kurus=input.nextDouble();
        System.out.print("aracınızla kaç km gittiniz?");
        int km=input.nextInt();
        double tutar=km*kurus;
        System.out.println("Ödenecek tutar: "+tutar+" TL'dir.");

    }
}
