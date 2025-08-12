public class FirstOccuranceIndex{

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";
        int a = firstOccurance(haystack,needle);
        System.out.println(a);
        
    }

    private static int firstOccurance(String haystack, String needle) {
        int b =-1;
        if(haystack.contains(needle)){
             b = haystack.indexOf(needle);
        }
        return b;
    }
}