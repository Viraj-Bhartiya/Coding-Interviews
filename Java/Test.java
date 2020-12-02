import java.util.*;

class Test {
    Scanner sc = new Scanner(System.in);
   public static void main(String[] args) {
       int[] arr= {1,2,2,3,1};

       int great = 0,num = arr[0];
       for(int i = 0;i<4;i++){
           int n = arr[i];
           int c = 0;
           for(int j = 0;j<4;j++){
               if(n==arr[j]){
                   c++;
               }
           }
           if(c > great){
               int temp = c;
               c = great;
               great = temp;
               num = arr[i];
           }
       }
       System.out.println(num);
   }
}