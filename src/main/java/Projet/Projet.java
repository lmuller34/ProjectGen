package Projet;

import java.util.ArrayList;

public class Projet {

    private ArrayList<Tache> taches = new ArrayList<Tache>();
    private String nomProjet;

    public Projet(String nomProjet) {
        this.nomProjet = nomProjet;
        taches.clear();
    }

    public void rajouterTache(Tache tache) {
        taches.add(tache);
    }

    public void supprimerTache(Tache tache) {
        taches.remove(tache);
    }

    public void supprimerTache(int id) {
        for (int i = 0; i < taches.size(); i++) {
            if (taches.get(i).getId() == id) {
                taches.remove(i);
            }
        }
    }
    
    public Tache getTache(int i){
        return taches.get(i);
    }
    
    public void avancementProjet(int date){
        int tacheFinies = 0;
        for(int i=0;i<taches.size();i++){
            if(taches.get(i).getDateFin()<=date){
                tacheFinies++;
            }
        }
        if(taches.size()==0)
            return;
        System.out.println("Au " + date + " du mois, l\'avancement du projet est de " + (float)tacheFinies/taches.size()*100.0+ "%");
    }
    
    

    public String toString() {
        String tmp = "nomProjet: ";
        tmp += nomProjet + "\n";
        for (int i = 0; i < taches.size(); i++) {
            tmp += taches.get(i) + "\n";
        }
        return tmp;
    }
}

