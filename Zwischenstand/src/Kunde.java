public class Kunde extends Mensch {
    int Kundennummer;
    


    public Kunde(int Kundennummer, String vorname, String nachname, int alter, boolean rollstuhl){
        super(vorname, nachname, alter, rollstuhl);
        setKundennummer(Kundennummer);
        

    }
    public void setKundennummer(int kundennummer) {
        Kundennummer = kundennummer;
    }
    public int getKundennummer() {
        return Kundennummer;
    }

    public void showInfo(){
        System.out.println(getKundennummer());
    }
    
    
}
