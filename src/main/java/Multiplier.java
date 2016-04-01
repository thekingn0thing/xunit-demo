/**
 * @author Arthur Zagretdinov
 * @date 4/1/2016
 */
public class Multiplier
{

  private Adder adder;

  public Multiplier()
  {
    adder = new DefaultAdder();
  }

  public void setAdder(final Adder adder)
  {
    this.adder = adder;
  }

  public int multiply(final int a, final int b)
  {
    boolean signA = a < 0;
    boolean signB = b < 0;
    boolean resultSign = signA == signB;

    int absoluteA = a < 0 ? -a : a;
    int absoluteB = b < 0 ? -b : b;

    int result = adder.sum(absoluteA, absoluteB);
    return resultSign ? result : -result;
  }

}
