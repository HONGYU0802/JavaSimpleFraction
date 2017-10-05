

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CompteTest
{
    /**
     * Default constructor for test class CompteTest
     */
    
    @Test (expected = IllegalArgumentException.class)
    public void CompteTest()
    {
        Compte c = new Compte(-1000);
    }
    
    @Test
    public void getsoldeTest()
    {
        double x = 1200;
        Compte c = new Compte(1200);
        assertEquals(Double.valueOf(c.getSolde()) ,Double.valueOf(x));

    }
    
    @Test
    public void creditTest()
    {
        double x = 1400;
        Compte c = new Compte(1200);
        c.credit(200);
        assertEquals(Double.valueOf(c.getSolde()) ,Double.valueOf(x));
    }

    @Test
    public void debitTest()
    {
        double x = 1000;
        Compte c = new Compte(1200);
        c.debit(200);
        assertEquals(Double.valueOf(c.getSolde()) ,Double.valueOf(x));
        
        c.debit(1200);
        assertEquals(Double.valueOf(c.getSolde()) ,Double.valueOf(x));
    }
    
    @Test
    public void virementTest()
    {
        double x = 100;
        Compte c = new Compte(1000);
        Compte c2 = new Compte(2000);
        c.virement(c2,900);
        assertEquals(Double.valueOf(c.getSolde()) ,Double.valueOf(x));
        x = 2900;
        assertEquals(Double.valueOf(c2.getSolde()) ,Double.valueOf(x));
    }
}
