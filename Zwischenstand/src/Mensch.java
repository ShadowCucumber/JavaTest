public class Mensch {
    String vorname;
    String nachname;
    int alter;

    public Mensch(String vorname, String nachname, int alter){
        setNachname(nachname);
        setVorname(vorname);
        setAlter(alter);
    }


    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public String getNachname() {
        return nachname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getVorname() {
        return vorname;
    }
    public void setAlter(int alter) {
        this.alter = alter;
    }
    public int getAlter() {
        return alter;
    }

    
}
