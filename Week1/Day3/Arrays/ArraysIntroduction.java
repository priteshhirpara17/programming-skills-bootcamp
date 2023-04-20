package Week1.Day3.Arrays;

import java.util.Scanner;

public class ArraysIntroduction {
    public static void main(String[] args) {
        //array is a collection of values having same data type
        int x[]=new int[5];//new -> is used to allocate memory
        int y[]={11,21,31,41,51,61,71,81};//indexes(0,1,2,3,4,5,6)
        //11->0, 21->1 31->2 
        for(int i=0;i<y.length;i++){
            System.out.println(y[i]);
        }

        //multi dimensional array
        int q[][]=new int[3][3];//memory allocation
        int p[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };//assign
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(p[i][j]+"\t");
            }
            System.out.println();
        }

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                q[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(q[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
