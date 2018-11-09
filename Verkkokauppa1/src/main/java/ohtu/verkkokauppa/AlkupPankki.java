package ohtu.verkkokauppa;

public class AlkupPankki implements Pankki {

    private static AlkupPankki instanssi;

    public static AlkupPankki getInstance() {
        if (instanssi == null) {
            instanssi = new AlkupPankki();
        }

        return instanssi;
    }
    private Kirjanpito kirjanpito;

    public AlkupPankki() {
        kirjanpito = Kirjanpito.getInstance();
    }

    @Override
    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa) {
        kirjanpito.lisaaTapahtuma("tilisiirto: tililtä " + tilille + " tilille " + tilille
                + " viite " + viitenumero + " summa " + summa + "e");

        // täällä olisi koodi joka ottaa yhteyden pankin verkkorajapintaan
        return true;
    }
}
