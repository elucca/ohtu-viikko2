package ohtu.verkkokauppa;

public class AlkupViitegeneraattori implements Viitegeneraattori {

    private static AlkupViitegeneraattori instanssi;

    public static AlkupViitegeneraattori getInstance() {
        if (instanssi == null) {
            instanssi = new AlkupViitegeneraattori();
        }

        return instanssi;
    }
    
    private int seuraava;
    
    private AlkupViitegeneraattori(){
        seuraava = 1;    
    }
    
    @Override
    public int uusi(){
        return seuraava++;
    }
}
