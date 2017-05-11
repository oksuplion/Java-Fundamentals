package four.inheritance;

public class CommissionWorker extends Employee
{
    private double percent ;

    public CommissionWorker ( String n, double s, String sur)
    {
        super ( n , s, sur);
        percent = 0;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary ();
        return baseSalary * percent*100 ;

    }

    public void setPercent ( double b)
    {
        percent = b;
    }
}
