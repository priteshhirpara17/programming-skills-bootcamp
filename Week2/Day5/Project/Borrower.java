import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Borrower {
    private String name;
    private List<BorrowedBook> borrowedBooks;
 
    public Borrower(String name) {
        this.name = name;
        borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<BorrowedBook> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book, LocalDate dueDate) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            borrowedBooks.add(new BorrowedBook(book, this, dueDate));
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Sorry, the book is not available for borrowing.");
        }
    }

    public void returnBook(BorrowedBook borrowedBook) {
        Book book = borrowedBook.getBook();
        if (borrowedBooks.contains(borrowedBook)) {
            book.setAvailable(true);
            borrowedBooks.remove(borrowedBook);
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("This book was not borrowed by this borrower.");
        }
    }
}
