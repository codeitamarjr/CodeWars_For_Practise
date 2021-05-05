public class GrassHopper {
  public static int summation(int number){
      int summationResult; //initialize the summation number to sum the results
      int counterAndAdd=1; //initialize de counter

      // for in a while the counter is less than the number that was given:
      // summationResult will store the result of (summationResult) 0 + 1 (counterAndAdd)
      // the result will be 1, in a while the result is less or equal to the number that was giver
      // Java will do again, (summationResult) 1 + 2(counterAndAdd)
      // the result will be 3 and so on ...
      // until the result reach the number that was given.
      for (summationResult = 0; counterAndAdd <= number ; ++counterAndAdd) {
          summationResult += counterAndAdd;
      }
      // At the end it'll return the result of the summationResult
      return summationResult;
  }
}
