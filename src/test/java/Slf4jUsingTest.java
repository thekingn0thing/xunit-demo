import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.mockpolicies.Slf4jMockPolicy;
import org.powermock.core.classloader.annotations.MockPolicy;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;

/**
 * @author Arthur Zagretdinov
 * @date 4/1/2016
 */
@RunWith(PowerMockRunner.class)
@MockPolicy(Slf4jMockPolicy.class)
@PrepareForTest({LoggerUserClass.class}) // it's important to add the class which uses logger to PrepareForTest
public class Slf4jUsingTest
{
  private Logger loggerUserClassLogger;
  private LoggerUserClass loggerUserClass;

  @Before
  public void setUp()
      throws Exception
  {
    loggerUserClassLogger = LoggerFactory.getLogger(LoggerUserClass.class);
    loggerUserClass = new LoggerUserClass();
  }

  @Test
  public void canVerifyLogs()
      throws Exception
  {
    loggerUserClass.doSomething();
    verify(loggerUserClassLogger).debug(eq("We do something."));
  }
}
