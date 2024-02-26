package Problem1;

import java.util.Arrays;

//created Class Library to store array of objects for Book class
public class Library
{

    // Array declaration for type Class:Book
    private final Book[] books;

    public Library()
    {
        // Initialization of array size to 5 using constructor--> to store 5 book details
        books = new Book[5];
    }
    //method to add book inside array elements using bookObj as parameter
    public void addBook(Book bookObj)
    {
    books[bookObj.getBookId()-1]=bookObj; //assigning bookObj to respective array element.
    }


 //Method to replace book using bookId -->Uses  searchBook method and delete book method
 //1.To check whether entered bookId is already available.
 /*2.If available ->Assigning null keyword to respective array element to update with new book details later
          Else displaying entered bookId is not available to replace */

 public void replaceBook(int bookId)
    {
        if(searchBook(bookId)) // searchBook(bookId) -> returns true if available
        {
            deleteBook(bookId); // assigning to null respective array element
            System.out.print(",So the previous book was mentioned as null ");
        }
        else
            System.out.print("BookID is not available in library\n"); //To notify the entered book ID is not available
    }
    boolean searchBook(int Id)
    {
        for( Book Iterator : books) // forEach loop for iterating inside
        {
            if(Iterator == null) // skip if any element is empty
                continue;
            else if(Iterator.getBookId() == Id) // returns true if bookId matches
            {
                System.out.println("Book was available");
                return true;
            }

        }
        return false;// returns false if no matches

    }
    void deleteBook(int Id) // To assign null value to override it.
    {

       books[Id-1] = null; // assigns null to respective book
    }
    public void displayBook()
    {
       for (Book Iterator : books) // forEach loop for iterating inside
       {
           if(Iterator == null)
               System.out.println("empty");// display if any element is empty
           else
               // display the details in table fashion
               System.out.println("Book ID : "+Iterator.getBookId() + "\t\tTitle : " + Iterator.getTitle() + "\t\t\tAuthor : " + Iterator.getAuthor() + "\t\t\tAvailability(Y/N) :" + ((Iterator.isAvailable())? "yes" :"no"));
       }
    }
}

