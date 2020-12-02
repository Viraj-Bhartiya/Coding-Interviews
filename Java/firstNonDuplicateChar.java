// import java.util.*;
//Method 1
// O(n^2)

// class firstNonDuplicateChar {
//   public static void main(String[] args) {
//     System.out.println(chk("aaabccc"));
//   }

//   static char chk(String str) {
//     for (int i = 0; i < str.length(); i++) {
//       int c = 0;
//       for (int j = 0; j < str.length(); j++) {
//         if (str.charAt(i) == str.charAt(j) && i != j ) {
//           c ++;
//         }
//       }
//       if (c == 0)
//         return str.charAt(i);
//     }

//     return '_';
//   }
// }

//Method 2
//O(2n)
// public class firstNonDuplicateChar {
//   public static void main(String[] args) {
//     System.out.println(chk("aaabccc"));
//   }
//   static char chk(String str) {
//     HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
//     for (char c : str.toCharArray()) {
//       if (hash.containsKey(c))
//         hash.replace(c, hash.get(c) + 1);
//       else
//         hash.put(c, 1);
//     }

//     for (int i = 0; i <str.length(); i++) {
//       if (hash.get(str.charAt(i)) == 1)
//         return str.charAt(i);
//     }

//     return '_';
//   }

// }

//method 3
//O(n)

/**
 * firstNonDuplicateChar
 */
public class firstNonDuplicateChar {

  public static void main(String[] args) {
    System.out.println(chk("aaabbbbx"));
  }

  static char chk(String str) {
    for (int i = 0; i < str.length(); i++)
      if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))
        return str.charAt(i);
    return '_';
  }
}