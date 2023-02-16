import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position
        
        int x = initialTX;
        int y = initialTY;

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            
            String move = "";
            
            if (y > lightY) {
                move += "N"; y--;
            }
            else if (y < lightY) {
                move += "S"; y++;
            }
            
            if (x > lightX) {
                move += "W"; x--;
            }
            else if (x < lightX) {
                move += "E"; x++;
            }

            // A single line providing the move to be made:
            // N NE E SE S SW W or NW
            System.out.println(move); 
            
        }
    }
}