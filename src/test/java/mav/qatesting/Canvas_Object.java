package mav.qatesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Canvas_Object {
	public int x_cord = 0;
	public int y_cord = 0;
	public int size = 0;
	
	public Canvas_Object(){
		
		x_cord = 20;
		y_cord = 200;
		size = 40;
	}
	public Canvas_Object(int x_cord, int y_cord, int size) {
		this.x_cord = x_cord;
		this.y_cord = y_cord;
		this.size = size;
	}
	
	public static void set_canvas(WebDriver driver, Canvas_Object obj) {
		//Setting Values
		driver.findElement(By.id("xnum")).clear();
		driver.findElement(By.id("xnum")).sendKeys(Integer.toString(obj.x_cord));
		driver.findElement(By.id("ynum")).clear();
		driver.findElement(By.id("ynum")).sendKeys(Integer.toString(obj.y_cord));
		driver.findElement(By.id("shapesize")).clear();
		driver.findElement(By.id("shapesize")).sendKeys(Integer.toString(obj.size));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void set_color(WebDriver driver) {
	}
	
}
