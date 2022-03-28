package mijlocTransport;

public class FabricaMijlocTransport {
    public static MijlocTransport getMijlocTransport(TipMijlocTransport tipMijlocTransport, String numarInmatriculare){
        switch (tipMijlocTransport){
            case Tramvai:
                return new Tramvai(numarInmatriculare);
            case Autobuz:
                return new Autobuz(numarInmatriculare);
            case Troleibuz:
                return new Troleibuz(numarInmatriculare);
            default:
                return null;
        }
    }
}
