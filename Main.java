
public class Main {
    public static void main(String[] args) {
          Library library = new Library();
          Book book1 = new Book("Java Programming", "James Gosling");
          Book book2 = new Book("Clean Code", "Robert C. Martin");
          library.addBook(book1);
          library.addBook(book2);
          
          Employee employee = new Employee("Alice", 30, "E001", "IT");  
          Customer customer = new Customer("Bob", 25, "C001");

          library.addCustomer(customer);
          library.addEmployee(employee);
          library.displayBooks();

          employee.manageEmployee();

          System.out.println();

          library.displayBooks();

          System.out.println("\nCustomer returning a book:");
            library.lendBook(customer, book1);
          System.out.println();

          System.out.println("Trying to borrow the same book again:");
           library.lendBook(customer, book1);
          System.out.println();

          System.out.println("Customer returning the book:");
            library.returnBook(customer, book1);
          System.out.println();

          customer.displayBorrowedBooks();
          System.out.println();

          System.out.println("Trying to return again...");
          library.returnBook(customer, book1);

    }
}
