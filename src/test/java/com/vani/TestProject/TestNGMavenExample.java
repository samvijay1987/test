
package com.vani.TestProject;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGMavenExample
{
  @Test
  public void LaunchURL() throws InterruptedException 
  {
	 System.setProperty("webdriver.chrome.driver","E:\\Java and Sel\\TestProjectMaven\\chromedriver.exe") ;
	 WebDriver driver=new ChromeDriver();
	 
	 
	 driver.get("https://www.facebook.com");
	 Thread.sleep(5000);
	 driver.close();
	 
	 HSSFWorkbook wb=new HSSFWorkbook();
	 Sheet sh=wb.getSheetAt(0);
	  
  }
}
