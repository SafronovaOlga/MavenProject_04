import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HW_12 {

    @Test
    public void testMenuTopList() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgasafronova/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Top Lists";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement searchTopList = driver.findElement(
                By.xpath("//div[@id='navigation']/ul[@id= 'menu']//a[@href='/toplist.html']"));


        String actualResult = searchTopList.getText();

        Assert.assertEquals(actualResult, expectedResult.toUpperCase());

        driver.quit();
    }

    @Test
    public void tetsMenuGuestbook() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olgasafronova/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";

        String expectedResult = "Guestbook";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement searchGuestbook = driver.findElement(
                By.xpath("//div[@id='navigation']/ul[@id='menu']//a[@href='/guestbookv2.html']"));

        String actualResult = searchGuestbook.getText();

        Assert.assertEquals(actualResult, expectedResult.toUpperCase());

        driver.quit();
    }
}
