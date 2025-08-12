public class SearchInsertPosition{

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target =5;
        int index = searchPosition(nums,target);
        System.out.println(index);
    }

    private static int searchPosition(int[] nums, int target) {
       
        int b=0;
        int c = nums.length-1;
        int mid = b+c/2;
        while(b<=c){
            if(nums[mid]==target) 
            {
                
                  return mid;
            }
            else if(nums[mid]<target){
                b =mid+1;
            }
            else{

                c=mid-1;
            }
        }

        return b;
      
    }

}