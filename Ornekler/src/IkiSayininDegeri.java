import java.util.Scanner;

public class IkiSayininDegeri {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi1,sayi2;
        System.out.print("İlk değeri giriniz: ");
        sayi1=input.nextInt();
        System.out.print("İkinci değeri giriniz: ");
        sayi2=input.nextInt();

        int geciciDeger=sayi1;
        sayi1=sayi2;
        sayi2=geciciDeger;
        System.out.println("ilk sayi: "+sayi1);
        System.out.println("ikinci sayi: "+sayi2);




    }
}
