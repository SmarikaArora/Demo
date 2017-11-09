//package pkg2;
//
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import java.io.IOException;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.security.GeneralSecurityException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//import java.util.logging.Level;
//
//import org.apache.commons.logging.LogFactory;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Platform;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//
//
//
/////import com.citi.SeleniumMethods.Libraries;
////import com.citi.SeleniumMethods.Libraries;
//import com.gargoylesoftware.htmlunit.CollectingAlertHandler;
//import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
//import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
//import com.gargoylesoftware.htmlunit.RefreshHandler;
//import com.gargoylesoftware.htmlunit.SilentCssErrorHandler;
//import com.gargoylesoftware.htmlunit.ThreadedRefreshHandler;
//import com.gargoylesoftware.htmlunit.WebClient;
//import com.gargoylesoftware.htmlunit.html.HtmlPage;
////mport com.relevantcodes.extentreports.LogStatus;
////import com.relevantcodes.extentreports.LogStatus;
//
//public class MyProgram {
//
//       //private static final Logger logger = Logger.getLogger(MyProgram.class);
//
//       
////       * @param args
////       * @throws GeneralSecurityException
////       * @throws IOException
////       * @throws MalformedURLException
////       * @throws FailingHttpStatusCodeException
//    public static Objects obj=new Objects();
//    WebDriver driver=null;
//    @Test
//      public void testmethod()
//      {
//              //logger.info("Initializing logger..................");
//              final List<String> collectedAlerts = new ArrayList<String>();
//              //final WebClient webClient = new WebClient(
//                     //     BrowserVersion.INTERNET_EXPLORER);
//              //final WebClient webClient=new WebClient();
//              WebDriver driver=null;
//              //WebDriver driver = new HtmlUnitDriver();
//              WebClient webClient = new WebClient();
//              try {
//            	  java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
//                  java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);
//
//                     webClient.getOptions().setUseInsecureSSL(true);
//                     webClient.getOptions().setActiveXNative(true);
//                     webClient.getOptions().setJavaScriptEnabled(true);
//                     RefreshHandler handler = new ThreadedRefreshHandler();
//                     webClient.setRefreshHandler(handler);
//                     webClient.waitForBackgroundJavaScript(10000);
//                     webClient.setJavaScriptTimeout(10000);
//                     webClient.setAlertHandler(new CollectingAlertHandler(
//                                  collectedAlerts));
//                     webClient
//                                  .setAjaxController(new NicelyResynchronizingAjaxController());
//                     webClient.getOptions().setThrowExceptionOnScriptError(false);
//                     webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
//                     webClient.getOptions().setRedirectEnabled(true);
//            	  
//            	  webClient.getCookieManager().setCookiesEnabled(true);
//                  webClient.getOptions().setJavaScriptEnabled(true);
//                  webClient.getOptions().setTimeout(2000);
//                  webClient.getOptions().setUseInsecureSSL(true);
//                  // overcome problems in JavaScript
//                  webClient.getOptions().setThrowExceptionOnScriptError(false);
//                  webClient.getOptions().setPrintContentOnFailingStatusCode(false);
//                  webClient.setCssErrorHandler(new SilentCssErrorHandler());
//                  LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log",
//                          "org.apache.commons.logging.impl.NoOpLog");
//                  java.util.logging.Logger
//                     .getLogger("com.gargoylesoftware.htmlunit")
//                     .setLevel(Level.OFF);
//                  java.util.logging.Logger
//                     .getLogger("org.apache.commons.httpclient")
//                     .setLevel(Level.OFF);
//                  java.util.logging.Logger
//                    .getLogger("com.gargoylesoftware.htmlunit.javascript.StrictErrorReporter")
//                    .setLevel(Level.OFF);
//                  java.util.logging.Logger
//                    .getLogger("com.gargoylesoftware.htmlunit.javascript.host.ActiveXObject")
//                    .setLevel(Level.OFF);
//                  java.util.logging.Logger
//                    .getLogger("com.gargoylesoftware.htmlunit.javascript.host.html.HTMLDocument")
//                    .setLevel(Level.OFF);
//                  java.util.logging.Logger
//                    .getLogger("com.gargoylesoftware.htmlunit.html.HtmlScript")
//                    .setLevel(Level.OFF);
//                  java.util.logging.Logger
//                    .getLogger("com.gargoylesoftware.htmlunit.javascript.host.WindowProxy")
//                    .setLevel(Level.OFF);
//                  java.util.logging.Logger
//                    .getLogger("org.apache")
//                    .setLevel(Level.OFF);
//                  
//                     DesiredCapabilities caps=DesiredCapabilities.htmlUnit();
//                     caps.setBrowserName("htmlunit");
//                     caps.setPlatform(Platform.ANY);
//                     
//                     //HtmlPage htmlPage = webClient
//                     
//                     driver=new RemoteWebDriver(new URL("http://169.164.242.255:4444/wd/hub"), caps);
//                    HtmlPage htmlPage = webClient.getPage("https://vm-31d6-a3c2.nam.nsroot.net/");
//                    //driver.get("https://vm-31d6-a3c2.nam.nsroot.net/");
//                     //HtmlPage htmlPage = webClient
//                                  //.getPage("https://vm-31d6-a3c2.nam.nsroot.net/");
//                     
//                     System.out.println(htmlPage.getTitleText());
//                     Thread.sleep(8000);
//                     driver.findElement(By.xpath("//a[contains(text(),'Continue to this website')]")).click();
//              
//              }
//              catch(Exception e)
//              {
//                     System.out.println(e);
//              }
//                     }
//              
//              public boolean ElementPresent(By strlocvalue) throws Exception {
//
//          		boolean status = false;
//
//          		try {
//          			status = driver.findElements(strlocvalue).size() != 0;
//          			if (status) {
//          				WebDriverWait wait = new WebDriverWait(driver, 20);
//          				// ExpectedConditions.visibilityOf(strlocvalue);
//          				// wait.until(ExpectedConditions.elementToBeClickable(strlocvalue));
//          				wait.until(ExpectedConditions.presenceOfElementLocated(strlocvalue));
//          				driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
//
//          				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//          				// test.log(LogStatus.PASS, strlocvalue.toString() +" ---- is
//          				// present");
//          			}
//          		} catch (Exception e) {
//          			System.out.println(e);
//
//          			
//          			 /*File src= ((TakesScreenshot)getDriver()).
//          			 * getScreenshotAs(OutputType.FILE); FileUtils. copyFile(src, new
//          			 * File(strBrowser+"\\Failed_Screenshots\\"+ count++ +".jpg"));
//          			 */
//          			// System.out.println(e.getStackTrace());
//
//          		}
//          		System.out.println(status);
//          		return status;
//              
//
//          	}
//
//
//             
//
//              public void clickelement(By strlocvalue, String stepname) throws Exception {
//
//          		if (ElementPresent(strlocvalue)) {
//          			WebElement we;
//          			we = driver.findElement(strlocvalue);
//
//          			if (we.isDisplayed()) {
//          				try {
//          					
//          					highlight(driver, we);
//
//          					we.click();
//          					//Libraries.function.test.log(LogStatus.PASS, stepname, "Element Avaliable and Clicked");
//          				} catch (Exception e) {
//          					// CloseBrowser(config.browser());lib.endtest();
//          					//Libraries.function.test.log(LogStatus.FAIL, stepname,
//          					//		"Element Not Avaliable" + test.addScreenCapture(takeScreenshot(getDriver())));
//          					// Libraries.function.test.log(LogStatus.FAIL,"","Element
//          					// Not Avaliable"+
//          					// test.addScreenCapture(takeScreenshot(getDriver())));
//          					System.out.println(e);
//          					//CloseBrowser(config.browser());
//          					//lib.endtest();
//          				}
//          			} else {
//          				/*Libraries.function.test.log(LogStatus.FAIL, stepname,
//          						"Element Not Avaliable" + test.addScreenCapture(takeScreenshot(getDriver())));
//          				CloseBrowser(config.browser());
//          				lib.endtest();*/
//          				System.out.println("hello");
//          			}
//          			//// test.log(LogStatus.PASS, strlocvalue.toString() + "Value
//          			//// verified and clicked successfully");
//
//          		} else if (!ElementPresent(strlocvalue)) {
//          			Libraries.function.test.log(LogStatus.FAIL, stepname,
//          					"Element Not Avaliable" + test.addScreenCapture(takeScreenshot(getDriver())));
//          			CloseBrowser(config.browser());
//          			lib.endtest();
//          			System.out.println("hi");
//          		}
//
//          	}  
//              public WebElement highlight(WebDriver driver, WebElement we) throws Exception {
//          		// WebElement we;
//          		// we=driver.findElement(By.xpath(strlocvalue));
//          		//
//          		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//          		js.executeScript("arguments[0].style.border='4px groove green'", we);
//          		System.out.println(we);
//          		return we;
//          	}
//              public void keyEnter() throws Exception {
//
//          		/*
//          		 * Actions action = new Actions(driver).sendKeys(Keys.ENTER);
//          		 * 
//          		 * action.build().perform();*/
//          		 
//          		Robot rb = new Robot();
//          		rb.keyPress(KeyEvent.VK_ENTER);
//          		// rb.keyPress(KeyEvent.VK_DOWN);
//          		// rb.keyRelease(KeyEvent.VK_DOWN);
//          		rb.keyRelease(KeyEvent.VK_ENTER);
//
//          		//// test.log(LogStatus.PASS, "Sucessfully Pressed on enter key");
//
//          		System.out.println("Sucessfully clicked on  Confirmation PopUp 'OK' button");
//          	}
//
//}