package com.DragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuery_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String url="https://jqueryui.com/droppable/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Thread.sleep(20000); // explicit wait
		
		// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		// id="draggable" - property of Drag me to my target
		
		WebElement drag_Element=driver.findElement(By.id("draggable"));
		
		// id="droppable" - property of Drop her element
		
		WebElement drop_Element=driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag_Element, drop_Element).perform();
		
		driver.switchTo().defaultContent();
		


	}

}
