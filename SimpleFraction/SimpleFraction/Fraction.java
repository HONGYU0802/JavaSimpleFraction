
public class Fraction
{
	private double a,b;
	
	public Fraction(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	
	public Fraction()
	{
		this(0, 0);
	}
	
	@Override
	public String toString()
	{
		return Double.valueOf(a).toString() + " " + Double.valueOf(a).toString();
	}
}