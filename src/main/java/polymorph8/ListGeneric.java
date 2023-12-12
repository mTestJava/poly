package polymorph8;

import java.util.ArrayList;

public class ListGeneric {
    public static void main(String[] args) {
        // Creating a an ArrayList with String specified
        ArrayList <String> al = new ArrayList<String> ();

        al.add("Sachin");
        al.add("Rahul");

        // Now Compiler doesn't allow this
//        al.add(10);

        String s1 = al.get(0);
        String s2 = al.get(1);
        String s3 = al.get(2);
    }
}