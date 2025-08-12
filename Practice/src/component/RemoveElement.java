public class RemoveElement{

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int value = 2;
        int k = removeElement(nums,value);
        System.out.println(k);
    }

    private static int removeElement(int[] nums, int value) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=value){

                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }

}