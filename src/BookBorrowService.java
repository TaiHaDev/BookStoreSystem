public class BookBorrowService {
    public static BookBorrow getBookBorrowById(int id) {
        for (var book : Database.bookBorrows) {
            if (book.getId() == id) return book;
        }
        return null;
    }
}
