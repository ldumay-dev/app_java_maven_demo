package demo;

/**
 * Classe de test unitaire
 * @author ldumay
 */
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

public class UtilitaireTest {
    // Test de la méthode direBonjour()
    @Test
    public void testDireBonjour() {
        // Préparer les données de test
        
        // Appeler la méthode à tester
        Utilitaire.direBonjour();
        
        // Écrire les assertions pour vérifier le comportement attendu
        // Par exemple, vérifier la sortie dans la console
        
        // Assertion 1 : Vérifier que la méthode a bien été appelée en vérifiant la sortie dans la console
        // Utilisez un ByteArrayOutputStream pour capturer la sortie standard (System.out)
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Utilitaire.direBonjour(); // Appel de la méthode
        assertEquals("Bonjour depuis la méthode direBonjour() !\n", outContent.toString());
        
        // Assertion 2 : Vérifier un comportement spécifique de la méthode (par exemple, son exécution)
        // Vous pourriez vérifier si la méthode a effectué une action précise ou si elle a renvoyé la bonne valeur
        // Par exemple, dans ce cas simple, on pourrait vérifier simplement qu'elle ne renvoie pas d'exception
        // ===> Assertion 2 : Vérifier que la méthode ne génère pas d'exception lors de son exécution
        try {
            Utilitaire.direBonjour();
        } catch (Exception e) {
            fail("La méthode direBonjour() ne devrait pas générer d'exception.");
        }
    }
}