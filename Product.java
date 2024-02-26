package Problem2;
//implemented Taxable interface with keyword implements and overridden the method calcTax
public class Product implements Taxable
{
    // declared variables in private
    private int pid;
    private double price;
    private double quantity;
    public Product(int pid,double price,double quantity) //constructor to initialize object members
    {
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }

//mentioned return type as double --> return the result of (salesTax * quantity * price)
    @Override
    public double calcTax() {
        return salesTax * quantity * price;
    }
}

