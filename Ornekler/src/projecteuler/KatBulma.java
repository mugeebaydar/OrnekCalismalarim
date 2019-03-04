package projecteuler;

public class KatBulma {
    public static void main(String[] args) {
        /*
        * projecteular soru 1: 1000'e kadar olan 3 ve 5in katları olan sayıların toplamı
        * */
        int i;
        int sonuc=0,sonuc1=0,sonuc2=0,toplam=0;
        for(i=1; i<1000;i++){
            if (i%3==0 && i%5==0){
                System.out.println("15in kati "+i);
                sonuc+=i;
            }
            else if(i%3==0){
                System.out.println("3ün kati "+i);
                sonuc1+=i;
            }
            else if(i%5==0){
                System.out.println("5in kati "+i);
                sonuc2+=i;
            }
            else{
                System.out.println(i);
            }

        }
        toplam=sonuc+sonuc1+sonuc2;
        System.out.println("5in"+toplam);

    }

}
