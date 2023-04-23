package Week1.Day4.Interface;

interface A{//can not create body of any method in interface
    //can not create object of any interface
    //interface is considered as an pure abstract
    public void display();
}
class B implements A{//to use interface implements keyword is used
    public void display(){
        System.out.println("Hello");   
    } 
}

public class InterfaceExample {
    public static void main(String[] args) {
        B b=new B();
        b.display();
    }
}
