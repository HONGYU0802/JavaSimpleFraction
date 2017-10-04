import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class Repertoire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Repertoire extends FIC
{
    // instance variables - replace the example below with your own
    private ArrayList<FIC> fic;
    private String nom;

    /**
     * Constructor for objects of class Repertoire
     */
    public Repertoire(String nom)
    {
        this.nom = nom;
        this.fic = new ArrayList<FIC>();
    }
    
    public boolean ajouter(FIC element)
    {
            return fic.add(element);
    }
    
    public boolean retirer(FIC element)
    {
        return fic.remove(element);
    }
    
    public int calculTaille()
    {
        Iterator<FIC> liste = fic.iterator();
        int somme = 0;
        
        while(liste.hasNext()) {
            somme = liste.next().calculTaille() + somme; 
        }
        return somme;
    }
}