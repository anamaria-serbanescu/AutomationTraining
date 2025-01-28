package project.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SelectTest {

    WebDriver driver;

    @Test
    public void selectTest(){
        openBrowser();
        clickOnSelectMenu();
        selectAppleDropDownTest();
        selectSuperheroTest();
        selectLanguageTest();
        selectCountry();
        closeBrowser();
    }

    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://letcode.in/test");
        driver.manage().window().maximize();
    }

    public void clickOnSelectMenu(){
        WebElement alertElement = driver.findElement(By.xpath("//a[@href='/dropdowns' and text()='Drop-Down']"));
        alertElement.click();
    }

    //Select the apple using visible text
    public void selectAppleDropDownTest(){
        WebElement fruitSelect = driver.findElement(By.xpath("//*[@id=\"fruits\"]"));
        fruitSelect.sendKeys("Apple");
        fruitSelect.sendKeys(Keys.ENTER);
        fruitSelect.sendKeys(Keys.ESCAPE);
    }

    //Select your superhero
    public void selectSuperheroTest(){
        WebElement superheroSelect = driver.findElement(By.id("superheros"));
        superheroSelect.sendKeys("The Avengers");
        superheroSelect.sendKeys(Keys.ENTER);
    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
    }

    //Select the last programming language and print all the options
    public void selectLanguageTest(){
        scrollDown();
        WebElement superheroSelect = driver.findElement(By.id("lang"));
        superheroSelect.sendKeys("JavaScript");
        superheroSelect.sendKeys(Keys.ENTER);
        superheroSelect.sendKeys(Keys.ESCAPE);
        List<WebElement> options = driver.findElements(By.id("lang"));
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

    }

    //Select country & print the selected value
    public void selectCountry(){
        WebElement superheroSelect = driver.findElement(By.id("country"));
        superheroSelect.sendKeys("Colombia");
        superheroSelect.sendKeys(Keys.ENTER);
        String selectedValue = superheroSelect.getAttribute("value");
        System.out.println("Selected Country: " + selectedValue);
    }

    public void closeBrowser(){
        driver.close();
    }
}
