package ohtu.verkkokauppa;

public class AlkupViitegeneraattori implements Viitegeneraattori {
    
    private int seuraava;
    
    public AlkupViitegeneraattori(){
        seuraava = 1;    
    }
    
    @Override
    public int uusi(){
        return seuraava++;
    }
}
