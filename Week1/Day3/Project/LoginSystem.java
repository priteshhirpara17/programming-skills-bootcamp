package Week1.Day3.Project;

import java.util.Scanner;

public class LoginSystem {//step 1
    //step 2
    private String email;
    private String password;
    Scanner sc = new Scanner(System.in);

    public void setCredentials(){
        email="test@email.com";
        password="password";
    }

    public void login() {
        System.out.print("Enter Email: ");
        String userEmail = sc.nextLine();
        System.out.print("Enter Password: ");
        String userPassword = sc.nextLine();

        if (email.equals(userEmail) && password.equals(userPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Wrong Credentials");
        }
    }

    public static void main(String[] args) {
        LoginSystem system = new LoginSystem();
        system.setCredentials();
        system.login();
    }
}
