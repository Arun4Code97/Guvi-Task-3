package Problem2;

//Created interface Taxable with members salesTax and incomeTax and abstract method calcTax()
public interface Taxable
{
    double salesTax= 0.07;
    double incomeTax= 0.15;

    //abstract method calcTax()
    abstract double calcTax();
}
