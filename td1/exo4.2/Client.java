
/**
 * Décrivez votre classe Client ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Client
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
    private Serveur inserveur;
    
    /**
     * Constructeur d'objets de classe Client
     */
    public Client(String Nom)
    {
        nom = Nom;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public seconnecter(Serveur s)
    {
        this.inserveur = s;
        return inserveur.connecter(this);
    }
    
    public envoyer(String message)
    {
        inserveur.diffuser(message);
    }

    public recevoir(String message)
    {
        return message;
    }
}
