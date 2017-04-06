import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 0, r =0; 
        
        
        while(n > 0 ){
          int remainer = n%2;
           n = n/2;
            if(remainer == 1){
                c++;
                if(c>=r){
                    r = c;
                }
                
            }else{c = 0;}
            
          
        }
          System.out.println(r);
    }
}
