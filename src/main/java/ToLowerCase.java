/**
 * 题目来源：709.转换成小写字母（https://leetcode-cn.com/problems/to-lower-case/）
 *
 * 大小写字母的ASCII码
 * [a,z] = [97,122]
 * [A,Z] = [65,90]
 */
public class ToLowerCase {
  // 转换为小写
  public String toLowerCase(String str) {
    // 参数合法性校验
    if (str == null) {
      return null;
    }

    int index = 0;
    StringBuilder result = new StringBuilder();
    while (index < str.length()) {
      if (str.charAt(index) >= 'A' && str.charAt(index) <= 'Z') {
        result.append((char)(str.charAt(index) + ('a' - 'A')));
      } else {
        result.append(str.charAt(index));
      }

      index++;
    }

    return result.toString();
  }

  public static void main(String[] args) {
    String s = "HeLLO, World!";
    ToLowerCase so = new ToLowerCase();
    System.out.println(so.toLowerCase(s));
  }
}
