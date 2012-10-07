package Projet;

public class Tache {

    private String nom, description;
    private long id;
    private static long idGlobal = 0;
    private int datedbt, datefin;

    Tache() {
        this("","",0,0);
    }

    Tache(String givenName, String givenDesc, int dated, int datef) {
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

    public int getDateFin() {
        return datefin;
    }
        
    public String toString() {
        return "id: " + id + "  | nom: " + nom + " | datedbt: " + datedbt + " | datefin: " + datefin;
    }
}
