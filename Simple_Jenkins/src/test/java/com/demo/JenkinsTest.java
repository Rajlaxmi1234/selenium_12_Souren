package com.demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsTest {
@Test
public void jenkins() {
	Reporter.log("Jenkins class added", true);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("8https://demowebshop.tricentis.com/");
	Reporter.log("DWS launched successfully",true);
}
}
