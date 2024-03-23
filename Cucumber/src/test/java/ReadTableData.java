import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class ReadTableData {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        WebElement table = driver.findElement(By.xpath("//tbody"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        boolean found = false;
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                System.out.print(cell.getText() + "\t");
                if (cell.getText().equals("Italy")) {
                    found = true;
                    break;
                }
            }
            System.out.println();
            if (found) {
                break;
            }
        }

       

        driver.quit();
    }
}
