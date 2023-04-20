#include <stdio.h>
void main()
{
    int x = 5, y = 2, z = 1;

    // simple if condition
    if (x > 0){ // if condition is true run code from code block {}, otherwise do nothing
        printf("x is positive");
    }

    // simple if else condition
    if (x > y){ // if condition is true display message "x is greater than y"
        printf("x is greater than y");
    }
    else{ // if the condition given in if is false code will be executed from else
        // else can not have condition EVER
        printf("y is greater than x");
    }

    //simple ladder if else / else if
    if (x > y && x > z) {
        printf("x is large");// code block executed if (x > y && x > z) is true
    }
    else if (y > x && y > z){
        printf("y is large");// code block executed if (x > y && x > z) is false and (y > x && y > z) is true
    }
    else if (z > x && z > y){
        printf("z is large"); // code block executed if (x > y && x > z) and (y > x && y > z) are false and (z > x && z > y) is true
    }
    else{
        // code block executed if none of the conditions are true
    }


    //nested if else
    if (x > y){
        if (x > z){
            printf("x is large");
        }
        else{
            printf("z is large");
        }
    }
    else{
        if (y > z){
            printf("y is large");
        }
        else{
            printf("z is large");
        }
    }

    //switch case
    switch (x) // always only value //x=5
    {
        case 1:
            printf("Hi");
            // any code
            break;
        case 34:
            printf("Hello");
            break;
        default:
            printf("Hey"); // output
    }
}