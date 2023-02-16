import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
        if(n == 0){
            System.out.println(0);
        } else {
            int result = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {

                int t = in.nextInt();
                
                if(Math.abs(t) < Math.abs(result)){
                    result = t;
                } 

                else if(t + result == 0){
                    result = Math.abs(t);
                }         
            }

            System.out.println(result);
        }
    }
}