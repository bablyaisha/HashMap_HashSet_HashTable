import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
        //creating hash set
        HashSet<Integer> set= new HashSet<>();

        //insertion---- .add()
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(2);//duplicates not allowed and also not considered in hashing

        //searching---- .contains()
        if(set.contains(1)){
            System.out.println("Set have 1");
        }else{
            System.out.println("Set does not have 1");
        }

        //delete---- .remove()
         set.remove(2);
        if(!set.contains(2)){
            System.out.println("successfully removed");
        }else {
            System.out.println("not removed");
        }

        //size---- .size()
        System.out.println("Size of Has set is: "+ set.size());

        //To get all elements
        System.out.println("All Elements present in hashset are: "+set);

        //Iterator
        Iterator it= set.iterator();
        //to iterate all
        System.out.println("After Iteration:");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
