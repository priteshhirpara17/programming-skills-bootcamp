package Week1.Day3.OOP;

class A{
    String name="Hello";
    void print(){
        System.out.println("Your name is "+name);
    }
}
class B extends A{
    String email="hello@email.com";
    void display(){
        System.out.println(name+"'s Email is "+email);
    }
}

public class Inheritance {
    public static void main(String[] args) {
      
        B b1=new B();
        b1.print();
        b1.display();
    }
}
