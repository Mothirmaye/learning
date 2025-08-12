
import java.util.Arrays;

public class LongestCommonPrefix{

    public static void main(String[] args) {
        String[] strs ={"flower","flow","flight"};
        findCommonPrefix(strs);
    }

    public static String findCommonPrefix(String[] star){

        StringBuilder ans = new StringBuilder();
        Arrays.sort(star);
       String first= star[0];
       String last = star[star.length-1];


        for(int i=0;i<Math.min(first.length(),last.length());i++)
        {
            if(first.charAt(i)!=last.charAt(i)){
                return ans.toString();
            }

            ans.append(first.charAt(i));
            System.out.println(ans);
            
        }
    

    return ans.toString();
    }
}