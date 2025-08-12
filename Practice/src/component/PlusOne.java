

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {4,3,9,9};
       int[] num = plusOne(digits);
        for (int nums : num) {
                System.out.println(nums);
            }
    }

    private static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                
                return digits;
            }
           

            digits[i] = 0;
        }

int[] newNumber = new int[digits.length+1];
newNumber[0]=1;
        return newNumber;
    }



}
