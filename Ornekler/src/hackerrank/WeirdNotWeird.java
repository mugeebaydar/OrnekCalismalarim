package hackerrank;

import java.util.Scanner;

public class WeirdNotWeird {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1 ve 100 arasında bir sayı giriniz: ");
        int N = input.nextInt();
        String cevap="";
        if(N<=1 || N<=100){
            if( (N%2==1 || ( (N%2==0) && (N>=6 && N <= 20 ) ) )){
                cevap="Weird";
            }
            else{
                cevap="Not Weird";
            }
            System.out.println(cevap);
        }
    }
}
