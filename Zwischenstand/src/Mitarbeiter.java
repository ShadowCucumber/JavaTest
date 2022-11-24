public class Mitarbeiter extends Mensch{
    int mitarbeiternummer;

    public Mitarbeiter(int mitarbeiternummer, String vorname, String nachname, int alter, boolean rollstuhl){
        super(vorname, nachname, alter, rollstuhl);
        setMitarbeiternummer(mitarbeiternummer);

    }
    public void setMitarbeiternummer(int mitarbeiternummer) {
        this.mitarbeiternummer = mitarbeiternummer;
    }
    public int getMitarbeiternummer() {
        return mitarbeiternummer;
    }   

    public void showInfo(){
        System.out.println(getMitarbeiternummer());
    }


    
}
