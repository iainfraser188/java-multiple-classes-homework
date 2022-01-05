import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Library library;
    Book book;
    Book book1;
    Book book2;
    Book book3;


    @Before
    public void setUp() {
        library = new Library(20);
        book = new Book("1984","george orwell","sci-fi");
        book1 = new Book("harry potter","JK Rolling","fantasy");
        book2 = new Book("pride and prejudice","jane austin","historical fiction");
        book3 = new Book("dune","frank herbert", "sci-fi");

    }

    @Test
    public void bookHasTitle(){
        assertEquals("dune",book3.getTitle());
    }
    @Test
    public void bookHasAuthor(){
        assertEquals("george orwell",book.getAuthor());
    }
    @Test
    public void bookHasGenre(){
        assertEquals("fantasy",book1.getGenre());
    }
}
