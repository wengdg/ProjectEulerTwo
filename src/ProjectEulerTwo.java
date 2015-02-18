/**
 * E16: ProjectEulerTwo
 * Created by Weng on 2/2/2015.
 */
public class ProjectEulerTwo {

  /**
   * Compute sum of even fibonacci number below a max fib value.
   * @param args Invalid.
   */
  public static void main(String[] args) {

    System.out.print(sumOfEvenFib(4000000));
  }

  /**
   * Computes sum of even fibonacci numbers below a maximum.
   * @param maxNum Max fibonacci number.
   * @return Sum of even fibonacci numbers.
   */
  public static int sumOfEvenFib(int maxNum) {
    int fibOne = 1;
    int fibTwo = 2;
    int fibThree = fibOne + fibTwo;
    int sum = fibTwo;

    while (fibThree < maxNum) {
      //System.out.printf("%d ", fibThree);

      if (fibThree % 2 == 0) {
        sum += fibThree;
      }

      fibOne = fibTwo;
      fibTwo = fibThree;
      fibThree = fibOne + fibTwo;

    }

    return sum;
  }
}
