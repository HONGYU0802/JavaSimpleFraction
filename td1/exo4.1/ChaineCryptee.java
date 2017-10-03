import java.*;
/**
 * RAS
 * @author Benyamna younes
 * @version 4.1
 */
public class ChaineCryptee
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String chaineCryptee;
    private int decalage;

    /**
     * Constructeur d'objets de classe ChaineCryptee
     * Si la Chaine est vide (= null) je l'initialise a "A" par default
     */
    private ChaineCryptee(String ChaineClair, int Decalage)
    {
        if (chaineClair == null) { chaineClair = "A"; }
        decalage = Decalage;
        String ch = "";
        int i;
        char c;
        for(i=0;i<chaineClair.length();i++)
           { c=decaleCaractere(chaineClair.charAt(i),decalage); 
             ch += c;}
        chaineCryptee = ch;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public String crypte()
    {
        return chaineCryptee;
    }
    
    public static char decaleCaractere ( char c , int decalage ) {
     return (c < 'A' || c > 'Z' ) ? c : (char) ((( c - 'A' + decalage)%26 ) + 'A');
    }

    public String Decrypte()
    {
        String ch = "";
        int i;
        char c;
        for(i=0;i<chaineCryptee.length();i++)
           { c=decaleCaractere(chaineCryptee.charAt(i), - decalage); 
             ch += c;}
        return ch;
    }
    
        public static ChaineCryptee FromCrypted(String crypte, int decalage) { 

        int i;
        String ch = "";
        char c;
        for(i=0;i<crypte.length();i++)
           { c=decaleCaractere(crypte.charAt(i), - decalage ); 
             ch += c;}
        ChaineCryptee ch2 = new ChaineCryptee(ch, decalage);
        return ch2;
    }
    
    public static ChaineCryptee FromDecrypted(String enclair, int decalage) {
        ChaineCryptee ch = new ChaineCryptee(enclair, decalage);
        return ch;
    }
}
