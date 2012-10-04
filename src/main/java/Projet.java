
import java.util.ArrayList;

public class Projet {

    private ArrayList<Tache> taches = new ArrayList<Tache>();
    private String nomProjet;

    Projet(String nomProjet) {
        this.nomProjet = nomProjet;
        taches.clear();
    }

    void rajouterTache(Tache tache) {
        taches.add(tache);
    }

    void supprimerTache(Tache tache) {
        taches.remove(tache);
    }

    void supprimerTache(int id) {
        for (int i = 0; i < taches.size(); i++) {
            if (taches.get(i).getId() == id) {
                taches.remove(i);
            }
        }
    }

    public String toString() {
        String tmp = "";
        tmp += nomProjet + "\n";
        for (int i = 0; i < taches.size(); i++) {
            tmp += taches.get(i) + "\n";
        }
        return tmp;
    }

    public boolean tachePresente(Tache t){
        return taches.contains(t);
    }
}

