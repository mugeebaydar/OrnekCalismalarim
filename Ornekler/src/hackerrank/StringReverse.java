package hackerrank;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        System.out.print("Bir ifade giriniz: ");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();

        scanner.close();

        String reversed=new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed)? "Yes": "No"); //IfThanElse ile kontrol
    }
}
