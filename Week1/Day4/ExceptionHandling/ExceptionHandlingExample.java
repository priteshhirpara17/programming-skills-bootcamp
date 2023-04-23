package Week1.Day4.ExceptionHandling;

/*
 * in java there is an mechanism called exception handeling, to avoid runtime errors 
 */
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int x[]=new int[3];//0,1,2
        System.out.println("Hello");
        try{
            x[3]=10;
            System.out.println(x[2]);
        }catch(Exception e){
           System.out.println(e.toString());
        }
        System.out.println("Hi");
    }
}
