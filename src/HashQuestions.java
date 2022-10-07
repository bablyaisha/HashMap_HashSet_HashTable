import java.util.*;

public class HashQuestions {
    public static void main(String[] args) {
        //Q- Find the sub-array with given sum
           int[] a={15,-2,2,-8,1,7,10,23};
           int sum=0;
        System.out.println(subSum(a,sum)); //this is giving shorted=st length
        //Q- Longest sub-array with sum 0
        System.out.println("Longest subarray with sum=0 is: "+longSub(a));
    }
    static ArrayList<Integer> subSum(int[] a, int sum){
        int curSum=0,start=0,end=-1;
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<a.length;i++){
            curSum+=a[i];
            if(curSum-sum==0){
                start=0;
                end=i;
                break;
            }
            if(map.containsKey(curSum-sum)){
                start= map.get(curSum-sum)+1;
                end=i;
                break;
            }
            map.put(curSum,i);
        }
        if(end==-1){
           ans.add(-1);
           return ans;
        }
            ans.add(start);
        ans.add(end);
        return ans;
    }
    static int longSub(int[] a){
        HashMap<Integer,Integer> map=new HashMap<>();

        int sum=0,maxlen=0;

        for(int i=0;i<a.length;i++){
            sum+=a[i];

            if(a[i]==0 && maxlen==0) maxlen=1;
            if(sum==0) maxlen=i+1;
            // Look this sum in hash table
            Integer prev_i= map.get(sum);
            // If this sum is seen before, then update max_len if required
            if(prev_i!=null){
                maxlen= Math.max(maxlen,i-prev_i);
            }else{
                map.put(sum,i);
            }

        }
        return maxlen;
    }

}
