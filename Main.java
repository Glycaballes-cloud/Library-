import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library();
        // Create some books

        System.out.println("Enter the number of books to add to the library:");
        int numBooks = input.nextInt();
        input.nextLine(); // Consume the newline character

        for (int i = 0; i < numBooks; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = input.nextLine();
            System.out.print("Author: ");
            String author = input.nextLine();
            Book book = new Book(title, author);
            library.addBook(book);
        }

        library.displayBooks();

        // Create some employee
        System.out.println("===== EMPLOYEE INFORMATION =====");
        System.out.print("Enter employee name: ");
        String employeeName = input.nextLine();
        System.out.print("Enter employee age: ");
        int employeeAge = input.nextInt();
        input.nextLine(); // Consume the newline character
        System.out.print("Enter employee ID: ");
        String employeeId = input.nextLine();
        Employee employee = new Employee(employeeName, employeeAge, employeeId);
        library.addPerson(employee);

        // Create some customers
        System.out.println("===== CUSTOMER INFORMATION =====");
        System.out.print("Enter customer name: ");
        String customerName = input.nextLine();
        System.out.print("Enter customer age: ");
        int customerAge = input.nextInt();
        input.nextLine(); // Consume the newline character
        System.out.print("Enter customer ID: ");
        String customerId = input.nextLine();
        Customer customer = new Customer(customerName, customerAge, customerId);
        library.addPerson(customer);

        // Lend a book to the customer
        System.out.println("===== LENDING BOOK =====");
        System.out.print("Enter the title of the book to lend: ");  
        String bookTitleToLend = input.nextLine();
        Book bookToLend = null;
        for (Book book : library.getBooks()) {
            if (book.getTitle().equalsIgnoreCase(bookTitleToLend)) {
                bookToLend = book;
                break;
            }
        }
        if (bookToLend != null) {
            library.lendBook(bookToLend, customer);
        } else {
            System.out.println("Book not found.");
        }

        // Display borrowed books for the customer
        System.out.println("===== BORROWED BOOKS =====");
        customer.displayBorrowedBooks();
        library.lendBook(bookToLend, customer);

        // Return a book from the customer
        System.out.println("===== RETURNING BOOK =====");
        System.out.print("Enter the title of the book to return: ");
        String bookTitleToReturn = input.nextLine();
        Book bookToReturn = null;
        for (Book book : library.getBooks()) {
            if (book.getTitle().equalsIgnoreCase(bookTitleToReturn)) {
                bookToReturn = book;
                break;
            }
        }
        if (bookToReturn != null) {
            library.returnBook(bookToReturn, customer);
        } else {
            System.out.println("Book not found.");
        }

        // Display borrowed books for the customer after returning
        System.out.println("===== BORROWED BOOKS AFTER RETURNING =====");
        customer.displayBorrowedBooks();
        
        input.close();
    }
}
