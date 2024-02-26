package Problem2;

import java.util.Scanner;

public class XYZ
{
    public static void main(String[] args)
    {
        employeeTaxCalculator(); // To provide tax details of an employee yearly salary
        productTaxCalculator();// To provide tax details of total price as per unit/quantity

    }

    private static void employeeTaxCalculator()
    {
        // Creating object for Scanner class to collect details from user via console
        Scanner reader = new Scanner(System.in);

        System.out.println("\n************ Enter employee details *************");
        System.out.println("Enter employee ID");
        int id = Integer.parseInt(reader.nextLine());
        System.out.println("Enter employee name");
        String name = reader.nextLine();
        System.out.println("Enter employee Yearly salary");
        double sal = Double.parseDouble(reader.nextLine());

        //creating and initializing object members with collected details
        Employee employee = new Employee(id,name,sal);

        System.out.println("\nIncome tax(15%) for employee = " +employee.calcTax() + "\n");
        //calling employee.calcTax() method to provide the calculated value

    }
    private static void productTaxCalculator()
    {
        // Creating object for Scanner class to collect details from user via console
        Scanner reader = new Scanner(System.in);
        System.out.println("***************** Enter product details ****************");
        System.out.println("Enter product ID (Pid)");
        int id = Integer.parseInt(reader.nextLine());

        System.out.println("Enter product price");
        double price = Double.parseDouble(reader.nextLine());

        System.out.println("Enter product quantity");
        double quantity = Double.parseDouble(reader.nextLine());

        //creating and initializing object members with collected details
        Product product = new Product(id,price,quantity);

        System.out.println("\nSales Tax(7%) for the products = " + product.calcTax());
        //calling employee.calcTax() method to provide the calculated value

    }

}
