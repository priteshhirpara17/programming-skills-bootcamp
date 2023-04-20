package Week1.Day3.JavaIntroduction;

import java.util.Scanner;

public class JavaUserInput{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your email : ");
        String email=sc.nextLine();

        System.out.println("Your Email is : "+email);
    }
}