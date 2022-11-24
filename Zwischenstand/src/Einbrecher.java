public class Einbrecher extends Mensch {
 Integer anzahleinbruch;

    public Einbrecher(Integer anzahleinbruch, String vorname, String nachname, int alter, boolean rollstuhl){
    super(vorname, nachname, alter, rollstuhl);
    setAnzahleinbruch(anzahleinbruch);
}

    public void setAnzahleinbruch(Integer anzahleinbruch) {
        this.anzahleinbruch = anzahleinbruch;
    }
    public Integer getAnzahleinbruch() {
        return anzahleinbruch;
    }
    public void showInfo(){
        System.out.println(getAnzahleinbruch());
    }

    
}
