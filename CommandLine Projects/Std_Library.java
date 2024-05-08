//  Implement a library using Java Class, using OOPs
import java.util.Scanner;

class Library
{
    private String[] issuedBooks, availableBooks;
    public int sizeA, sizeI;

    Library(int l, String[] Books)
    {
        int n = 0;
        issuedBooks = new String[100];
        availableBooks = new String[100];
        
        for(int i=0; i<l; i++)
        {
            availableBooks[i] = Books[i];
        }
        
        while(availableBooks[n] != null)
        {
            sizeA++;
            n++;
        }
        
        n = 0;
        while(issuedBooks[n] != null)
        {
            sizeI++;
            n++;
        }

    }
    
    public void setIssuedBook(String Book)
    {
        issuedBooks[sizeI] = Book;
    }

    public void addBook(String Book)
    {
        availableBooks[sizeA] = Book;
        sizeA++;
        System.out.println("'" + Book + "'" + " Book has been Added to the Library.");
    }

    public void issueBook(String Book)
    {
        int f = 0;
        for(int i=0; i<sizeA; i++)
        {
            if(Book.equalsIgnoreCase(availableBooks[i]))
            {
                setIssuedBook(Book);
                System.out.println("'" + Book + "'" + " Book has been issued from the Library.");
                availableBooks[i] = null;
                f = 1;
            }
        }
        if(f == 0)
        {
            System.out.println("'" + Book + "'" + " Book is not in the Library.");
        }
    }

    public void returnBook(String Book)
    {
        int f = 0;
        for(String s : issuedBooks)
        {
            if(Book.equalsIgnoreCase(s))
            {
                availableBooks[sizeA] = Book;
                sizeA++;
                System.out.println("'" + Book + "'" + " Book has been Returned to the Library.");
                f = 1;
            }
        }
        if(f == 0)
        {
            System.out.println("You never issued " + "'" + Book + "'" + " Book from the Library.");
        }
    }

    public void showAvailableBooks()
    {
        System.out.println("Available Books in Library are ------>");
        for(int i=0; i<sizeA; i++)
        {
            if(availableBooks[i] != null)
            {
                System.out.println("-> " + availableBooks[i]);
            }
        }
    }
}


public class Std_Library
{
    public static void main(String[] args)
    {
        String[] availableBooks = {"C", "Python", "Java", "Data Structure"};
        Library Lib = new Library(4, availableBooks);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n<------ Welcome to the Library ------>");

        while(true)
        {
            System.out.print("\nWhat you want to do ?\n1. Add a Book\n2. Take a Book\n3. Return a Book\n4. Show Available Books\n-------->");
            int input = sc.nextInt();

            System.out.println();
            switch(input)
            {
                case 1 -> {
                    System.out.print("Enter Name of the Book : ");
                    String Book = sc.next();
                    Lib.addBook(Book);
                }

                case 2 -> {
                    System.out.print("Enter Name of the Book : ");
                    String Book = sc.next();
                    Lib.issueBook(Book);
                }

                case 3 -> {
                    System.out.print("Enter Name of the Book : ");
                    String Book = sc.next();
                    Lib.returnBook(Book);
                }

                case 4 -> {
                    Lib.showAvailableBooks();
                }
            }
        }
    }
}
