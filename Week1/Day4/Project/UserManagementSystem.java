package Week1.Day4.Project;

// Importing the necessary packages
import java.util.HashMap;
import java.util.Scanner;

// Creating a class to manage user authentication
class Authentication {
    // Initializing a Scanner object to receive input from the user
    Scanner sc = new Scanner(System.in);

    // Creating a hashmap to store user email and password
    HashMap<String, String> userMap = new HashMap<>();

    // Creating a method to register new users
    public void register() {
        // Prompting user to input their email
        System.out.println("Enter Email");
        String email = sc.nextLine();

        // Checking if the email is valid
        if (email.contains("@") && email.contains(".")) {
            // Checking if the user already exists
            if (!isUserExists(email)) {
                // Prompting user to input their password
                System.out.println("Enter Password");
                String password = sc.nextLine();

                // Adding the new user to the hashmap
                userMap.put(email, password);
                System.out.println("User Has Been Registered Successfully! : ");
            } else {
                // Notifying the user if the user already exists
                System.out.println("User Already Registered!");
            }
        } else {
            // Notifying the user if the email is invalid
            System.out.println("Invalid Email, Try Again!");
        }
    }

    // Creating a method to log in users
    public void login() {
        // Prompting user to input their email
        System.out.println("Enter Email");
        String email = sc.nextLine();

        // Prompting user to input their password
        System.out.println("Enter Password");
        String password = sc.nextLine();

        // Checking if the email is valid
        if (email.contains("@") && email.contains(".")) {
            // Checking if the user exists in the hashmap
            if (isUserExists(email)) {
                // Checking if the password matches the password associated with the email in the hashmap
                if (userMap.get(email).equals(password)) {
                    System.out.println("Login Successful!");
                } else {
                    // Notifying the user if the password is incorrect
                    System.out.println("Wrong Credentials!");
                }
            } else {
                // Notifying the user if the user does not exist in the hashmap
                System.out.println("Wrong Credentials!");
            }
        } else {
            // Notifying the user if the email is invalid
            System.out.println("Invalid Email, Try Again!");
        }
    }

    // Creating a method to list all users in the hashmap
    public String listUsers() {
        return userMap.toString();//Returning list in String format
    }

    // Creating a method to check if the user exists in the hashmap
    public boolean isUserExists(String email) {
        return userMap.containsKey(email);//Returning true if email is available or else false
    }

}

// Creating a class to manage user registration and login
public class UserManagementSystem {
    public static void main(String[] args) {
        // Initializing a variable to receive user choice
        int choice = 0;
        Scanner sc = new Scanner(System.in);//Creating Scanner object for taking user input 
        Authentication auth = new Authentication();//Creating object of Authentication class to access its methods

        // Running a loop to allow the user to choose between various options
        do {
            System.out.println("Enter Choice (eg. 1):\n1. Register\n2. Login\n3. View Records\n4. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // Registering a new user
                    auth.register();
                    
                    break;
                case 2:
                    // Logging in a user
                    auth.login();
                    break;
                case 3:
                    // Listing all users in the hashmap
                    System.out.println(auth.listUsers());
                    break;
                case 4:
                    //Exiting From Loop
                    System.out.println("Thanks!");
                    break;
                default:
                    //Entered choice does not match with our list
                    System.out.println("Invalid Choice");
            }
        } while (choice != 4);//Repeat until user enters 4 to exit from the loop
    }
}