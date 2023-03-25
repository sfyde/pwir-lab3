import java.util.concurrent.ExecutionException;

public class PKmon {
    public static void main(String[] args) {
        Bufor bufor = new Bufor();

        Producent producent = new Producent(bufor);
        Konsument konsument = new Konsument(bufor);

        producent.start();
        konsument.start();

        try{
            producent.join();
            konsument.join();
        } catch (InterruptedException ie){};

        System.out.println("Bufor " + bufor.wypisz());



    }
}
