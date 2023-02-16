import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long r1 = in.nextLong();
        long r2 = in.nextLong();
        
        while(r1 != r2) {
            if(r1 < r2) r1 += sum(r1);
            else r2 += sum(r2);
        }

        System.out.println(r1);
    }
    
    public static long sum(long n) {
        return n == 0 ? 0 : n % 10 + sum((int)(n / 10));
    } 
}