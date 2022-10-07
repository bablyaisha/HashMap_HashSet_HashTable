import java.util.HashMap;

public class CountPairs {
    public static void main(String[] args) {
        //Count pairs with sum
        int[] a={1,1,1,1};
        int sum=2;
        System.out.println(count(a,sum));
    }

    static int count(int[] a,int sum){
        //key=array's element , value= frequency
        HashMap<Integer,Integer> map= new HashMap<>();
        int ans=0;
        for (int i = 0; i <a.length ; i++) {
            int b= sum-a[i];
            if(map.containsKey(b)){
                 ans+=map.get(b);
            }
            if(map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            }else{
                map.put(a[i],1);
            }
        }
        return ans;
    }
}

