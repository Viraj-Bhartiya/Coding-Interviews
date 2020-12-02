// /**
//  * reverseString
//  */
// public class reverseString {

//   public static void main(String[] args) {
//     char[] ori = { 'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'g', 'u', 'd' ,' '};
//     String word = "";
//     String ans = "";
//     for (int i = 0; i < ori.length; i++) {

//       word += ori[i];

//       if (ori[i] == ' ') {
//         ans = word+ans;
//         word = "";
//       }
//     }
//     System.out.println(ans);
//   }
// }

// class reverseString {
//   public static void main(String[] args) {
//       int mask = 0x000F;
//       int value = 0x2222;
//       System.out.println(value & mask);
//   }
// }

interface BaseI { void method(); }

class BaseC
{
   public void method()
   {
      System.out.println("Inside BaseC::method");
   }
}

class ImplC extends BaseC implements BaseI
{
   public static void main(String []s)
   {
      (new ImplC()).method();
   }
}