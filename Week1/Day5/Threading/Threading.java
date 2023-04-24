package Week1.Day5.Threading;

class A extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i=10;i>=1;i--){
            System.out.println(i);
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        //Thread-> it is a lite weighted process, it is sub process of a large process
        //Calculations(add,sub,mul,div,mod)
        //add->,sub->,mul->,div->,mod->

        /*
         * thread class
         * runnable interface
         */

         A a=new A();
         a.start();//this invokes run method

         B b=new B();
         Thread t=new Thread(b);
         t.run();
    }
}
