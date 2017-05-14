package fourLB.inheritance;

public class PieceWorker extends Employee
{
    private double products ;

    public PieceWorker ( String n, double s, String sur)
    {
        super ( n , s, sur);
        products = 0;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary ();
        return baseSalary * products/2 ;

    }

    public void setProducts ( double b)
    {
        products = b;
    }
}
