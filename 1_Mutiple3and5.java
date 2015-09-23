import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        
        while(t >0){
            t--;
            int n = Integer.parseInt(scanner.nextLine()) - 1;
            long q3 = n/3;
            long q5 = n/5;
            long q15 = n/15;
            
            long sum3 = 3 * (q3 + (q3 * (q3-1))/2);
            long sum5 = 5*(q5 + (q5 * (q5-1))/2);
            long sum15 = 15*(q15 + (q15 *(q15-1))/2);
           
                System.out.println(sum3 + sum5 -sum15);
        }
    }
}