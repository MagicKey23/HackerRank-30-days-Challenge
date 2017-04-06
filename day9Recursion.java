import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.2 */
        Scanner in = new Scanner(System.in);
        int Kappa = in.nextInt();
        int result = factorial(Kappa);
        System.out.println(result);
        
       
    }
    public static int factorial(int n){
        if (n <= 1 ){
            return n;
        }else{return n * factorial(n-1);}
    }
}
