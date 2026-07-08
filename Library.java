import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Person> Person;

    public Library() {
        books = new ArrayList<>();
        Person = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public void addEmployee(Employee employee) {
        Person.add(employee);
    }

    public void addCustomer(Customer customer) {
        Person.add(customer);
    }

    public void displayBooks() {
        System.out.println("=====Books in the Library===");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                book.displayInfo();
            }
        }
    }
 
    public void lendBook(Customer customer, Book book) {
        if (books.contains(book) && !book.isBorrowed()) {
            book.setBorrowed(true);
            customer.borrowBook(book);
            System.out.println("Book lent to " + customer.getName() + ": " + book.getTitle());
        } else {
            System.out.println("Book is not available for lending.");
        }
    }

    public void returnBook(Customer customer, Book book) {
        if (customer.Borrowed(book)) {
            book.setBorrowed(false);
            customer.returnBook(book);
            System.out.println("Book returned by " + customer.getName() + ": " + book.getTitle());
        } else {
            System.out.println("This book was not borrowed by the customer.");
        }
    }
}