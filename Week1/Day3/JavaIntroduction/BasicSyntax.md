# Java Basic Program Syntax

## Main Method

Every Java program must have a **_main_** method. This method is the entry point for the program and is executed when the program runs. Here is an example of a **_main_** method:

```java
public static void main(String[] args) {
    // Program code goes here
}
```

The **_public_** keyword means that the **_main_** method can be accessed from other classes. The **_static_** keyword means that the method belongs to the class and not to an instance of the class. The **_void_** keyword means that the method does not return a value.

## How to Run Java Code

Running a Java program requires a few steps, but it is straightforward once you understand the process. Here are the steps to run a Java code:

### Step 1: Write the Code

The first step is to write your Java code using a text editor such as Notepad, TextEdit, or a more sophisticated IDE such as VSCode or IntelliJ IDEA. You can write your code in any text editor, but make sure to save it with a **_.java_** extension.

### Step 2: Compile the Code

>Note: Make sure you are in the exact directory where you have created file.

The second step is to compile the Java code using the Java compiler **_(javac)_**. To do this, open a terminal or command prompt, navigate to the directory where your **_.java_** file is saved, and type the following command:

```cmd
javac MyProgram.java
```

### Step 3: Run the Program

>Note: Make sure you are in the exact directory where you have created file.

The final step is to run the program using the Java Virtual Machine (JVM) by typing the following command in the terminal:

```cmd
java MyProgram
```

## Output

To output information to the console, you can use the **_System.out.println()_** method. Here is an example:

```java
System.out.println("Hello, world!");
```

> This will output the text "Hello, world!" to the console.

## Variables

Variables are used to store values in a Java program. To declare a variable, you must specify the data type and a name for the variable. Here is an example:

```java
int num = 5;
```

>This declares a variable named **_num_** of type **_int_** and assigns the value **_5_** to it.

## Input

To read input from the console, you can use the **_Scanner_** class. Here is an example:

```java
import java.util.Scanner;
class JavaInput{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Your name is : "+name);
    }
}
```

This creates a **_Scanner_** object to read input from the console. The **_System.out.print()_** method is used to output a prompt to the console. The **_scanner.nextLine()_** method is used to read a line of input from the console and assign it to a variable named **_name_**.
