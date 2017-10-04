/**
 * Décrivez votre classe Fraction ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Fraction 
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int num;
    private int denom;
    
    static Fraction ZERO = new Fraction(0,1);
    static Fraction UN = new Fraction(1,1);

    public Fraction(int num, int denom)
    {
        this.num = num;
        this.denom = denom;
    }
    
    public Fraction(int num)
    {
        this(num, 1);
    }
    
    public Fraction()
    {
        this(0, 1);
    }
    
    public int getNum(){ return num; }
    public int getDenom(){ return denom; }
    
    public double doubleValue()
    {
        return ((double) num / (double) denom); 
    }
    
    public Fraction add(Fraction f)
    {
        Fraction frac = new Fraction(num * f.denom + denom * f.num, 
                                    denom * f.getDenom());
        return frac;
    }
    

    


}