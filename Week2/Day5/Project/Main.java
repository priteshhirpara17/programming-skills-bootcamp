import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction");
        Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger", "Fiction");
        catalog.addBook(book1);
        catalog.addBook(book2);
        catalog.addBook(book3);

        System.out.println("All books:");
        for (Book book : catalog.getAllBooks()) {
            System.out.println(book);
        }

        System.out.println("\nRemoving book " + book2.getTitle() + "...");
        catalog.removeBook(book2);

        System.out.println("\nAll books after removal:");
        for (Book book : catalog.getAllBooks()) {
            System.out.println(book);
        }

        System.out.println("\nSearching for books with keyword \"The\":");
        for (Book book : catalog.searchBooks("The")) {
            System.out.println(book);
        }

        Borrower borrower1 = new Borrower("John Smith");
        Borrower borrower2 = new Borrower("Jane Doe");

        System.out.println("\n" + borrower1.getName() + " borrowing book " + book1.getTitle() + "...");
        borrower1.borrowBook(book1, LocalDate.now().plusDays(7));

        System.out.println("\n" + borrower2.getName() + " borrowing book " + book3.getTitle() + "...");
        borrower2.borrowBook(book3, LocalDate.now().plusDays(14));

        System.out.println("\n" + borrower1.getName() + " borrowing book " + book3.getTitle() + "...");
        borrower1.borrowBook(book3, LocalDate.now().plusDays(7));

        System.out.println("\n" + borrower1.getName() + "'s borrowed books:");
        for (BorrowedBook borrowedBook : borrower1.getBorrowedBooks()) {
            System.out.println(borrowedBook.getBook().getTitle() + " (Due date: " + borrowedBook.getDueDate() + ")");
        }

        System.out.println("\n" + borrower2.getName() + "'s borrowed books:");
        for (BorrowedBook borrowedBook : borrower2.getBorrowedBooks()) {
            System.out.println(borrowedBook.getBook().getTitle() + " (Due date: " + borrowedBook.getDueDate() + ")");
        }

        System.out.println("\n" + borrower1.getName() + " returning book " + book1.getTitle() + "...");
        borrower1.returnBook(borrower1.getBorrowedBooks().get(0));

        System.out.println("\n" + borrower1.getName() + "'s borrowed books after return:");
        for (BorrowedBook borrowedBook : borrower1.getBorrowedBooks()) {
            System.out.println(borrowedBook.getBook().getTitle() + " (Due date: " + borrowedBook.getDueDate() + ")");
        }

        System.out.println("\n" + book1.getTitle() + " availability: " + book1.isAvailable());
    }

    public static void removeBook(Catalog catalog, Book book) {
        catalog.removeBook(book);
    }
}
