import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        byte[] bytes = in.nextLine().getBytes();
        String result = "";
        
        char lastValue = 'a';
        boolean first = true;
        String newValue = "";

        for (byte b : bytes) {
            String value = String.format("%0"+7+"d", Integer.parseInt(Integer.toBinaryString(b)));
            for(char c : value.toCharArray()){
                if(first){
                    if(c == '1'){
                        newValue = "0 0";
                    } else{
                        newValue = "00 0";
                    }
                } else {
                    if(c == '1'){
                        newValue = " 0 0";
                    } else{
                        newValue = " 00 0";
                    }
                }
                result += (c == lastValue ? "0" : newValue);
                lastValue = c; 
                first = false;
            }
        }
        System.out.println(result);
    }
    
}