package Projet;

public class Main {

    
    
    public static void main(String[] args) {
        long JOUR = 3600*24;
        long MAINTENANT = System.currentTimeMillis()/1000;
        
        Projet p = new Projet("Test");
        System.out.println("Creation du projet et ajout des taches 1 à 6");
        p.rajouterTache(new Tache("Tache 1", "Je dois dormir lundi", MAINTENANT-2*JOUR,  MAINTENANT+2*JOUR));
        p.rajouterTache(new Tache("Tache 2", "Je dois manger",  MAINTENANT-1*JOUR,  MAINTENANT+5*JOUR));
        p.rajouterTache(new Tache("Tache 3", "Je dois travailler",MAINTENANT-1*JOUR,  MAINTENANT+5*JOUR));
        p.rajouterTache(new Tache("Tache 4", "Je dois sortir lundi",MAINTENANT-1*JOUR,  MAINTENANT+5*JOUR));
        p.rajouterTache(new Tache("Tache 5", "Je dois me lever", MAINTENANT-1*JOUR,  MAINTENANT+5*JOUR));
        p.rajouterTache(new Tache("Tache 6", "Je dois bouger", MAINTENANT-5*JOUR,  MAINTENANT-2*JOUR));
        System.out.println(p.toString());
        
        System.out.println("Arret des taches 1 et 4");
        p.supprimerTache(1);
        p.supprimerTache(4);
        System.out.println(p.toString());
        
        p.avancementProjet();
        p.avancementProjet(MAINTENANT+5*JOUR);
        p.avancementProjet();
        System.out.println("");
    }
}
