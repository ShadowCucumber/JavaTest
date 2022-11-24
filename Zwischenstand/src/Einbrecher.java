public class Einbrecher extends Mensch {
 Integer anzahleinbruch;

    public Einbrecher(Integer anzahleinbruch, String vorname, String nachname, int alter){
    super(vorname, nachname, alter);
    setAnzahleinbruch(anzahleinbruch);
}

    public void setAnzahleinbruch(Integer anzahleinbruch) {
        this.anzahleinbruch = anzahleinbruch;
    }
    public Integer getAnzahleinbruch() {
        return anzahleinbruch;
    }

    
}
