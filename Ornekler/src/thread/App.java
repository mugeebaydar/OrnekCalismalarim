package thread;

public class App {
    public static void main(String[] args) {

        ThreadClass islem1=new ThreadClass("Müge","Baydar");
        ThreadClass islem2=new ThreadClass("Ali","Yılmaz");
        islem1.start();
        islem2.start();
        //islem2.stop();

    }
}
