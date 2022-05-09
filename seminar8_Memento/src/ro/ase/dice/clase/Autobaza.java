package ro.ase.dice.clase;

import java.util.ArrayList;
import java.util.List;

public class Autobaza {

    private List<MementoAutobuz> mementoAutobuzList;

    public Autobaza() {
        this.mementoAutobuzList = new ArrayList<>();
    }

    public  void adaugaMementoAutobuz(MementoAutobuz mementoAutobuz){
        mementoAutobuzList.add(mementoAutobuz);
    }

    public MementoAutobuz getMementoAutobuz(int index){
        return  mementoAutobuzList.get(index);
    }
}
