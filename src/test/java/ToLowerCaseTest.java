import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
public class ToLowerCaseTest {
  @Test
  public void testSolution1() {
    String s = "abcdefg";
    ToLowerCase so = new ToLowerCase();

    assertEquals("abcdefg", so.toLowerCase(s));
  }
}

