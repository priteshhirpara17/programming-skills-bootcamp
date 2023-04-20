#include <stdio.h> // # informs compiler to perform task befor starting program (preprocessor)
// include is used to inform compiler to use some pre-made code file(header/library file)
// stdio.h -> standard input output
// main is a function->code block(set of code with a name)
void main()
{ // program always starts from main
    // variable -> variable is used to store any value
    // data type ->  a type of value to store into variable
    //  general purposes-> numeric, boolean, characters
    //  int,float,double,long,char

    // rules of variable name/name

    /*
        - start with a_Z or _(underscore)
        - can not start with 0-9, special characters
        - name can have a_Z,0-9 or underscore (after first character of name)
        - name can have special character and white space
    */

    int x = 10; // int -> data type x->variable
    // int 1x; //wrong
    // int _x,x21;//correct
    float y = 12.40;    // 4 byte memory size
    double z = 123.567; // larger version of float -> 8 byte
    char q = 'w';
    char r = '@';
    char p = '2';

    printf("%d is x\n", x);
    printf("%f is y\n", y);
    printf("%lf is z\n", z);
    printf("%c is q\n", q);
    printf("%c is r\n", r);
    printf("%c is p\n", p);
    // printf is inbuilt function to show data on console
    //%d represents decimal value->int
    //%f represents fractional value->float
    //%lf represents large fractional value->double
    //%c represents character->char
}