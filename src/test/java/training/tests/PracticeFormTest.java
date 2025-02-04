package training.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import propertyUtility.PropertyUtility;
import training.pages.CommonPage;
import training.pages.HomePage;
import training.pages.PracticeFormPage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static training.constants.MenuKeys.FORMS_MENU;
import static training.constants.SubMenuKeys.PRACTICE_FORM_SUBMENU;

public class PracticeFormTest extends BaseTest {

    //cream o metoda de test care sa mearga de pe pagina principala pana pe practice form
//    public WebDriver driver;

    @Test
    public void navigateFromHomePageToPracticeFormPage() {
        homePage.isPageLoaded();
        homePage.clickOnDesireMenu(FORMS_MENU);
        commonPage.isPageLoaded();
        commonPage.selectSubMenu(PRACTICE_FORM_SUBMENU);
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        propertyUtility = new PropertyUtility("PracticeFormTest");
        Map <String, Object> practiceFormDataEntry = propertyUtility.getAllProperties();
        practiceFormPage.isPageLoaded();
//        List <String> subjectList = List.of("Accounting", "Maths");
//        List <String> hobbiesList = List.of("Sports", "Music");
//        practiceFormPage.fillEntireForm("Stanciu", "Ionut", "itschool@gmail.com", "Male","0731673890", subjectList, hobbiesList, "Marte nr.7", "11 January 2004", "NCR", "Delhi");
//
//        practiceFormPage.fillEntireForm(
//                propertyUtility.getProperty("firstName"),
//                propertyUtility.getProperty("lastName"),
//                propertyUtility.getProperty("email"),
//                propertyUtility.getProperty("phoneNumber"),
//                propertyUtility.getProperty("gender"),
//                propertyUtility.getPropertyAsList("subject"),
//                propertyUtility.getPropertyAsList("hobbies"),
//                propertyUtility.getProperty("address"),
//                propertyUtility.getProperty("DOB"),
//                propertyUtility.getProperty("state"),
//                propertyUtility.getProperty("city")
//        );
        practiceFormPage.fillEntireFormWithPropertiesData(practiceFormDataEntry);

//        practiceFormPage.emailInput();
//        clickOnPracticeFormSubMenu();
//        scrollDown();
//        fillFirstName();
//        fillLastName();
//        fillEmail();
//        fillPhoneNumber();
//        scrollDown();
//        fillGender("Male");
//        selectSubject();
//        selectHobbies("Sports");
//        uploadPicture();
//        scrollDown();
//        clickOnSubmitButton();
    }

    //facem o metoda care sa deschida browserul Chrome
//    public void openBrowser() {
//        driver = new ChromeDriver();
//        driver.get("https://demoqa.com/");
//        driver.manage().window().maximize();
//    }

    //facem o metoda care sa faca click pe meniul Forms
//    public void clickOnFormsMenu() {
//        scrollDown();
//        WebElement formsMenuElement = driver.findElement(By.xpath("//h5[text()='Forms']"));
//        formsMenuElement.click();
//    }

    // facem o metoda care sa faca scroll in jos pe pagina
//    public void scrollDown() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,400)");
//    }

    // facem o metoda care sa faca click pe pe submeniul practice form
//    public void clickOnPracticeFormSubMenu() {
//        WebElement practiceFormSbMenuElement = driver.findElement(By.xpath("//span[text()='Practice Form']"));
//        practiceFormSbMenuElement.click();
//    }

    // facem o metoda sa completam campul de First Name
//    public void fillFirstName() {
//        WebElement firstNameFieldElement = driver.findElement(By.id("firstName"));
//        firstNameFieldElement.sendKeys("Bogdan");
//    }
//
//    // facem o metoda care sa completeze campul Last Name
//    public void fillLastName() {
//        WebElement lastNameFieldElement = driver.findElement(By.id("lastName"));
//        lastNameFieldElement.sendKeys("Popescu");
//    }

    // facem o metoda care sa completeze E-mail
//    public void fillEmail() {
//        WebElement emailNameFieldElement = driver.findElement(By.xpath("//input[@id='userEmail']"));
//        emailNameFieldElement.sendKeys("exemplu@yahoo.com");
//    }

    // facem o metoda care sa completeze Gender
//    public void fillGender(String gender) {
//        WebElement maleGenderCheckboxElement = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
//        WebElement femaleGenderCheckboxElement = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
//        WebElement otherGenderCheckboxElement = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));
//        List<WebElement> genderListElements = new ArrayList<>();
//        genderListElements.add(maleGenderCheckboxElement);
//        genderListElements.add(femaleGenderCheckboxElement);
//        genderListElements.add(otherGenderCheckboxElement);
//        for (int i = 0; i < genderListElements.size(); i++) {
//            if (genderListElements.get(i).getText().equals(gender)) {
//                genderListElements.get(i).click();
//            }
//        }
//    }

    // facem o metoda care sa completeze Mobile
//    public void fillPhoneNumber() {
//        WebElement phoneNumberFieldElement = driver.findElement(By.xpath("//input[@id='userNumber']"));
//        phoneNumberFieldElement.sendKeys("0712345678");
//    }


    // facem o metoda care sa completeze Data nasterii
//    public void fillDateOfBirth() {
//
//    }


    // facem o metoda care sa completeze Subjects
//    public void selectSubject() {
//        WebElement selectSubjectInputField = driver.findElement(By.id("subjectsInput"));
//        selectSubjectInputField.sendKeys("Accounting");
//        selectSubjectInputField.sendKeys(Keys.ENTER);
//    }

    // facem o metoda care sa selecteze optiunile de la Hobbies
//    public void selectHobbies(String hobbies) {
//        WebElement sportsCheckboxElement = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
//        WebElement readingCheckboxElement = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
//        WebElement musicCheckboxElement = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
//        List<WebElement> hobbiesListElements = new ArrayList<>();
//        hobbiesListElements.add(sportsCheckboxElement);
//        hobbiesListElements.add(readingCheckboxElement);
//        hobbiesListElements.add(musicCheckboxElement);
//        for (int i = 0; i < hobbiesListElements.size(); i++) {
//            if (hobbiesListElements.get(i).getText().equals(hobbies)) {
//                hobbiesListElements.get(i).click();
//            }
//        }
//    }


    // facem o metoda care sa incarce un fisier in formular
//    public void uploadPicture() {
//        String pictureFilePath = "src/test/resources/Screenshot1.png";
//        File file = new File(pictureFilePath);
//        WebElement inputPictureButton = driver.findElement(By.cssSelector("#uploadpicture"));
//        inputPictureButton.sendKeys(file.getAbsolutePath());
//    }


    // vom face scroll in continuare
    // facem o metoda care sa completeze campul Current Adress
    // facem o metoda care sa selecteze Statul
    // facem o metoda care sa selecteze Orasul
    // facem o metoda care sa selecteze Submit
//    public void clickOnSubmitButton() {
//        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
//        submitButton.click();
//    }

    // de validat tabelul cu valori

}
