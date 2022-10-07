import java.util.*;

public class stringFreq {
    public static void main(String[] args) {
        //return the maaximum frequency character from the string given
        String s= "aaabccccddee";
        System.out.println(freq(s));
    }

    static char freq(String str){
        //key=character value=frequency of that character
        HashMap<Character,Integer> map=new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {
             char ch= str.charAt(i);
           //if map has that character then the frequency will be increamented
             if(map.containsKey(ch)){
                 map.put(ch,map.get(ch)+1);
             }else {
                 map.put(ch, 1);
             }
        }
        //Creating set for keys to iterate in map
        Set<Character> keyset= map.keySet();
        int maxFreq= Integer.MIN_VALUE;
        char maxChar=' ';
       //Iteration in map
        for(char key: keyset){
            if(map.get(key)>maxFreq){
                maxFreq=map.get(key);
                maxChar=key;
            }
        }
        return maxChar;
    }
}
