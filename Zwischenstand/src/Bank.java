public class Bank {
    String name;
    String standort;
    double geldvorort;

    public Bank(String name, String standort, double geldvorort){
        setGeldvorort(geldvorort);
        setName(name);
        setStandort(standort);
    }
    public void setGeldvorort(double geldvorort) {
        this.geldvorort = geldvorort;
    }
    public void setName(String name) {
        this.name = name;
    }   
    public void setStandort(String standort) {
        this.standort = standort;
    }
    public double getGeldvorort() {
        return geldvorort;
    }
    public String getName() {
        return name;
    }
    public String getStandort() {
        return standort;
    }
    

    
}
