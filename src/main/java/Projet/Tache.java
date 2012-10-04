package Projet;

public class Tache {

    private String nom, description;
    private long id;
    private static long idGlobal = 0;

    Tache() {
        this("","");
    }

    Tache(String givenName, String givenDesc) {
        nom = givenName;
        description = givenDesc;
        id = idGlobal;
        idGlobal++;
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

    public String toString() {
        return "Tache " + id + "  : " + nom;
    }
}
