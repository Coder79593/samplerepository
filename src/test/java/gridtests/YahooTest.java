package gridtests;


import org.openqa.selenium.WebDriver;

public class YahooTest extends BaseTest implements Runnable {
    @Override
    public void run() {
        try {
            WebDriver driver = setupDriver();
            driver.get("https://www.yahoo.com");
            System.out.println("Yahoo Title: " + driver.getTitle());
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

