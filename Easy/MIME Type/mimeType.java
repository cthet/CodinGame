import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.

        HashMap<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            in.nextLine(); 
            map.put(EXT.toLowerCase(),MT);
        }
               
		
        for (int i = 0; i < Q; i++) 
        {
            String fName = in.nextLine().toLowerCase(); // One file name per line.
            
            if (fName.indexOf(".") == -1) // If no extension
                System.out.println("UNKNOWN");
            else   
            {
                if (map.get(fName.substring(fName.lastIndexOf(".") + 1)) != null)
                    System.out.println(map.get(fName.substring(fName.lastIndexOf(".") + 1)));
                else 
                    System.out.println("UNKNOWN");
            }
        }
    }        
        // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
        
    
}