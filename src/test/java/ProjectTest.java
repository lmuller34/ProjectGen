
import org.junit.Assert;
import org.junit.Test;
import Projet.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProjectTest {

    @Test
    public void testProjet(){
        /* test de la creation d'un projet */
        Projet p = new Projet("projet");
        Assert.assertNotNull(p);
        
        /* Test la creation d'une tache */
         Tache  t = null;
        try {
            t = new Tache("Tache 1", "Description 1", 10, 1000);
        } catch (Exception ex) { }
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
         
         /* Verification des condition temporelle */
         Tache  t2=null;
        try {
             t2 = new Tache("Tache 1", "Description 1", 100000, 10);
        } catch (Exception ex) {}
         Assert.assertNull(t2);
          
    }
    

    @Test
    public void grosTest() throws Exception{
        /* Verifiction que tout marche pour pleins de tache. */
         long JOUR = 3600*24;
         long MAINTENANT = System.currentTimeMillis()/1000;
        
        Projet p = new Projet("projet");
       int MAX = 1000;
       for(int i=0;i<MAX;i++) {
            p.rajouterTache(new Tache(("Tache "+String.valueOf(i)), ("Description "+String.valueOf(i)),MAINTENANT-1000,(long)(MAINTENANT+ Math.random()*10*JOUR+10)));
        }
        Assert.assertEquals(p.getNbTaches(), MAX);
              System.out.println(p);
        p.avancementProjet();
    }
}
