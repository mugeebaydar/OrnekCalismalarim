import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        faktoriyel();
    }

    public static void faktoriyel() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int girilenDeger = input.nextInt();

        int faktoriyel = 1;

        while (girilenDeger > 0) {
            faktoriyel *= girilenDeger;
            girilenDeger--;
        }
        System.out.println("Girilen sayının faktöriyeli: " + faktoriyel);

    }
}
