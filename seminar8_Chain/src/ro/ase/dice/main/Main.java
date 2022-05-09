package ro.ase.dice.main;

import ro.ase.dice.clase.AutobuzHandler;
import ro.ase.dice.clase.MetrouHandler;
import ro.ase.dice.clase.TramvaiHandler;
import ro.ase.dice.clase.TroleibuzHandler;

public class Main {
    public static void main(String[] args) {
        AutobuzHandler autobuz = new AutobuzHandler(5);
        TroleibuzHandler troleibuz = new TroleibuzHandler(3);
        TramvaiHandler tramvai = new TramvaiHandler(10);
        MetrouHandler metrou = new MetrouHandler(1000);

        troleibuz.setHandler(autobuz);
        autobuz.setHandler(tramvai);
        tramvai.setHandler(metrou);

        troleibuz.afisareMijlocTransport(7);
        troleibuz.afisareMijlocTransport(20);
        troleibuz.afisareMijlocTransport(2);
        troleibuz.afisareMijlocTransport(4);

        System.out.println("De aici incepe exemplul pt cluj");
        //luam pt un alt oras care nu are metrou

        //dependency inversion ==>> ar trebui sa avem Handler = new AutobuzHandler;
        AutobuzHandler autobuzCluj=new AutobuzHandler(1000);
        TroleibuzHandler troleibuzCluj = new TroleibuzHandler(5);
        TramvaiHandler tramvaiCluj = new TramvaiHandler(2);

        tramvaiCluj.setHandler(troleibuzCluj);
        troleibuzCluj.setHandler(autobuzCluj);

        tramvaiCluj.afisareMijlocTransport(1);
        tramvaiCluj.afisareMijlocTransport(3);
        tramvaiCluj.afisareMijlocTransport(10);

    }
}