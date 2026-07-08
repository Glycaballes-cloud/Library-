import java.util.ArrayList;
public class Customer extends Person {
    private String customerId;
    private ArrayList<Book> borrowedBooks;

    public Customer(String name, int age, String customerId) {
        super(name, age);
        this.customerId = customerId;
        borrowedBooks = new ArrayList<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public boolean hasBorrowedBooks(Book book) {
        return borrowedBooks.contains(book);
    }
    public void displayBorrowedBooks() {
        System.out.println("Borrowed Books for " + getName() + ":");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No borrowed books.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println( "Title: " + book.getTitle() + "\nAuthor: " + book.getAuthor() + "\nBorrowed: " + book.isBorrowed());
                book.displayInfo();
            }
        }
    }
}
