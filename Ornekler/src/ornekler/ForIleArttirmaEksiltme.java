package ornekler;

public class ForIleArttirmaEksiltme {
    public static void main(String[] args) {
        //10dan geriye birer birer eksiltme
        for(int i=10; i>=0; i--){
            System.out.print(i +" ");
        }

        //40dan geriye 10ar 10ar eksiltme
        for(int i=40; i>=0; i-=10){
            System.out.println( i +" ");
        }
    }
}
