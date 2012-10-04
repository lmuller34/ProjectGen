
public class Main {

    public static void main(String[] args) {
        Projet p = new Projet("Test");
        p.rajouterTache(new Tache("Tache 1", "Je suis la tache 1"));
        p.rajouterTache(new Tache("Tache 2", "Je suis la tache 2"));

        System.out.println(p);
    }
}
