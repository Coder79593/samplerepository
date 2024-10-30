package gridtests;


import org.openqa.selenium.WebDriver;

public class BingTest extends BaseTest implements Runnable {
    @Override
    public void run() {
        try {
            WebDriver driver = setupDriver();
            driver.get("https://www.bing.com");
            System.out.println("Bing Title: " + driver.getTitle());
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

