package ohtu.verkkokauppa;

import java.util.ArrayList;

public class AlkupKirjanpito implements Kirjanpito {

    private ArrayList<String> tapahtumat;

    public AlkupKirjanpito() {
        tapahtumat = new ArrayList<String>();
    }

    @Override
    public void lisaaTapahtuma(String tapahtuma) {
        tapahtumat.add(tapahtuma);
    }

    @Override
    public ArrayList<String> getTapahtumat() {
        return tapahtumat;
    }
}
