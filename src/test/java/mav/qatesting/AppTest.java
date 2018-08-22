package mav.qatesting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import commonfunctions.AbstractSteps;

/**
 * Unit test for simple App.
 */
public class AppTest extends AbstractSteps
{
	WebDriver driver = getDriver();

	@Before
		public void openapp() throws Exception {
			//Open the page
			driver.navigate().to("http://localhost:4567/canvas_basic.html");
		}
	
	@Test
		public void test1() throws Exception
	    {
			//Set X Y and Size Information
			Canvas_Object obj1 = new Canvas_Object(200,100,40);
			Canvas_Object.set_canvas(driver, obj1);
	    }

	@After
		public void closeapp() {
			driver.quit();
		}
	
}
