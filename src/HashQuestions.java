import java.util.*;

public class HashQuestions {
    public static void main(String[] args) {
        //Q- Find the sub-array with given sum
           int[] a={15,-2,2,-8,1,7,10,23};
           int sum=2;
        System.out.println(subSum(a,sum)); //this is giving shorted=st length

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
            //map.get(curSum-sum)+1!=i this condition so that repeat na kare same index ko
            if(map.containsKey(curSum-sum) && map.get(curSum-sum)+1!=i){
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

}
