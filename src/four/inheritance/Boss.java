package four.inheritance;

public class Boss extends Employee
{
    private int week ;

    public Boss ( String n, int s, String sur)
    {
        super ( n , s, sur);
        week = 0;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary ();
        return baseSalary * week ;
    }

    public void setWeek ( int b)
    {
        week = b;
    }
}
