package hackerrank;

import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int [] array=new int[n];
        long toplam=0;

        for(int m:array){
            m=scanner.nextInt();
            toplam+=m;
        }
        System.out.println(toplam);
    }

}
