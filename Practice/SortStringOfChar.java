
import java.util.Arrays;

public class SortStringOfChar{
    public static void main(String[] args) {
        String s = "dcab";
       String o = sortStringOfChar(s);
       System.out.println(o);
    }

    private static String sortStringOfChar(String s) {
      char[] b = s.toCharArray();
     Arrays.sort(b);
      String a = new String(b);
      return a;
       }
    }
