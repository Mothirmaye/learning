public class SeparateNegPos{
    public static void main(String[] args) {
        int[] input ={12, 11, -13, -5, 6, -7, 5, -3, -6};
      int[] output =   separateNegPos(input);
      for(int value : output){
        System.out.print(value+ " ");
      }
    }

    private static int[] separateNegPos(int[] input) {
        int idx = 0;
        int[] temp = new int[input.length];
        for(int i=0;i<input.length-1;i++){
            if(input[i]<0){
                temp[idx++]=input[i];
            }      
        }
        for(int j=0;j<input.length-1;j++){
            if(input[j]>0){
                temp[idx++]=input[j];
            }
        }

        return temp;
        
    }
}