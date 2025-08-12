public class MaxProfit{
    public static void main(String[] args) {
        int[] input={7, 10, 1, 3, 6, 9, 2};
       int output =  maxProfit(input);
       System.out.println(output);
    }

    private static int maxProfit(int[] input) {
        int value=0;
        for(int i=0;i<input.length-1;i++){
            for(int j=i+1;j<input.length;j++){
                
                    value = Math.max(value , input[j]-input[i]);
              
                 
            }
        }
        return value;
    }
}