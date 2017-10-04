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
    
    public int PGCD(int a,int b)
    {
        int c,d,r;
        if (a > b) 
        {   
            c = a; 
            d = b; 
        } 
        else 
        { 
            c=b; 
            d=a; 
        } 
        r= c % d; 
       while(r!=0) 
       { 
         c = d; 
         d = r; 
         r = c % d; 
       }
       return d;
    }
    
    public Fraction reduction(Fraction f)
    {
        int pgcd = PGCD ( f.num , f.denom);
        Fraction frac = new Fraction(f.num/pgcd,f.denom/pgcd);
        return frac;
    }
    
    public boolean equal(Fraction f,Fraction f2)
    {
        f = reduction(f);
        f2 = reduction(f2);
        if((f.num == f2.num)&&(f.denom == f2.denom))
            return true;
        return false;
    }
    
    //return 1 si 1er plus grand sinon 2 
    public int compare (Fraction f,Fraction f2)
    {
        double x,y;
        x= (double) f.num /(double) f.denom;
        y= (double) f2.num /(double) f2.denom;
        if(x>y)
            return 1;
        return 2;
    }
    


}