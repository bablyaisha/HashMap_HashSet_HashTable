import java.util.*;

public class TwoSum_LeetCode {
    public static void main(String[] args) {
        int[] a={2,7,11,15};
        int target= 17;
        System.out.println("Two indexes with sum ="+target+" is: "+twoSum(a,target));
    }

    static ArrayList<Integer> twoSum(int[] a,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();

        for (int i=0;i< a.length;i++){
            int secNum= target-a[i];

            if(map.containsKey(secNum) && map.get(secNum)!=i){
               ans.add(map.get(secNum));
                ans.add(i);
            }
            map.put(a[i],i);
        }
        return ans;
    }
}
