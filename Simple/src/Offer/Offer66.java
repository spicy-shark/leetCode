package Offer;

public class Offer66 {

  public int[] constructArr(int[] a) {
    if (a.length < 2) {
      return a;
    }
    int[] left = new int[a.length];
    left[0] = a[0];
    int[] right = new int[a.length];
    right[a.length - 1] = a[a.length - 1];
    for (int i = 1; i < a.length; i++) {
      left[i] = a[i] * left[i - 1];
      right[a.length - 1 - i] = a[a.length - 1 - i] * right[a.length - i];
    }
    int[] res = new int[a.length];
    res[0] = right[1];
    res[a.length - 1] = left[a.length - 2];
    for (int i = 1; i < a.length - 1; i++) {
      res[i] = left[i - 1] * right[i + 1];
    }
    return res;
  }

}
