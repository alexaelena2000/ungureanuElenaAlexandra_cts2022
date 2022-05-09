package ro.ase.dice.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<IComanda> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<>();
    }

    public void invoca(IComanda comandaPlecare){
        comenzi.add(comandaPlecare);
    }
    public void executaComanda(){
        if(comenzi.size()>0){
            comenzi.get(0).executa();
            comenzi.remove(0);
        }else{
            System.out.println("Nu mai exista comenzi");
        }
    }
}
