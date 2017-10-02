import java.*;
/**
 * Décrivez votre classe ChaineCryptee ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class ChaineCryptee
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String chaineClair;
    private int decalage;

    /**
     * Constructeur d'objets de classe ChaineCryptee
     */
    private ChaineCryptee(String ChaineClair, int Decalage)
    {
        decalage = Decalage;
        chaineClair = ChaineClair;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public String Decrypte()
    {
        return chaineClair;
    }
    
    public static char decaleCaractere ( char c , int decalage ) {
     return (c < 'A' || c > 'Z' ) ? c : (char) ((( c - 'A' + decalage)%26 ) + 'A');
    }

    public String Crypte()
    {
        String ch = "";
        int i;
        char c;
        for(i=0;i<chaineClair.length();i++)
           { c=decaleCaractere(chaineClair.charAt(i),this.decalage); 
             ch += c;}
        return ch;
    }
}
