public class Kunde extends Mensch {
    int Kundennummer;


    public Kunde(int Kundennummer, String vorname, String nachname, int alter){
        super(vorname, nachname, alter);
        setKundennummer(Kundennummer);

    }
    public void setKundennummer(int kundennummer) {
        Kundennummer = kundennummer;
    }
    public int getKundennummer() {
        return Kundennummer;
    }
    
    
}
