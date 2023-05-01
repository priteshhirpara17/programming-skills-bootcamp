import java.time.LocalDate;

public class BorrowedBook {
private Book book; 
private Borrower borrower;
private LocalDate dueDate;
public BorrowedBook(Book book, Borrower borrower, LocalDate dueDate) {
    this.book = book;
    this.borrower = borrower;
    this.dueDate = dueDate;
}

public Book getBook() {
    return book;
}

public Borrower getBorrower() {
    return borrower;
}

public LocalDate getDueDate() {
    return dueDate;
}
}