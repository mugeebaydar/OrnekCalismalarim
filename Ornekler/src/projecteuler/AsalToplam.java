package projecteuler;

public class AsalToplam {
    public static void main(String[] args) {
        int sonuc=0;
        for(int i=2; i<2000000; i++){
            if(asalSayilar(i)){
                //System.out.println(i);
                sonuc+=i;
            }
            int toplam=sonuc;
            System.out.println(toplam);
        }


    }
    public static boolean asalSayilar(int asalSayi){
        for(int i=2; i<asalSayi; i++){
            if(asalSayi%i==0){
                return false;
            }
        }
        return true;

    }
}
