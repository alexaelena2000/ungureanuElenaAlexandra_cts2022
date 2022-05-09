package ro.ase.dice.clase;

import java.util.Collections;

public class ComandaPlecare implements IComanda {
    private Autobuz autobuz;
    private int nrLinie;

    public ComandaPlecare(Autobuz autobuz, int nrLinie) {
        this.autobuz = autobuz;
        this.nrLinie = nrLinie;
    }

    @Override
    public void executa() {
        autobuz.pleacaInCursa(nrLinie);
    }
}
