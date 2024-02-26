package Problem1;

import Problem1.Library;
import java.util.Scanner;
import java.util.*;

// created class BookManagementSystem to give interactive user experience
public class BookManagementSystem
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in); // creating object for Scanner class to read details from users
        Library libObj = new Library(); // creating obj for Class Library

        System.out.println("\n*************************** Welcome to Library!! ************************\n");

boolean flag = true; //Setting flag = true for continuous interactive menu
while(flag) // escapes when flag = false, when '0' is entered by user
{
    System.out.println("Choose an option (Between 0-3) from below menu \n1.Add a book\n2.Replace a book\n3.Display all books\n0.Exit\n");
    // Integer.parseInt(reader.nextLine()) --> used to avoid end-line conflicts between .nextLine() and .nextInt()
    int option = Integer.parseInt(reader.nextLine());


    if ((option >=0 && option <=3)) // executes only when option is between 0 -3
    {
        switch (option)
        {
            // for adding the book details
            case 1:
            {
                //collecting details for adding the book in library
                System.out.println("Enter book details - Book ID,Tittle and Author name\nEnter ID ");
                int bookId = Integer.parseInt(reader.nextLine());


                System.out.println("Enter Book title");
                String bookTittle = reader.nextLine();

                System.out.println("Enter author-name");
                String authorName = reader.nextLine();

                //passing the collected details as object argument to libObj.addBook(Book bookObj)
                libObj.addBook(new Book(bookId, bookTittle, authorName, true));

                System.out.println("\n***************Added successfully!!***********************\n");
                break;
            }

            //replacing book details
            case 2 :
            {
                System.out.println("Enter the book details which needs to replaced in Library\nEnter book ID");
                int bookId = Integer.parseInt(reader.nextLine());

                System.out.println("Enter book title");
                String bookTittle = reader.nextLine();

                System.out.println("Enter book author");
                String authorName = reader.nextLine();

                libObj.replaceBook(bookId);

                libObj.addBook(new Book(bookId, bookTittle, authorName, true));

                System.out.println("\n***************Replaced successfully!!***********************\n");
                break;
            }

            // for displaying the all book details in library
            case 3: {
                libObj.displayBook();
                System.out.println("\n **********************Displayed successfully ****************\n");
                break;
            }

            // to exit from interactive menu
            case 0:
            {
                System.out.println("\n*************** Thank you for visiting the Library!! ****************\n");
                flag = false;
                break;
            }

        }
    }
    else // to display if user enters wrong input
        System.out.println("\nEntered a wrong input\n");
 }
    }
}
