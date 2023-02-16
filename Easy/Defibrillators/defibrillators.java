import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        Double lon = Double.parseDouble(in.next().replaceAll(",","\\."));
        Double lat = Double.parseDouble(in.next().replaceAll(",","\\."));
       

        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }

        Double min = Double.POSITIVE_INFINITY;
        String name ="";

        for (int i = 0; i < N; i++) {
            String[] defib = in.nextLine().split(";");

            Double defibLon = Double.parseDouble(defib[4].replaceAll(",","\\."));
            Double defibLat = Double.parseDouble(defib[5].replaceAll(",","\\."));

            Double x = (defibLon - lon) * Math.cos((lat + defibLat)/2);
            Double y = (defibLat - lat);

            Double dist = Math.sqrt(Math.pow(x,2) + Math.pow(y,2))*6371;

            if(dist < min){
                min = dist;
                name = defib[1];
            }

        }

        System.out.println(name);
    }
}