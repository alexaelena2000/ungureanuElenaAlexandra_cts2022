package ro.ase.dice.main;

import ro.ase.dice.clase.Autobuz;
import ro.ase.dice.clase.ComandaPlecare;
import ro.ase.dice.clase.Operator;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        Autobuz autobuz1 = new Autobuz("Mercedes");
        Autobuz autobuz2 = new Autobuz("Otokar");

        operator.invoca(new ComandaPlecare(autobuz1,300));
        operator.invoca(new ComandaPlecare(autobuz1,108));
        operator.invoca(new ComandaPlecare(autobuz2,404));
        operator.invoca(new ComandaPlecare(autobuz2,108));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
