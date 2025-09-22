import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {
        String storedUsername = "user123";
        String storedPassword = "pass123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(storedUsername) && enteredPassword.equals(storedPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed! Invalid username or password.");
        }

        scanner.close();
    }
}
