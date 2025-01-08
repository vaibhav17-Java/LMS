import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------------- WELCOME TO LMS SYSTEM ----------------");
        System.out.println("1. Add Book - ");
        System.out.println("2. Search Book - ");
        System.out.println("3. Update Book Details - ");
        System.out.println("4. Delete Book - ");
        System.out.println("5. Show Book Details - ");
        System.out.println("6. Show All Book Details - ");1
        System.out.println("7. Show Borrowed Books - ");
        System.out.println("8. Add User - ");
        System.out.println("9. Update User Details - ");
        System.out.println("10. Book Checkin - ");
        System.out.println("11. Book checkout - ");
        System.out.println("Enter you choice :: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("-------- ADD BOOK -------");
                break;

            case 2:
                System.out.println("-------- SEARCH BOOK -------");
                break;

            case 3:
                System.out.println("-------- UPDATE BOOK -------");
                break;

            case 4:
                System.out.println("-------- DELETE BOOK -------");
                break;

            case 5:
                System.out.println("-------- SHOW BOOK -------");
                break;

            case 6:
                System.out.println("-------- SHOW ALL BOOKS -------");
                break;

            case 7:
                System.out.println("-------- SHOW BORROWED BOOKS -------");
                break;
            case 8:
                System.out.println("-------- ADD USER -------");
                break;

            case 9:
                System.out.println("-------- UPDATE USER -------");
                break;

            case 10:
                System.out.println("-------- BOOK  -------");
                break;

            case 11:
                System.out.println("-------- BOOK CHECKOUT -------");
                break;

            default:
                System.out.println("-------- Exit -------");
                break;
        }
    }
}