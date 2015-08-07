import java.util.*;
public class Lexer {
    public String[] tokenize(String[] tokens,String input) {
        List<String> res = new ArrayList<String>();
        Set<String> set = new HashSet<String>(Arrays.asList(tokens)); 
        int high = input.length();
        while(input.length()>0) {
            String s = input.substring(0, high);
            if(set.contains(s)) {
                res.add(s);
                input = input.substring(high,input.length());
                high = input.length();
                }
            else high --;
            if(high == 0) {
                if(input.length()<2) break;
                input = input.substring(1,input.length());
                high = input.length();
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
