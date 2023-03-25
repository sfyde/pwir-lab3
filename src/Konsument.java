public class Konsument extends Thread{
    private Bufor _buf;
    public Konsument(Bufor bufor){
        this._buf =bufor;
    }
    public void run() {
        for (int i = 0; i < 100; ++i) {
            System.out.println(_buf.get());
        }
    }
}
