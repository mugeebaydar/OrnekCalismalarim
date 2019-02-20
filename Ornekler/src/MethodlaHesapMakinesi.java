import java.util.Scanner;

public class MethodlaHesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String islemler = "1-Toplama İşlemi\n" +
                "2-Çıkarma İşlemi\n" +
                "3-Çarpma İşlemi\n" +
                "4-Bolme İşlemi\n" +
                "5-Çıkış için Q ya basın";
        System.out.println("********************************************");
        System.out.println(islemler);
        System.out.println("********************************************");

        while (true) {
            System.out.print("İşlem seciniz: ");
            String islem = input.nextLine();
            if (islem.equals("Q")) {
                System.out.println("programdan çıkılıyor..");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Kaç sayıyı toplamak istiyorsunuz? 2 veya 3");
                int kacSayi = input.nextInt();
                if (kacSayi == 2) {
                    System.out.print("İlk sayıyı giriniz: ");
                    int a=input.nextInt();
                    System.out.print("İkinci sayiyi giriniz: ");
                    int b=input.nextInt();
                    input.nextLine();
                    System.out.println("Girdiğiniz sayıların toplamı: "+toplama(a,b));

                } else if (kacSayi == 3) {
                    System.out.print("İlk sayıyı giriniz: ");
                    int a=input.nextInt();
                    System.out.print("İkinci sayiyi giriniz: ");
                    int b=input.nextInt();
                    System.out.print("Üçüncü sayiyi giriniz: ");
                    int c=input.nextInt();
                    input.nextLine();
                    System.out.println("Girdiğiniz sayıların toplamı: "+toplama(a,b,c));

                } else {
                    System.out.println("Uygun metod bulunamadı...");
                }

            }
            else if(islem.equals("2")){
                System.out.print("İlk sayıyı giriniz: ");
                int a=input.nextInt();
                System.out.print("İkinci sayiyi giriniz: ");
                int b=input.nextInt();
                input.nextLine();
                System.out.println("Girdiğiniz sayıların farkları: "+cikarma(a,b));
            }
            else if(islem.equals("3")){
                System.out.print("Kaç sayıyı carpmak istiyorsunuz? 2 veya 3");
                int kacSayi = input.nextInt();
                if (kacSayi == 2) {
                    System.out.print("İlk sayıyı giriniz: ");
                    int a=input.nextInt();
                    System.out.print("İkinci sayiyi giriniz: ");
                    int b=input.nextInt();
                    input.nextLine();
                    System.out.println("Girdiğiniz sayıların carpımı: "+carpma(a,b));
                }else if (kacSayi == 3) {
                    System.out.print("İlk sayıyı giriniz: ");
                    int a=input.nextInt();
                    System.out.print("İkinci sayiyi giriniz: ");
                    int b=input.nextInt();
                    System.out.print("Üçüncü sayiyi giriniz: ");
                    int c=input.nextInt();
                    input.nextLine();
                    System.out.println("Girdiğiniz sayıların carpımı: "+toplama(a,b,c));

                } else {
                    System.out.println("Uygun metod bulunamadı...");
                }

            }
            else if(islem.equals("4")){
                System.out.print("İlk sayıyı giriniz: ");
                int a=input.nextInt();
                System.out.print("İkinci sayiyi giriniz: ");
                int b=input.nextInt();
                input.nextLine();
                System.out.println("Girdiğiniz sayıların bölümleri: "+bolme(a,b));

            }
            else{
                System.out.println("Geçersiz işlem...");
            }
        }


    }

    public static int cikarma(int a, int b) {
        return a - b;
    }

    public static double bolme(int a, int b) {
        return ((double) a / b);
    }

    public static int toplama(int a, int b) {
        return a + b;
    }

    public static int toplama(int a, int b, int c) {
        return a + b + c;
    }

    public static int carpma(int a, int b) {
        return a * b;
    }

    public static int carpma(int a, int b, int c) {
        return a * b * c;
    }
}
