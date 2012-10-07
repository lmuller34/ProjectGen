package Projet;

public class Main {

    public static void main(String[] args) {
        Projet p = new Projet("Test");
        System.out.println("Creation du projet et ajout des taches 1 à 6");
        p.rajouterTache(new Tache("Tache 1", "Je dois dormir lundi", 5, 12));
        p.rajouterTache(new Tache("Tache 2", "Je dois manger", 8, 20));
        p.rajouterTache(new Tache("Tache 3", "Je dois travailler", 7, 15));
        p.rajouterTache(new Tache("Tache 4", "Je dois sortir lundi", 2, 28));
        p.rajouterTache(new Tache("Tache 5", "Je dois me lever", 1, 7));
        p.rajouterTache(new Tache("Tache 6", "Je dois bouger", 4, 13));
        System.out.println(p.toString());
        
        System.out.println("Arret des taches 1 et 4");
        p.supprimerTache(1);
        p.supprimerTache(4);
        System.out.println(p.toString());
        
        p.avancementProjet(10);
        p.avancementProjet(14);
        p.avancementProjet(25);
        System.out.println("");
    }
}
