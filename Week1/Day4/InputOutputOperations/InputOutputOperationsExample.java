package Week1.Day4.InputOutputOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class ReadWrite{
    String filePath="E:\\vrunda technologies\\programming-skills-bootcamp\\Week1\\Day4\\InputOutputOperations\\test.txt";
    public void write(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Data");
        String data = sc.nextLine();
        try {
            FileOutputStream fout = new FileOutputStream(filePath);
            char ch[] = data.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                fout.write(ch[i]);
            }
            fout.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    public void read(){
        try{
            FileInputStream fin=new FileInputStream(filePath);
            int i;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}

public class InputOutputOperationsExample {
    public static void main(String[] args) {
        ReadWrite rw=new ReadWrite();
        rw.write();
        rw.read();
    }

}
