package Projet;

public class Tache {

    private String nom, description;
    private int id;
    private static int idGlobal = 0;
    private long datedbt, datefin;

    public Tache() throws Exception {
        this("","",0,0);
    }

    public Tache(String nom, String description, long datedbt, long datefin) throws Exception {
        this.nom = nom;
        this.description = description;
        id = idGlobal;
        idGlobal++;
        
        if(datedbt>datefin)
            throw new Exception("Date de debut et de fin du projet incorrecte !");
        
        this.datedbt = datedbt;
        this.datefin = datefin;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getDateFin() {
        return datefin;
    }
        
    public String toString() {
        long  actuel = System.currentTimeMillis()/1000;
        double f = 100.0*(actuel-datedbt)/ (datefin-datedbt);
        return "id: " + id + "  | nom: " + nom + " | datedbt: " + datedbt + " | datefin: " + datefin+"  "+String.valueOf(f).substring(0, Math.min(String.valueOf(f).length(), 4)) +"%";
    }
}
