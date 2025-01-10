import com.library.model.Book;
import com.library.model.Library;
import com.library.model.User;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Library library = new Library("LMS_Pune_1", "Pune");
        Book book1 = new Book(1, "Java", "AAAAA", 11111111, 2021, true);
        library.setBookList(book1);
        User user1 = new User(101, "ABC", "Pune");
        library.setUserList(user1);

        // Add Book & User
        Book book2 = new Book(2, "Node", "BBBBB", 22222222, 2022, true);
        library.setBookList(book2);
        User user2 = new User(102, "XYZ", "Mumbai");
        library.setUserList(user2);

        Book book6 = new Book(3, "Node_JS", "CCCCCCCCCC", 4444444, 2024, true);
        library.setBookList(book6);
        User user6 = new User(103, "PQR", "Dubai");
        library.setUserList(user6);

        // Display details
        System.out.println("----------------------- Library Details -----------------------");
        library.displayLibraryDetails();

        // Update Book & User details
        Book book3 = new Book();
        book3.setAuthor("DDDDDDDDD");
        System.out.println();
        library.updateBookDetails(3, book3);
        User user3 = new User();
        user3.setAddress("Delhi");
        library.updateUserDetails(103, user3);
        System.out.println();

        System.out.println("-----------------------------Display All Books Details----------------------------------");
        library.displayAllBooksDetails();
        System.out.println("-----------------------------User Details----------------------------------");
        library.displayUserDetails();

        // Remove Book & User
        System.out.println();
        library.removeBook(3);
        library.removeUser(103);
        System.out.println();

        // Search Book
        System.out.println("------------------------------Search Book---------------------------------");
        library.searchBook(2);
        System.out.println();

        // Borrow Book and update the record
        Book book4 = new Book(1, 101, new Date(), null, true);
        System.out.println("------------------------------Borrowed Book Details---------------------------------");
        library.bookBorrow(book4);
        library.displayBorrowedBookDetails();
        System.out.println();
        System.out.println("------------------------------Available Book Details---------------------------------");
        library.displayAvailableBookDetails();

        // Return Book and update the record
        Book book5 = new Book(1, 101, book4.getBorrowDate(), new Date(), false);
        System.out.println();
        library.returnBook(book5);

        System.out.println("-----------------------------Display All Books Details----------------------------------");
        library.displayAllBooksDetails();

    }
}