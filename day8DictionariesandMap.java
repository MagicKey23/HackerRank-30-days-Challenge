//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next(); // nameInput for the map
            int phone = in.nextInt(); // Phone input for the map
            // Write code here
            phoneBook.put(name, phone); // Key and Value is now inside the map
          
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(!phoneBook.containsKey(s)){
                System.out.println("Not found");
            }else {System.out.println(s + "=" + phoneBook.get(s));}
          
        }
        in.close();
    }
}
