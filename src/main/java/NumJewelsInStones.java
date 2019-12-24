/**
 * 题目来源：771.宝石与石头（https://leetcode-cn.com/problems/jewels-and-stones/）
 */
public class NumJewelsInStones {
  public int numJewelsInStones(String J, String S) {
    int[] alphabet = new int[52];
    for (char c : J.toCharArray()) {
      if (c >= 'A' && c <= 'Z') {
        alphabet[c - 'A'] = 1;
      } else {
        alphabet[c - 'a' + 26] = 1;
      }
    }

    // 宝石个数
    int count = 0;
    for (char c : S.toCharArray()) {
      if (c >= 'A' && c <= 'Z' && alphabet[c - 'A'] == 1) {
        count++;
      } else if (c >= 'a' && c <= 'z' && alphabet[c - 'a' + 26] == 1) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    String j = "ZdyS";
    String s = "yaa";
    NumJewelsInStones so = new NumJewelsInStones();
    System.out.println(so.numJewelsInStones(j, s));
  }
}
