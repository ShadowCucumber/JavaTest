public class Mitarbeiter extends Mensch{
    int mitarbeiternummer;

    public Mitarbeiter(int mitarbeiternummer, String vorname, String nachname, int alter){
        super(vorname, nachname, alter);
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
