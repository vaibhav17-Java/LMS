import com.library.model.*;

import java.util.*;

public class Main {

    static List<Book> listOfBooks = new ArrayList<>();
    static List<User> listOfUsers = new ArrayList<>();
    static List<Library> listOfLibrary = new ArrayList<>();

    public static void main(String[] args) {
        // To add dummy records in LMS
        addDummyData();
        for (int i = 0; i < listOfBooks.size(); i++) {
            System.out.println("List of Books: " + listOfBooks.get(i).toString());
            System.out.println("List of Users: " + listOfUsers.get(i).toString());
        }
    }

    public static void addDummyData() {
        for (int i = 0; i < 10; i++) {
            Book bookDetails = new Book("Java Basics_"+i, "Unknown_"+i, "1233ASAB213GH"+i, 201+i);
            listOfBooks.add(bookDetails);
            User userDetails = new User(100+1, "User"+i);
            listOfUsers.add(userDetails);
        }
        Library library = new Library("LMS_1", "Pune", 2020, "Engineering");
        listOfLibrary.add(library);
    }
}
