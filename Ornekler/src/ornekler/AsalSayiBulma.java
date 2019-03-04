package ornekler;

public class AsalSayiBulma {
    public static void main(String[] args) {

        for(int i=2; i<100; i++){
           if(asalSayilar(i)){
                System.out.println(i);
            }
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
