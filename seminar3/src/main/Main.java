package main;
import mijlocTransport.Autobuz;
import mijlocTransport.FabricaMijlocTransport;
import mijlocTransport.MijlocTransport;
import mijlocTransport.TipMijlocTransport;
import ro.ase.dice.*;

public class Main {

    public static void main(String[] args) {
        //SINGLETON
        Singleton s1 = Singleton.getInstanta();
        Singleton s2 = Singleton.getInstanta();
        System.out.println(s1);
        System.out.println(s2);

        //MIJLOC DE TRANSPORT
        MijlocTransport autobuz = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Autobuz, "9999999");
        MijlocTransport tramvai = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Tramvai, "9999999");
        MijlocTransport troleibuz = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Troleibuz, "9999999");

        System.out.println("Autobuz = " + autobuz.toString());
        System.out.println("Tramvai = " + tramvai);
        System.out.println("Troleibuz = " + troleibuz);
    }
}
