/**
 * E16: ProjectEulerTwo
 * Created by Weng on 2/2/2015.
 */
public class ProjectEulerTwo {
  public static void main(String[] args){

    int fibOne = 1;
    int fibTwo = 2;
    int fibThree = fibOne + fibTwo;
    int sum = fibTwo;

    while(fibThree < 4000000) {
      //System.out.printf("%d ", fibThree);

      if(fibThree%2 == 0){
        sum += fibThree;
      }

      fibOne = fibTwo;
      fibTwo = fibThree;
      fibThree = fibOne + fibTwo;

    }

    System.out.print("\n" + sum);
  }
}
