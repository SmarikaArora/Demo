package com.citi.SeleniumMethods;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;


public class HtmlUnit {

       static WebDriver driver=null;
       public static void main(String[] args) throws Exception {
              // TODO Auto-generated method stub
              //https://sd-b1f3-ffce.nam.nsroot.net/portal/welcome/index
              //WebDriver driver=new HtmlUnitDriver(BrowserVersion.CHROME);
              
              DesiredCapabilities caps=DesiredCapabilities.htmlUnit();
             
          //  caps.setPlatform(Platform.ANY);
            
           // System.setProperty("webdriver.ie.driver", "C:\\drivers\\IEDriverServer.exe");
            driver=new RemoteWebDriver(new URL("http://169.164.242.255:4444/wd/hub"), caps);
            //  driver=new InternetExplorerDriver();
             driver.get("https://vm-31d6-a3c2.nam.nsroot.net/");  
             final String proxyHost = System.getProperty("http.proxyHost");
             final String proxyPort = System.getProperty("http.proxyPort");
             System.out.println(proxyHost);
             System.out.println(proxyPort);
              //System.out.println(webClient.);
              
              /*
              WebClient webClient = new WebClient(BrowserVersion.CHROME);
           webClient.getOptions().setUseInsecureSSL(true); //ignore ssl certificate
           webClient.getOptions().setThrowExceptionOnScriptError(false);
           webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
           String url = "https://vm-31d6-a3c2.nam.nsroot.net/";
           HtmlPage myPage = webClient.getPage(url);
           webClient.waitForBackgroundJavaScriptStartingBefore(200);
           webClient.waitForBackgroundJavaScript(20000);
           //do stuff on page ex: myPage.getElementById("main")
           //myPage.asXml() <- tags and elements
           System.out.println(myPage.asText());*/
                           
                            //https://citidirectbe.sit5.citigroup.net/portalservices/forms/login.pser?");

       }

}

