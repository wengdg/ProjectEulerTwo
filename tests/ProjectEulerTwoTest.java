import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for sumOfFib method in ProjectEulerTwo.
 */
public class ProjectEulerTwoTest {

  /**
   * Test sumOfFib method with parameter values of 20 and 40.
   * @throws Exception If test fails.
   */
  @Test
  public void testSumOfEvenFib() throws Exception {
    assertEquals("Test sumOfFib with param 20", 10, ProjectEulerTwo.sumOfEvenFib(20));
    assertEquals("Test sumOfFib with param 40", 44, ProjectEulerTwo.sumOfEvenFib(40));
  }
}