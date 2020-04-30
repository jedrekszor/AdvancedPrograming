import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;
    String name;

    public Library(String name) {
        this.name = name;
        books = new ArrayList<Book>();
    }

    public void addBook(String title, String authors) {
        Book book = new Book(title, authors);
        books.add(book);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book search(int id) {
        for(Book book: books) {
            if(book.getId() == id)
                return book;
        }
        return null;
    }

    public boolean delete(int id) {
        for(Book book: books) {
            if(book.getId() == id) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "";
        for(Book book: books) {
            result += book.toString() + "\n";
        }
        return result;
    }
}
