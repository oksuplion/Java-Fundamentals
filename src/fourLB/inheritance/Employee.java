package fourLB.inheritance;

public class Employee {
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, double salary,  String surname)
    {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public String getSurname()
    {
        return surname;
    }

}