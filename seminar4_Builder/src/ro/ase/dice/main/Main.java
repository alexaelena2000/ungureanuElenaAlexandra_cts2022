package ro.ase.dice.main;

import ro.ase.dice.clase.Autobuz;
import ro.ase.dice.clase.AutobuzBuilder;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNumarInmatriculare("altnumar");
        autobuzBuilder.setOprireCapatLinie(Boolean.FALSE);
        autobuzBuilder.setNrLocuri(80);

        Autobuz autobuz = new AutobuzBuilder().setOpenDoors(Boolean.FALSE).build();
        Autobuz autobuz1 = autobuzBuilder.build();
        System.out.println(autobuz.toString());
        System.out.println(autobuz1.toString());
    }
}
