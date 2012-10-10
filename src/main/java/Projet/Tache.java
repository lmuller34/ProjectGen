package Projet;

public class Tache {

    private String nom, description;
    private long id;
    private static long idGlobal = 0;
    private long datedbt, datefin;

    Tache() {
        this("","",0,0);
    }

    Tache(String givenName, String givenDesc, long dated, long datef) {
        nom = givenName;
        description = givenDesc;
        id = idGlobal;
        idGlobal++;
        datedbt = dated;
        datefin = datef;
    }

    public long getId() {
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
