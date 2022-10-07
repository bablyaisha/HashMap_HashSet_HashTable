import java.util.*;

public class DuplicateInArray {
    public static void main(String[] args) {
        int[] a= {2,4,3,2,7,1,5,7,8,10};

           duplicate(a);
         }
    static void duplicate(int[] a){

        HashMap<Integer,Integer> map= new HashMap<>();
       //key= element of array, value= occurrence of that element
        for (int x: a) {
             if(!map.containsKey(x)){
                 map.put(x,1);
             }else {
                 map.put(x,map.get(x)+1);
             }
        }
        //To iterate over hash table:
        for (Integer x: map.keySet()) {
              if(map.get(x)>1){
                  System.out.println("Duplicate values are: "+x);
              }
        }

    }
}
