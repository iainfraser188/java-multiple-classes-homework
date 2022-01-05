import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void setUp() {

        borrower = new Borrower();
        library = new Library(20);
        book = new Book("1984","george orwell","sci-fi");
//        book1 = new Book("harry potter","JK Rolling","fantasy");
//        book2 = new Book("pride and prejudice","jane austin","historical fiction");
//        book3 = new Book("dune","frank herbert", "sci-fi");

    }

    @Test
    public void bookCountNone(){
        assertEquals(0,borrower.collectionSize());
    }
    @Test
    public void addBook(){
        borrower.addBook(book);
        assertEquals(1, borrower.collectionSize());
    }

    @Test
    public void removeBook(){
        borrower.addBook(book);
        borrower.removeBook(book);
        assertEquals(0,borrower.collectionSize());
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(this.library,book);
        assertEquals(1,borrower.collectionSize());
        assertEquals(0, library.bookCount());
    }


}
