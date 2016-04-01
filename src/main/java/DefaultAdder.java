/**
 * @author Arthur Zagretdinov
 * @date 4/1/2016
 */
public class DefaultAdder implements Adder
{

  public int sum(final int absoluteA, final int absoluteB)
  {

    int result = 0;
    for (int index = 0; index < absoluteB; index++)
    {
      result += absoluteA;
    }
    return result;
  }
}
