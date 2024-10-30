package gridtests;


import org.openqa.selenium.WebDriver;

public class YouTubeTest extends BaseTest implements Runnable {
    @Override
    public void run() {
        try {
            WebDriver driver = setupDriver();
            driver.get("https://www.youtube.com");
            System.out.println("YouTube Title: " + driver.getTitle());
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
