import java.util.HashSet;

public class firstDupliacte {
  int firstDuplicate(int[] a) {
    for (int i : a) {
      if (a[Math.abs(i) - 1] < 0)
        return Math.abs(i);
      a[Math.abs(i) - 1] *= -1;
    }
    return -1;
  }

  int firstDuplicate2(int[] a) {
    HashSet<Integer> hashSet = new HashSet<>();
    for (int i = 0; i < a.length; i++) {
      if (!hashSet.contains(a[i])) {
        hashSet.add(a[i]);
      } else {
        return a[i];
      }
    }
    return -1;
  }
}
