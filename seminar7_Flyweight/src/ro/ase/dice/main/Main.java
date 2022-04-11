package ro.ase.dice.main;

import ro.ase.dice.clase.Autobuz;
import ro.ase.dice.clase.AutobuzLinie;
import ro.ase.dice.clase.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie a1 = new Autobuz("model1", 2020, 20);
        AutobuzLinie a2 = new Autobuz("model2", 2020, 30);
        AutobuzLinie a3 = new Autobuz("model3", 2020, 15);
        AutobuzLinie a4 = new Autobuz("model5", 2019, 15);

        FlyweightFactory factory = new FlyweightFactory();

        a1.descrie(factory.getLinie(168));
        a2.descrie(factory.getLinie(226));
        a3.descrie(factory.getLinie(137));
        a4.descrie(factory.getLinie(168));
    }
}
