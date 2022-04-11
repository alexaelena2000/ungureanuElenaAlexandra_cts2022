package ro.ase.dice.clase;

import java.util.ArrayList;
import java.util.List;

public class MijlocTransport {
    private List<ICalator> list;
    private int nrLinie;

    public MijlocTransport(int nrLinie) {
        this.list = new ArrayList<>();
        this.nrLinie = nrLinie;
    }

    public void adaugaCalator(ICalator calator){
        list.add(calator);
    }
    public void stergeCalator(ICalator calator){
        list.remove(calator);
    }

    public void trimiteMesaj(String mesaj){
        for (ICalator c: list) {
            c.primireMesaj(mesaj);
        }
    }

    public void trimiteMesajPlecareCapatLinie(){
        trimiteMesaj("Autobuzul numarul" + this.nrLinie+ " din capatul liniei: " + nrLinie);
    }
}
