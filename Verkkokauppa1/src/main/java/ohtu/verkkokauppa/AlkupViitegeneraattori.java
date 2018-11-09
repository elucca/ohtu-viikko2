package ohtu.verkkokauppa;

import org.springframework.stereotype.Component;

@Component
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
