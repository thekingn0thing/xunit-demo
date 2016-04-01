import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Arthur Zagretdinov
 * @date 4/1/2016
 */
public class MultiplierTest
{

  private Multiplier multiplier;

  @Before
  public void setUp()
      throws Exception
  {
    multiplier = new Multiplier();

  }

  @Test
  public void canMultipleTwoZero()
      throws Exception
  {
    assertMultiplyResult(0, 0, 0);
  }

  private void assertMultiplyResult(final int result, final int a, final int b)
  {
    assertThat(multiplier.multiply(a, b),is(result));
  }

  @Test
  public void canMultipleOneOnZero()
      throws Exception
  {
    assertMultiplyResult(0, 1, 0);
  }

  @Test
  public void canMultipleOneOnOne()
      throws Exception
  {
    assertMultiplyResult(1, 1, 1);
  }

  @Test
  public void canMultipleOneOnTwo()
      throws Exception
  {
    assertMultiplyResult(2, 1, 2);
  }

  @Test
  public void canMultipleTwoOnTwo()
      throws Exception
  {
    assertMultiplyResult(4, 2, 2);
  }

  @Test
  public void canMultipleTwoOn3()
      throws Exception
  {
    assertMultiplyResult(6, 2, 3);
  }

  @Test
  public void canMultipleTwoOn30()
      throws Exception
  {
    assertMultiplyResult(60, 2, 30);
  }

  @Test
  public void canMultipleMinusTwoOn3()
      throws Exception
  {
    assertMultiplyResult(-6, -2, 3);
  }

  @Test
  public void canMultipleMinusTwoOnMinus3()
      throws Exception
  {
    assertMultiplyResult(6, -2, -3);
  }

  @Test
  public void canMultipleMinusTwoOnZero()
      throws Exception
  {
    assertMultiplyResult(0, -2, 0);
  }
}
