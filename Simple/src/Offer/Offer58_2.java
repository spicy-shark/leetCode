package Offer;

public class Offer58_2 {

  public String reverseLeftWords(String s, int n) {
    return s.substring(n) + s.substring(0, n);
  }

}
