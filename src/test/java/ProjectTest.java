
import org.junit.Assert;
import org.junit.Test;
import Projet.*;


public class ProjectTest {

    @Test
    public void testProjet(){
        /* test de la creation d'un projet */
        Projet p = new Projet("projet");
        Assert.assertNotNull(p);
        
        /* Test la creation d'une tache */
         Tache  t = new Tache("Tache 1", "Description 1", 10, 1000);
         Assert.assertNotNull(t);

        
         /* Insertion d'une tache dans le projet */
         p.rajouterTache(t);
         Assert.assertEquals(p.getTache(t.getId()).getNom(), t.getNom());
         
         /* Suppression d'une tache dans le projet */
         p.supprimerTache(5);
         Assert.assertEquals(p.getTache(t.getId()).getNom(), t.getNom());

         p.supprimerTache(t);
         Assert.assertEquals(p.getTache(t.getId()), null);

         /* Ajout d'une tache deja presente */
         p.rajouterTache(t);
         p.rajouterTache(t);
         Assert.assertEquals(p.getNbTaches(), 1);
         
         
    }
    

}
