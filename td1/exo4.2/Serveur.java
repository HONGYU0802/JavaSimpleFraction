
/**
 * Décrivez votre classe Serveur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Serveur
{
    private ArrayList<Client> clients;

    public Serveur()
    {
        clients = new ArrayList<Client>();
    }

    public boolean connecter(Client client)
    {
        if(clients.contains(client)) {
            return false;
        }
        else {
            return clients.add(client);
        }
    }
    
    public void diffuser(String message)
    {
        Iterator<Client> liste = clients.iterator();
        
        while(liste.hasNext()) {
            liste.next().recevoir(message);
        }
    }
}
