
public class Main {

    public static void main(String[] args) {
        Projet p = new Projet("Test");
        p.rajouterTache(new Tache("Tache 1", "Je suis la tache 1"));
        System.out.println(p);
    }
}
