import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void setUp() {
        library = new Library(3);
        book = new Book("1984", "george orwell", "sci-fi");
        book1 = new Book("harry potter", "JK Rolling", "fantasy");
        book2 = new Book("pride and prejudice", "jane austin", "historical fiction");
        book3 = new Book("dune", "frank herbert", "sci-fi");
    }

    @Test
    public void getBookListEmpty(){
        assertEquals(0,library.bookCount());
    }
    @Test
    public void testAddBook(){
        library.addBook(book1);
        assertEquals(1,library.bookCount());
    }

    @Test
    public void removeBook(){
        library.addBook(book);
        library.removeBook(book);
        assertEquals(0,library.bookCount());
    }
    @Test
    public void testCapacity(){
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3,library.bookCount());
    }

    }
