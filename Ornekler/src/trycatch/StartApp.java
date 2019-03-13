package trycatch;

public class StartApp {
    public static void main(String[] args) {
        int [] dizi= new int[-5];

        try{
            istisnaDurumu(dizi);
        }catch (NegativeArraySizeException ex){
            System.out.println("Dizi boyutu negatif değer olamaz.");
        }
    }
    public static void istisnaDurumu(int [] dizi){
        System.out.println(dizi[0]);

    }
}
