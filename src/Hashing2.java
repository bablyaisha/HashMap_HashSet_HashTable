import java.util.*;

public class Hashing2 {
    public static void main(String[] args) {
       //Creating Hash Map
        HashMap<String,Integer> map= new HashMap<>();
        //insert---- .put()
        map.put("India",120);
        map.put("China",200);
        map.put("US",80);
        map.put("Korea",20);

        System.out.println(map);
          //update
        map.put("China",180);
        System.out.println("After updation:"+map);

        //Searching
        //1-> containsKey()-> to check for key (returns true or false)
        if(map.containsKey("US")){
            System.out.println("Key 'US' exist");
        }else{
            System.out.println("Not exist");
        }
        //2-> get()-> returns value if key present
        System.out.println("Value is: "+map.get("China"));
        System.out.println("Value is: "+map.get("Britain"));

        //Iteration
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey()+"="+e.getValue());
        }

        //Delete---- remove()
        map.remove("China");
        System.out.println("After Deletion: "+map);
    }
}
