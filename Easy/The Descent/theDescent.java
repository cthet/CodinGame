import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        int max = 0;
        int target = 0;
        while (true) {
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if(mountainH >= max){
                    target = i;
                    max = mountainH;
                }
            }
            max = 0;

            System.out.println(target); // The index of the mountain to fire on.
        }
    }
}