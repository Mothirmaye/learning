

import java.util.HashMap;

public class TwoSum{

    public static void main(String[] args) {
        int[] value = {2,7,11,15};
       int target =9;
       sumOfTwo(value,target);
       
    }

    private static int[] sumOfTwo(int[] num,int a) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int j=0;j<num.length;j++){
        map.put(num[j],j);
        }
        

        for(int i=0;i<num.length;i++){
            int c= a-num[i];

         if( map.containsKey(c)) {
           
            return new int[]{i,map.get(c)};
           

         } 
         

        }
        return new int[]{};
    }


       
    
}
