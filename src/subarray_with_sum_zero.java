import java.util.*;

public class subarray_with_sum_zero {
    public static void main(String[] args) {
        int[] a={15,-2,2,-8,1,7,10,23};
        int sum=0;
        //Q- Longest sub-array with sum 0
        System.out.println("Longest subarray with sum=0 is: "+longestSubarray(a));
    }

    static int longestSubarray(int[] a){
        HashMap<Integer,Integer> map=new HashMap<>();

        int sum=0,maxlen=0;
        for (int i = 0; i <a.length ; i++) {
             sum+=a[i];

             if(a[i]==0 && maxlen==0) maxlen=1;
             if(sum==0) maxlen=i+1;
            // Look this sum in hash table
             Integer prev_i= map.get(sum);
            // If this sum is seen before, then update max_len if required
             if(prev_i!=null){
                 maxlen=Math.max(maxlen,i-prev_i);
             }else {
                 map.put(sum,i);
             }

        }
        return maxlen;
    }
}
