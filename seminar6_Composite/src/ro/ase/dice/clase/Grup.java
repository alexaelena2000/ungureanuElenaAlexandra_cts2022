package ro.ase.dice.clase;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

public class Grup implements MijlocTransport{
    private List<MijlocTransport> mijlocTransportList;
    private String denumire;

    public Grup(String denumire) {
        this.mijlocTransportList = new ArrayList<>();
        this.denumire = denumire;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(denumire);
        for (MijlocTransport mijlocTransport : mijlocTransportList) {
            mijlocTransport.afiseazaDescriere();
        }
    }

    @Override
    public void adaugaMijlocTransport(MijlocTransport mijlocTransport) throws ExecutionControl.NotImplementedException {
        mijlocTransportList.add(mijlocTransport);
    }

    @Override
    public void stergeMijlocTransport(MijlocTransport mijlocTransport) throws ExecutionControl.NotImplementedException {
        mijlocTransportList.remove(mijlocTransport);
    }

    @Override
    public MijlocTransport getMijlocTransport(int index) throws ExecutionControl.NotImplementedException {
        return mijlocTransportList.get(index);
    }
}
