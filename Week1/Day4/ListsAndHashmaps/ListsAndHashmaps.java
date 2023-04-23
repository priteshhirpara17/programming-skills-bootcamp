package Week1.Day4.ListsAndHashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ListsAndHashmaps {
    public static void main(String[] args) {
        //list is in in-built data structure provided by java
        List<String> names=new ArrayList();
        List<String> emails=new ArrayList();
        names.add("Raj");
        names.add("Hardik");
        names.add("Dhruv");
        names.add("Akhshat");
        
        System.out.println(names);

        names.remove(2);

        System.out.println(names);
        
        emails.add("a@a.com");
        emails.add("b@a.com");
        emails.add("c@a.com");
        emails.add("d@a.com");

        names.add(2, "Krutik");
        System.out.println(emails);        

        System.out.println(names);

        HashMap<String,String> users=new HashMap<>();
        users.put("Nidhi", "nidhi@email.com");
        users.put("sahil", "sahil@email.com");
        users.put("riya", "riya@email.com");
        users.put("ISHAN", null);

        System.out.println(users);
    }
}
