
/**
 * Write a description of class Compte here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Compte
{
    // instance variables - replace the example below with your own
    private double solde;

    /**
     * Constructor for objects of class Compte
     */
    public Compte(double Solde) throws IllegalArgumentException
    {
        // initialise instance variables
        if(Solde<0)
        {
            throw new IllegalArgumentException();
        }
        this.solde = Solde;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double getSolde()
    {
        // put your code here
        return this.solde;
    }
    
    public boolean credit(double x)
    {
        if (x < 0) {return false;}
        this.solde += x; 
        return true;
    }
    
    public boolean debit(double x)
    {
        if (x < 0) {return false;}
        if (this.solde >= x)
        {
            this.solde -= x; 
            return true;
        }
        return false;
    }
    
        public boolean virement(Compte c,double x)
    {
        if (x < 0) {return false;}
         if (this.solde >= x)
        {
            this.solde -= x; 
            c.credit(x);
            return true;
        }
        return false;
    }
}
