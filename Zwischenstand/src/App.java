import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       
        Mensch m1 = new Kunde (1,"Carsten", "Müller", 38,true);
        Mensch m2 = new Mitarbeiter(12,"Scharlatanius", "Trump", 43,false);
       
        ArrayList<Mensch> menschen = new ArrayList<>();
        menschen.add(m1);
        menschen.add(m2);


        for (Mensch mensch : menschen) {
           mensch.showInfo();
        }

        if (m1.getRollstuhl()) {
            System.out.println("Der bre braucht Fahrstuhl");
        } else {
            System.out.println("Der bre kann treppen laufen");
            
        }
        
    }
}
