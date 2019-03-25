package enumornek;

public enum Months {
    Ocak(1),
    Subat(2),
    Mart(3),
    Nisan(4),
    Mayıs(5),
    Haziran(6),
    Temmuz(7),
    Agustos(8),
    Eylul(9),
    Ekim(10),
    Kasim(11),
    Aralik(12);

    private int aylar;

    Months(int aylar){
        this.aylar=aylar;
    }

    public int getAylar() {
        return aylar;
    }
}
