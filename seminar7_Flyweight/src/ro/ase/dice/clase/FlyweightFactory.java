package ro.ase.dice.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<Integer, Linie> linii;

    public FlyweightFactory() {
        this.linii = new HashMap<>();
    }

    public Linie getLinie(int nrLinie){
        if(linii.get(nrLinie)!=null){
            return linii.get(nrLinie);
        }
        else{
            linii.put(nrLinie, new Linie(nrLinie, "PrimaStatie", "UltimaStatie"));
            return linii.get(nrLinie);
        }
    }
}
