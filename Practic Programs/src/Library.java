import java.util.Scanner;

class Book
{
    String isbn, title, author;
    boolean isBorrowed;
    Book(String isbn, String title, String author)
    {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this. isBorrowed = false;
    }
    boolean isAvailable()
    {
        return this.isBorrowed == false;

    }
    void borrowBook()
    {
        if(this.isBorrowed == false)
        {
            this.isBorrowed = true;
        }
    }
    void returnBook()
    {
        if(this.isBorrowed == true)
        {
            this.isBorrowed = false;
        }
    }
}

class Member
{
    String memberID, name;
    int booksBorrowed;
    Member(String memberID, String name)
    {
        this.memberID = memberID;
        this.name = name;
        this.booksBorrowed = 0;
    }
    void borrowBook(Book book)
    {
        if(book.isAvailable() == true)
        {
            book.isBorrowed = true;
            this.booksBorrowed+=1;
        }
    }
    void returnBook(Book book)
    {
        if(book.isAvailable() == false)
        {
            book.isBorrowed = false;
            this.booksBorrowed-=1;
        }
    }
    int getBooksBorrowed()
    {
        return this.booksBorrowed;
    }
}

public class Library
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Member Name:");
        String name1 = sc.nextLine();

        
        System.out.println("Enter Member ID:");
        String id1 = sc.nextLine();

        Member m1 = new Member(name1, id1);
        System.out.println(m1);
        Book b1 = new Book("b1","b1","a1");
        Book b2 = new Book("b2","b2","a2");
        Book b3 = new Book("b3","b3","a3");
        while(true)
        {
            System.out.println("Enter 1 for Borrowing, 2 for Returning, 3 for Checking Status of Book, 4 for exit");
            int i = Integer.parseInt(sc.nextLine());
            switch(i)
            {
                case 1:
                    System.out.println("Enter 1 for b1, 2 for b2, 3 for b3 :");
                    int bn = Integer.parseInt(sc.nextLine());
                    if(bn == 1)
                    {
                        m1.borrowBook(b1);
                        b1.borrowBook();
                    }
                    if(bn == 2)
                    {
                        m1.borrowBook(b2);
                        b2.borrowBook();
                    }
                    if(bn == 3)
                    {
                        m1.borrowBook(b3);
                        b3.borrowBook();
                    }
                    break;

                case 2:
                    System.out.println("ENter book number you wish to return :");
                    int rbn = Integer.parseInt(sc.nextLine());
                    if(rbn == 1)
                    {
                        m1.returnBook(b1);
                    }
                    if(rbn == 2)
                    {
                        m1.returnBook(b2);
                    }
                    if(rbn == 3)
                    {
                        m1.returnBook(b3);
                    }
                    break;
                case 3 :
                    System.out.println("Enter the Book id you wish to check :");
                    int stc = Integer.parseInt(sc.nextLine());
                    if(stc == 1)
                    {
                        if(b1.isBorrowed == true)
                        {
                            System.out.println("Status of Book is :  Borrowed");    
                        }
                        else
                        {
                            System.out.println("Status of Book is : Available");
                        }
                    }
                    if(stc == 2)
                    {
                        if(b2.isBorrowed == true)
                        {
                            System.out.println("Status of Book is :  Borrowed");    
                        }
                        else
                        {
                            System.out.println("Status of Book is : Available");
                        }
                    }
                    if(stc == 3)
                    {
                        if(b3.isBorrowed == true)
                        {
                            System.out.println("Status of Book is :  Borrowed");    
                        }
                        else
                        {
                            System.out.println("Status of Book is : Available");
                        }
                    }
                    break;
                case 4 :
                    sc.close();
                    System.exit(0);
            }
        }
    }
}