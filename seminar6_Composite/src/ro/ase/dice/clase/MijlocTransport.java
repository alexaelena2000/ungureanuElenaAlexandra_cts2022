package ro.ase.dice.clase;

import jdk.jshell.spi.ExecutionControl;

public interface MijlocTransport {
    void afiseazaDescriere();
    void adaugaMijlocTransport(MijlocTransport mijlocTransport) throws ExecutionControl.NotImplementedException;
    void stergeMijlocTransport(MijlocTransport MijlocTransport) throws ExecutionControl.NotImplementedException;
    MijlocTransport getMijlocTransport(int index) throws ExecutionControl.NotImplementedException;
}
