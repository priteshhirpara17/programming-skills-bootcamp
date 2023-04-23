package Week1.Day4.Abstract;

abstract class A{//can not create object of abstract class
    //can not create body of abstract method
    abstract void display();

    void show(){//normal method
        System.out.println("Hello");
    }

}

class B extends A{
    
    void display() {
        System.out.println("Hi");
        
    }
    void print(){
        System.out.println("Hey");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        B b=new B();
        b.show();
        b.display();
        b.print();
    }
}
