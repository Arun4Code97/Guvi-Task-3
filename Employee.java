package Problem2;

public class Employee implements Taxable
{
    // declared variables in private
    private int empId;
    private String name;
    private double salary;

    //constructor to initialize object members
    public Employee(int Id,String name,double salary)
    {
     this.empId=Id;
     this.name=name;
     this.salary=salary;
    }
    //mentioned return type as double --> return the result of (incomeTax * salary)
    @Override
    public double calcTax()
    {
     return incomeTax * salary;
    }
}
