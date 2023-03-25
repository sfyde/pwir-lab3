public class Bufor {
    private int val = 0;
    public void put(int i) {
        val=val+i;
        System.out.println("Dodano produkt");
    }

    public int get() {
        int n;
        n=val;
        val--;
        System.out.println("Pobrano produkt");
        return n;
    }

    public int wypisz() {

        return val;
    }


}
