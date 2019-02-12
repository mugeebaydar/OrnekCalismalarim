import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Hipotenüs hesaplama");
        System.out.print("İlk Kenarı giriniz: ");
        double kenar=input.nextDouble();
        System.out.print("İkinci Kenarı giriniz: ");
        double kenar1=input.nextDouble();
        double hipotenus=(kenar*kenar)+(kenar1*kenar1);
        System.out.println(hipotenus);

    }
}
