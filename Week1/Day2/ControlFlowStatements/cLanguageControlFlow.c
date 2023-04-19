#include<stdio.h>
void main(){
    int x=5,y=2,z=1;

    if(x>0){//if condition is true run code from code block {}
        printf("x is positive");
    }

    if(x>y){
        printf("x is greater than y");
    }else{//if the condition given in if is false code will be executed from else 
    //else can not have condition EVER
        printf("y is greater than x");
    }


    if(x>y && x>z){
        printf("x is large");
    }else if(y>x && y>z){
        printf("y is large");
    }else if(z>x && z>y){
        printf("z is large");
    }

    if(x>y){
        if(x>z){
            printf("x is large");
        }else{
            printf("z is large");
        }
    }else{
        if(y>z){
            printf("y is large");
        }else{
            printf("z is large");
        }
    }


    switch (x)//always only value //x=5
    {
        case 1:
            printf("Hi");
            //any code
        break;
        case 34:
            printf("Hello");
        break;
        default:
            printf("Hey");//output
    }
}