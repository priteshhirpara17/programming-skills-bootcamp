package Week1.Day3.ControlFlowStatements;

public class LoopingStatements {
   public static void main(String[] args) {
      /*
       * Exit Control -> do..while()
       * Entry Control-> while().., for()..
       */
      /*
       *    do{
       *    //code to repeat goes here
       *   }while(condition);
       */
      int n=1;
       do{
         System.out.println("Hi");
         n++;
       }while(n<=5);

       /*
        *   while(condition){
               //code goes here
            }
        */

        while(n<=10){
          System.out.println(n);
          n++;
        }

        /*
            for(initialization;condition;inc/dec){
                  //code goes here
            }
         */
         for (int i=10,j=1;i>=1;i--,j++) {
            System.out.println(i);
            System.out.println("J : "+j);
         }
   }
}
