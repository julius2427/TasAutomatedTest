package mav.qatesting;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

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
	private int initial_counter;

	@Before
		public void openapp() throws Exception {
			//Open the page
			driver.navigate().to("http://localhost:4567/canvas_basic.html");
			Canvas_Object.set_action_counter(driver);
			initial_counter = Canvas_Object.get_action_counter();
		}
	
	@Test
		public void test1() throws Exception
	    {
			//Set X Y and Size Information
			//Initial Count of Events
			
			
			ArrayList<Canvas_Object> obj = new ArrayList<Canvas_Object>(); 
			obj.add(new Canvas_Object());
			obj.add(new Canvas_Object(200, 100, 40, "Grey"));
			
			Canvas_Object.set_canvas(driver, obj);
			int addedevents = Canvas_Object.getAdded_events();
			

			int actual_counter = Canvas_Object.get_action_counter();
			
			
			//Verifying the actual events are as expected
			assertEquals(initial_counter + addedevents , actual_counter);
			
			
			//Clears the options 
			//Canvas_Object.clearoption(driver);
	    }

//	@After
//		public void closeapp() {
//			driver.quit();
//		}
//	
}
