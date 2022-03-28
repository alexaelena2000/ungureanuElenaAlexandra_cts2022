package ro.ase.dice;
//lazy initialization
public class Singleton {
    private String nume;
    //private static Singleton instanta = new Singleton();
    private static Singleton instanta = null;

    private Singleton() {};
//"synchronized" ==> nu se permite apelarea functiei pentru al doilea thread pana nu termina primul thread
    public static synchronized Singleton getInstanta(){
        //return instanta;
        if(instanta==null){
            instanta = new Singleton();
        }
        return instanta;
    }
}
