/**
 * 题目来源：8.字符串转换整数(atoi)（https://leetcode-cn.com/problems/string-to-integer-atoi/）
 */
public class MyAtoi {
  // atoi, 转换失败返回0
  public int myAtoi(String str) {
    int total = 0;
    int sign = 1;
    int index = 0;

    if (str == null || str.isEmpty()) {
      return 0;
    }

    // left trim
    while (index < str.length() && str.charAt(index) == ' ') {
      index++;
    }

    // 符号位处理
    if (index < str.length() && (str.charAt(index) == '-' || str.charAt(index) == '+')) {
      sign = str.charAt(index) == '-' ? -1 : 1;
      index++;
    }

    // 扫描字符串
    while (index < str.length()) {
      int d = str.charAt(index) - '0';
      if (d < 0 || d > 9) {
        break;
      }

      // 最大值处理
      if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total
              && Integer.MAX_VALUE % 10 < d) {
        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }

      total = total * 10 + d;
      index++;
    }

    return total * sign;
  }

  public static void main(String[] args) {
    String s0 = "+1345";
    MyAtoi so = new MyAtoi();
    System.out.println(so.myAtoi(s0));

    String s1 = null;
    System.out.println(so.myAtoi(s1));

    String s2 = "-234289884f89fh4";
    System.out.println(so.myAtoi(s2));

    String s3= "3237598394989349893893948593953495435";
    System.out.println(so.myAtoi(s3));

    String s4 = "!!r3r3";
    System.out.println(so.myAtoi(s4));

    String s5 = "       123678";
    System.out.println(so.myAtoi(s5));

    String s6 = "";
    System.out.println(so.myAtoi(s6));

    String s7 = " ";
    System.out.println(so.myAtoi(s7));
  }
}
