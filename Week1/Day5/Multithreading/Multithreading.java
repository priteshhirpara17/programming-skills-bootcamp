package Week1.Day5.Multithreading;
class A extends Thread{
    public void run(){
        try{
            for(int i=1;i<=10;i++){
                System.out.println(i);
                Thread.sleep(1000);//to delay the process ->number ->milisec
            }
        }catch(Exception e){
            System.out.println("Error : "+e.toString());
        }
    }
}
class B extends Thread{
    public void run(){
        try{
            for(int i=10;i>=1;i--){
                System.out.println(i);
                Thread.sleep(1000);//to delay the process ->number ->milisec
            }
        }catch(Exception e){
            System.out.println("Error : "+e.toString());
        }
    }
}
public class Multithreading {
    public static void main(String[] args) {
        //System.out.flush();

        A a=new A();
        B b=new B();
        a.start();
        System.out.println("A thread : "+a.isAlive());
        System.out.println("B thread : "+b.isAlive());
        try{
            a.join();
        }catch(Exception e){

        }
        b.start();
        System.out.println("A thread : "+a.isAlive());
        System.out.println("B thread : "+b.isAlive());

    }
}

