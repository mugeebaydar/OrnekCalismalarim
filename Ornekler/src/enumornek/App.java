package enumornek;

public class App {
    public static void main(String[] args) {

        Days days=Days.Sali;
        System.out.println(days);

        Months months=Months.Nisan;
        System.out.println(months+ " yılın "+months.getAylar()+". ayıdır.");
    }
}
