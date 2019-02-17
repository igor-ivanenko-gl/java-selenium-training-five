import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Task1test {
    WebDriver drv;
    @Before
    public void browserTest_setup(){


        System.out.println("Test Started");

    }

    @After
    public void browserTest_cleanup(){
        drv.quit();
        System.out.println("Test Finished");

    }

    @Test
    public void chromeTest(){
        WebDriverManager.chromedriver().setup();
        drv =  new ChromeDriver();
        drv.get("https://www.seleniumhq.org");
    }

    @Test
    public void firefoxTest(){
        WebDriverManager.firefoxdriver().setup();
        drv =  new FirefoxDriver();
        drv.get("https://www.seleniumhq.org");
    }

    @Test
    public void operaTest(){
        WebDriverManager.operadriver().setup();
        drv =  new OperaDriver();
        drv.get("https://www.seleniumhq.org");
    }

    @Test
    public void iexplorerTest(){
        WebDriverManager.iedriver().setup();
        drv =  new InternetExplorerDriver();
        drv.get("https://www.seleniumhq.org");
    }

    @Test
    public void edgeTest(){
        WebDriverManager.edgedriver().setup();
        drv =  new EdgeDriver();
        drv.get("https://www.seleniumhq.org");
    }



}
