package sendinfo.design2;

import junit.framework.TestCase;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;

/**
 * 司机测试类
 *
 * @className: DriverTest
 * @author: mxk
 * @date: 2019/6/18  9:48
 */
public class DriverTest extends TestCase {
   Mockery context= new  JUnit4Mockery();
   @Test
   public void testDriver(){
      final ICar car = context.mock(ICar.class);
      IDriver driver = new Driver();
      context.checking(new Expectations(){
         {oneOf(car).run();}
      });
      driver.drive(car);
   }

}
