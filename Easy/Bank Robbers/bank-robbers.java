import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int nbRobber = in.nextInt();
        int[] robbers = new int[nbRobber];
        int nbVault = in.nextInt();
        for (int i = 0; i < nbVault; i++) {
            int nbChar = in.nextInt();
            int nbDigit = in.nextInt();
            robbers[0] += (int)Math.pow(10,nbDigit)*(int)Math.pow(5,nbChar-nbDigit);
            Arrays.sort(robbers);
        }

        System.out.println(robbers[robbers.length-1]);
    }
}