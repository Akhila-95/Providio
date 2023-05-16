package com.providio.testcases;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.providio.utilities.ReadConfig;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	
	ReadConfig readconfig = new ReadConfig();
	
	//logindetails
	public String baseURL=readconfig.getApplicationURL();
	public String name=readconfig.getUsername();
	public String password=readconfig.getPassword();
	

	//shippingdetails
	public String fname =readconfig.getFName() ;
	public String lname = readconfig.getLName();
	public String address = readconfig.getAddress();
	public String cityname = readconfig.getCity();
	public String zipcode = readconfig.getzipcode();
	public String phonenumber =readconfig.getphone();
	
	//editpageDetails
	public String epfname =readconfig.getepFName() ;
	public String eplname = readconfig.getepLName();
	public String epconfirmEmail = readconfig.getepconformMail();
	public String eppassword = readconfig.getepconformpassword();
	
	//ProfilePaswordChange
	public String epcurrentPassword = readconfig.getepcurrentPassword();
	public String epnewPassword = readconfig.getepnewPassword();
	public String epnewPasswordConfirm = readconfig.getepnewPasswordConfirm();
	

	// to write a review
		public String  headline=readconfig.getWriteAReview();
		public String comment =readconfig.getComments();
		public String nickName =readconfig.getNickName();
		public String location=readconfig.getLocation();
		
		
		// In Find a store
		public String zipcodeStore =readconfig.getZipcodeInStore();
		
		//search bar
		public String searchBar =readconfig.searchSomething();
		
		//footer mail
		public String footerMail =readconfig.getFooterMail();
		
		//guest login details
		public String  guestmail =readconfig.getGuestMail();
		public String guestPassword = readconfig.getGuestPassword();
		public String reEnterMail=readconfig.getReEnterMail();
	
	
	public static WebDriver driver;
	public static   Logger logger ;
	protected static boolean isLoggedIn=false;
	
	//Reporting
	static ExtentReports report;
	static ExtentTest test;
	
	
	@BeforeSuite
    public void setUpforReport() {
        report = new ExtentReports("C:\\Users\\user\\eclipse-workspace\\provideo\\proVideo\\ProVidioAkhi\\Reports\\ProvidioTestReport.html", true);
        WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
    }
    
	
 
	@BeforeClass
	public void setUp(){
		test = report.startTest(getClass().getSimpleName());
		
	    logger = Logger.getLogger("Providio");
	    PropertyConfigurator.configure("log4j.properties");
	    
		
	}



	
	@AfterMethod
	public void afterMethod(ITestResult result) {
	    if (result.getStatus() == ITestResult.FAILURE) {
	    	test.log(LogStatus.FAIL, result.getThrowable());
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        String fileName = result.getMethod().getMethodName() + "_" + ".png";
	        try {
	            FileUtils.copyFile(source, new File("./screenshots/" + fileName));
	            System.out.println("Screenshot taken for test case: " + result.getMethod().getMethodName());
	        } catch (IOException e) {
	            System.out.println("Exception while taking screenshot: " + e.getMessage());
	        }
	    }
	}
	
	
	   @AfterSuite
	    public void tearDown() {
	        report.flush();
	    }
		
	

	@AfterClass
	public void afterClass() {
	    report.endTest(test);
	   //driver.quit();
	  
	}
	

	
}