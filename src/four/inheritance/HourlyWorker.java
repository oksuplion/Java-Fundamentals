package four.inheritance;

public class HourlyWorker extends Employee
{
    private int hours ;

    public HourlyWorker ( String n, int s, String sur)
    {
        super ( n , s, sur);
        hours = 0;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary ();
        if (hours<8)
            return baseSalary *hours ;
        else
            return baseSalary * 2 * hours;
    }

    public void setHours ( int b)
    {
        hours = b;
    }
}
