import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Arthur Zagretdinov
 * @date 4/1/2016
 */
public class LoggerUserClass
{

  private static final Logger LOGGER = LoggerFactory.getLogger(LoggerUserClass.class);

  public void doSomething()
  {
    LOGGER.debug("We do something.");
  }
}
