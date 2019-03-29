package ornekler;

import java.util.Scanner;

public class OnSayidanBuyukKucukBulma {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int sayi,enkucuk=999999999,enbuyuk=0;
        for(int i=1; i<=10; i++){
            System.out.print(i+" .sayıyı giriniz: ");
            sayi=input.nextInt();
            if(sayi>=enbuyuk){
              enbuyuk=sayi;
            }
            if(sayi<=enkucuk){
              enkucuk=sayi;
            }
        }
        System.out.println();
        System.out.println("en küçük: "+enkucuk);
        System.out.println("en büyük: "+enbuyuk);


    }
}
