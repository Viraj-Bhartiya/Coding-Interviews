import java.util.*;

/**
 * StaticticsOfUnsortedArray
 */
public class StaticticsOfUnsortedArray {

   public static void main(String[] args) {
      int[] test = { 3, 2, 5, 6 };
      System.out.println(min(test, 2));
   }

   static int min(int[] arr, int pos) {
      Arrays.sort(arr);
      return arr[pos-1];
   }
}