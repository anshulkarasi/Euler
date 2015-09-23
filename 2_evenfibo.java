import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/** E_0 =0, E_1 = 2, E_n = 4 * E_(n-1) + E_(n-2) */ 
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t>0){
            t--;
            long  n = Long.parseLong(scanner.nextLine());
            long a =0,b=2, sum = 2;
            while(true){
                long c = a+ 4*b;
                 a=b;
                b=c;
                if(b <=n) sum+=b;
                else break;
                
            }
            
            System.out.println(sum);
        }
    }
    
}