import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String exp = in.next();

        Map<Character, Character> a = new HashMap<Character, Character>();
        a.put('{','}');
        a.put('[',']');
        a.put('(',')');

        boolean result = true;
        Stack<Character> s = new Stack<Character>();
        for(char c : exp.toCharArray()) {
            if(a.containsKey(c)){ 
              s.push(c);
            }
            if(a.containsValue(c)){
              result &= !s.isEmpty() && c == a.get(s.pop());
            }
        }

        System.out.println(result && s.isEmpty());
    }
}