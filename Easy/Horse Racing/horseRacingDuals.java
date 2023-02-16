import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int result = 100000000;

        ArrayList<Integer> pn = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();           
            pn.add(pi);            
        }

        Collections.sort(pn);

        for(int j = 0; j<pn.size()-1;j++){
          int diff = pn.get(j+1) - pn.get(j);
            if( diff < result){
                result = diff;
            };                        
        }        

        System.out.println(result);
    }
}