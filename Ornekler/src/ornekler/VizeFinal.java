package ornekler;

import java.util.Scanner;

public class VizeFinal {
    public static void main(String[] args) {
        System.out.println("Vize-Final Not Hesaplaması ve Harfli Sistemde Not");
        Scanner puan=new Scanner(System.in);
        double ortalama;
        System.out.print("Vize Notunuzu Giriniz: ");
        int vizeNot=puan.nextInt();
        System.out.print("Final Notunuzu Giriniz: ");
        int finalNot=puan.nextInt();

        ortalama=(vizeNot*0.40 + finalNot*0.60);
        System.out.println("Vize ve Final Ortalamanız: "+ortalama);
        if(ortalama>=60){
            System.out.println("Ortalamanız: "+ortalama + " Geçtiniz.");
        }else{
            System.out.println("Ortalamanız: "+ortalama + " Kaldınız.");
        }

        System.out.println("Harf Notunuzu Öğrenin");

        if(80<=ortalama){
            System.out.println("Harf Notunuz: AA - "+ortalama);
        }
        else if(71<=ortalama){
            System.out.println("Harf Notunuz: BA - "+ortalama);
        }
        else if (63<=ortalama){
            System.out.println("Harf Notunuz: BB - "+ortalama);
        }
        else if (55<=ortalama){
            System.out.println("Harf Notunuz: CB - "+ortalama);
        }
        else if (50<=ortalama){
            System.out.println("Harf Notunuz: CC - "+ortalama);
        }
        else if (45<=ortalama){
            System.out.println("Harf Notunuz: DC - "+ortalama);
        }
        else if (35<=ortalama){
            System.out.println("Harf Notunuz: DD - "+ortalama);
        }
        else if (0<=ortalama){
            System.out.println("Harf Notunuz: FF - "+ortalama);
        }
        System.out.println(":)");
    }
}
