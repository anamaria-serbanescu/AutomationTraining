package project.tests;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class FormTest {

    WebDriver driver;

    @Test
    public void formTest(){
        openBrowser();
        clickOnFormMenu();
        setFirstName();
        setLastName();
        setEmail();
        setCountryCode();
        setPhoneNumber();
        setAddress1();
        setAddress2();
        setState();
        setPostalCode();
//        setCountry();
        setDateOfBirth();
        setGender("Male");
        clickTermsAndConditions();
        clickOnSubmitButton();
    }

    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://letcode.in/test");
        driver.manage().window().setSize(new Dimension(1080, 700));
    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
    }

    public void clickOnFormMenu(){
        scrollDown();
        WebElement formElement = driver.findElement(By.xpath("//a[@href='/forms' and text()='All in One']"));
        formElement.click();
        driver.manage().window().maximize();
    }

    //facem o metoda care sa completeaza first name
    public void setFirstName() {
        WebElement firstNameFieldElement = driver.findElement(By.xpath("//input[@id='firstname']"));
        firstNameFieldElement.sendKeys("John");
    }

    //facem o metoda care sa completeze last name
        public void setLastName() {
        WebElement lastNameFieldElement = driver.findElement(By.xpath("//input[@id='lasttname']"));
        lastNameFieldElement.sendKeys("Wick");
    }

    public void clearInput(){
        WebElement emailInput = driver.findElement(By.xpath("//input[@id='email']"));
        emailInput.clear();
    }

    //facem o metoda care sa completeze email
    public void setEmail() {
        clearInput();
        WebElement emailFieldElement = driver.findElement(By.xpath("//input[@id='email']"));
        emailFieldElement.sendKeys("john_wick@gmail.com");
    }

    //facem o metoda care sa selecteze country code
    public void setCountryCode() {
        WebElement countryCodeElement = driver.findElement(By.xpath("//div[@class='select'][1]/select"));
        countryCodeElement.sendKeys("UK (+44)");
        countryCodeElement.sendKeys(Keys.ENTER);
    }

    //facem o metoda care sa completeze phone number
    public void setPhoneNumber() {
        WebElement phoneNumberElement = driver.findElement(By.xpath("//input[@id='Phno']"));
        phoneNumberElement.sendKeys("7309445844");
    }

    //facem o metoda care sa completeze adress-1
    public void setAddress1() {
        WebElement addressLine1Element = driver.findElement(By.xpath("//input[@id='Addl1']"));
        addressLine1Element.sendKeys("Hotel Continental");
    }
    //facem o metoda care sa completeze adress-2
    public void setAddress2() {
        WebElement addressLine2Element = driver.findElement(By.xpath("//input[@id='Addl2']"));
        addressLine2Element.sendKeys("District 1");
    }

    //facem o metoda care sa completeze state
    public void setState() {
        WebElement stateElement = driver.findElement(By.xpath("//input[@id='state']"));
        stateElement.sendKeys("Bucharest");
    }

    //facem o metoda care sa completeze postal code
    public void setPostalCode() {
        scrollDown();
        WebElement postalCodeElement = driver.findElement(By.xpath("//input[@id='postalcode']"));
        postalCodeElement.sendKeys("014432");
    }

    //facem o metoda care sa selecteze country
    public void setCountry() {
        WebElement countryFieldElement = driver.findElement(By.xpath("//div[@class='select'][2]/select)"));
        countryFieldElement.sendKeys("Romania");
        countryFieldElement.sendKeys(Keys.ENTER);
    }

    //facem o metoda care sa completeze date of birth
    public void setDateOfBirth(){
        WebElement dateOfBirthElement = driver.findElement(By.xpath("//input[@id='Date']"));
        dateOfBirthElement.sendKeys("03/23/1985");
        dateOfBirthElement.sendKeys(Keys.ENTER);
    }

    //facem o metoda care sa selecteze gender
    public void setGender(String gender) {
        WebElement maleGenderCheckboxElement = driver.findElement(By.xpath("//input[@id='male']"));
        WebElement femaleGenderCheckboxElement = driver.findElement(By.xpath("//input[@id='female']"));
        WebElement transGenderCheckboxElement = driver.findElement(By.xpath("//input[@id='trans']"));
        List<WebElement> genderListElements = new ArrayList<>();
        genderListElements.add(maleGenderCheckboxElement);
        genderListElements.add(femaleGenderCheckboxElement);
        genderListElements.add(transGenderCheckboxElement);
        for (int i = 0; i < genderListElements.size(); i++) {
            if (genderListElements.get(i).getText().equals(gender)) {
                genderListElements.get(i).click();
            }
        }
    }

    //facem o metoda care sa bifeze terms and conditions
    public void clickTermsAndConditions(){
        WebElement termsElement = driver.findElement(By.xpath("//input[@type='checkbox']"));
        termsElement.click();
    }

    //facem o metoda care selecteaza submit button
    public void clickOnSubmitButton() {
        scrollDown();
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();
    }

}
