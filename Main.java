import com.library.model.Book;
import com.library.model.Library;
import com.library.model.User;
import com.library.util.BookManagement;
import com.library.util.UserManagement;

public class Main {

    public static void main(String[] args) {

        // Display Library Details
        Library library = new Library("LMS_Pune_1", "Pune");
        Book book1 = new BookManagement("Java", "AAAAA", 11111111, 2021);
        User user1 = new UserManagement(101, "ABC");
        library.setBookList(book1);
        library.setUserList(user1);
        library.displayLibraryDetails();

        // Add Book & User
        Book book2 = new BookManagement("Node", "BBBBB", 22222222, 2022);
        book2.displayBookDetails(book2);

        // Update Book & User
        User user2 = new UserManagement(102, "XYZ");
        user2.displayUserDetails(user2);

        // Remove Book & User



        // Borrow Book and update the record



        // Return Book and update the record


    }
}