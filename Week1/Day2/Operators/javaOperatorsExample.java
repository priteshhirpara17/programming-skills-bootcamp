package Week1.Day2.Operators;
class javaOperatorsExample{
    public static void main(String[] args) {
        //operators is used to perform operations on values
        /*
         * Arithmetic 
         * Relational
         * Logical
         * Conditional
         *
        */
        int x=10,y=20;
        System.out.println("Addition is "+(x+y));
        System.out.println("Subtraction is "+(x-y));
        System.out.println("Multiplication is "+(x*y));
        System.out.println("Division is "+(x/y));
        System.out.println("Modulus is "+(x%y));


        System.out.println("Less than "+(x<y));
        System.out.println("Greater than "+(x>y));
        System.out.println("Less than or equal "+(x<=y));
        System.out.println("Greater than "+(x>=y));
        System.out.println("Equals "+(x==y));

        //logical
        //condition -> (value R.O. value)
        // && and -> and require every condition to be true
        //x>y && x<z //x>y->true , x<z-> true

        //conditional operator
        // condition ? true : false;
        System.out.println(x>y?"x is big":"x is small");
    }
}