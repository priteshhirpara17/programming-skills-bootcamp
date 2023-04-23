package Week1.Day4.Project;

// Importing the necessary packages
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

// Creating a class to manage user authentication
class Authentication {
    // Initializing a Scanner object to receive input from the user
    Scanner sc = new Scanner(System.in);

    // Path of 'userData.txt' file to store and retrieve data
    String storageFilePath = "E:\\vrunda technologies\\programming-skills-bootcamp\\Week1\\Day4\\Project\\userData.txt";

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

                // Adding the new user to the userData.txt file
                write(email, password);
                System.out.println("User Has Been Registered Successfully!");
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
        return userMap.toString();// Returning list in String format
    }

    // Creating a method to check if the user exists in the hashmap
    public boolean isUserExists(String email) {
        return userMap.containsKey(email);// Returning true if email is available or else false
    }

    // Creating a method to write data(eg. email,password) in the file
    public void write(String email, String password) {
        try {
            FileOutputStream writeFileStream = new FileOutputStream(storageFilePath, true);
            String data = email + "," + password + "\n";
            char ch[] = data.toCharArray();
            for (char c : ch) {
                writeFileStream.write(c);
            }
            writeFileStream.close();
        } catch (Exception e) {
            System.out.println("File Write Error :" + e.toString());
        }
    }

    // Creating a method to read data(eg. email,password) from the file and adding retrieved data into the userMap hashmap.
    public void read() {
        userMap.clear();// Clearing the HashMap object before reading the file data
        try {
            // Creating an object of FileInputStream class to read a file from a specific file path
            FileInputStream readFileStream = new FileInputStream(storageFilePath);
            // Creating an object of BufferedReader class to read the content of the file
            // using FileReader
            // InputStreamReader is used to convert the bytes into characters
            BufferedReader reader = new BufferedReader(new InputStreamReader(readFileStream));
            // In simpler words, the above lines of code will help us to read a file from a specific path and convert the content from bytes to characters so that we can easily read it.
            String line;
            while ((line = reader.readLine()) != null) {// This loop will read each line of data from the file
                String userData[] = line.split(",");// Splitting the line by ',' and storing it into an array
                userMap.put(userData[0], userData[1]);// Storing the user data into the HashMap object
            }
        } catch (Exception e) {
            System.out.println("File Read Error :" + e.toString());// Handling the file read error if any
        }
    }
}

// Creating a class to manage user registration and login
public class UserAuthenticationSystem {
    public static void main(String[] args) {
        // Initializing a variable to receive user choice
        int choice = 0;
        Scanner sc = new Scanner(System.in);// Creating Scanner object for taking user input
        Authentication auth = new Authentication();// Creating object of Authentication class to access its methods

        // Running a loop to allow the user to choose between various options
        do {
            System.out.println("Enter Choice (eg. 1):\n1. Register\n2. Login\n3. View Records\n4. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // Registering a new user
                    auth.register();
                    // Update Data in hashmap by reading file
                    auth.read();// After registering a new user, this line reads the user data from the file and stores it in the userMap object.
                    break;
                case 2:
                    // Update Data in hashmap
                    auth.read();// This line reads the user data from the file and stores it in the userMap object.
                    // Logging in a user
                    auth.login();
                    break;
                case 3:
                    // Update Data in hashmap
                    auth.read();
                    // Listing all users in the hashmap
                    System.out.println(auth.listUsers());
                    break;
                case 4:
                    // Exiting From Loop
                    System.out.println("Thanks!");
                    break;
                default:
                    // Entered choice does not match with our list
                    System.out.println("Invalid Choice");
            }
        } while (choice != 4);// Repeat until user enters 4 to exit from the loop
    }
}