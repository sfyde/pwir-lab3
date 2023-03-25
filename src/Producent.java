public class Producent extends Thread{
    private Bufor _buf;
    public Producent(Bufor bufor){
        this._buf =bufor;
    }

    public void run() {
        for (int i = 0; i < 100; ++i) {
            _buf.put(i);
        }
    }
}
