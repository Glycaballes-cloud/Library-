import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Person> people;

    public Library() {
        books = new ArrayList<>();
        people = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void displayBooks() {
        System.out.println("===== Library Books =====");
        for (Book book : books) {
            book.displayInfo();
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public void lendBook(Book book, Customer customer) {
        if (!book.isBorrowed()) {
            book.setBorrowed(true);
            customer.borrowBook(book);
            System.out.println("Book '" + book.getTitle() + "' has been lent to " + customer.getName() + ".");
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not available for lending.");
        }
    }
    
    public void returnBook(Book book, Customer customer) {
        if (customer.hasBorrowedBooks(book)) {
            book.setBorrowed(false);
            customer.returnBook(book);
            System.out.println("Book '" + book.getTitle() + "' has been returned by " + customer.getName() + ".");
        } else {
            System.out.println(customer.getName() + " has not borrowed the book '" + book.getTitle() + "'.");
        }
    }
}
