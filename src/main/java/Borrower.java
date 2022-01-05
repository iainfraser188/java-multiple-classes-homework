import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public int collectionSize(){
        return this.collection.size();
    }

    public void addBook(Book book) {
        this.collection.add(book);
    }

    public void removeBook(Book book) {
        this.collection.remove(book);
    }

    public void borrowBook(Library library,Book book){
        Book bookRemoved = library.removeBook(book);
        this.addBook(bookRemoved);
    }
}
