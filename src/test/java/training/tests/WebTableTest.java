package training.tests;

import org.testng.annotations.Test;
import propertyUtility.PropertyUtility;
import training.pages.WebTablePage;

import java.util.Map;

import static training.constants.MenuKeys.ELEMENT_MENU;
import static training.constants.SubMenuKeys.WEBTABLE_SUBMENU;

public class WebTableTest extends BaseTest{

    //declaram o variabila globala pentru dimensiunea tabelului

//    int initialTableSize = 0;

//    public WebDriver driver;

    @Test
    public void navigateFromHomePageToPracticeFormPage(){
        homePage.isPageLoaded();
        homePage.clickOnDesireMenu(ELEMENT_MENU);
        commonPage.isPageLoaded();
        commonPage.selectSubMenu(WEBTABLE_SUBMENU);
        WebTablePage webTablePage = new WebTablePage(driver);
        propertyUtility = new PropertyUtility("WebTableTest");
        Map<String, Object> webElementDataEntry = propertyUtility.getAllProperties();
        webTablePage.isPageLoaded();
        webTablePage.fillRegistrationForm(webElementDataEntry);
//        webTablePage.getInitialTableSize();
//        webTablePage.addButton();
//        webTablePage.fillRegistrationForm();
//        webTablePage.clickOnSubmitButton();
//        webTablePage.checkNewTableRecord();
//        openBrowser();
//        clickOnElementsMenu();
//        openWebTables();
//        getInitialTableSize();
//        clickOnAddButton();
//        fillRegistrationForm();
//        checkNewTableRecord();

    }
//    public void openBrowser(){
//        driver = new ChromeDriver();
//        driver.get("https://demoqa.com/");
//        driver.manage().window().setSize(new Dimension(1980, 1080));
//    }

//    public void clickOnElementsMenu (){
//        WebElement formsMenuElement = driver.findElement(By.xpath("//h5[text()='Elements']"));
//        formsMenuElement.click();
//    }
//
//    public void openWebTables(){
//        WebElement webTablesElement = driver.findElement(By.xpath("//span[text()='Web Tables']"));
//        webTablesElement.click();
//    }
//
//    // facem o metoda pentru add button
//    public void clickOnAddButton(){
//        WebElement addButtonElement = driver.findElement(By.id("addNewRecordButton"));
//        Actions action = new Actions(driver);
//        action.moveToElement(addButtonElement).click().perform();
//    }

    // facem o metoda care completeaza tot formularul deodata
//    public void fillRegistrationForm(){
//        fillFirstName("Ionut");
//        fillLastName("Tester");
//        fillEmailAddress("ionut.tester@yahoo.com");
//        fillAge("20");
//        fillSalary("5000");
//        fillDepartment("IT");
//        clickOnSubmitButton();
//    }
//
//    // facem metoda care sa completeze First Name
//    public void fillFirstName (String firstName){
//        WebElement firstNameElement = driver.findElement(By.xpath("//input[@id='firstName']"));
//        firstNameElement.sendKeys(firstName);
//    }
//
//    // facem metoda care sa completeze Last Name
//    public void fillLastName (String lastName) {
//        WebElement lastNameElement = driver.findElement(By.xpath("//input[@id='lastName']"));
//        lastNameElement.sendKeys(lastName);
//    }
//
//    //facem metoda care sa completeze email
//    public void fillEmailAddress (String emailAddress){
//        WebElement emailAddressElement = driver.findElement(By.xpath("//input[@id='userEmail']"));
//        emailAddressElement.sendKeys(emailAddress);
//    }

    //facem metoda care sa completeze age
//    public void fillAge (String age) {
//        WebElement ageElement = driver.findElement(By.xpath("//input[@id='age']"));
//        ageElement.sendKeys(age);
//    }

    //facem metoda care sa completeze salary
//    public void fillSalary (String salary) {
//        WebElement salaryElement = driver.findElement(By.xpath("//input[@id='salary']"));
//        salaryElement.sendKeys(salary);
//    }

    // facem metoda care sa completeze department
//    public void fillDepartment (String department) {
//        WebElement departmentElement = driver.findElement(By.xpath("//input[@id='department']"));
//        departmentElement.sendKeys(department);
//    }

    //facem metoda pentru submit button
//    public void clickOnSubmitButton() {
//        WebElement submitButtonElement = driver.findElement(By.xpath("//button[id@='submit']"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(submitButtonElement).click().perform();
//    }

//    //facem o metoda prin care sa luam dimensiunea initiala a tabelului
//
//    public int getInitialTableSize() {
//        List<WebElement>tableElements = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
//        initialTableSize = tableElements.size();
//         System.out.println("Tabelul are: "+initialTableSize + " randuri" );
//        return initialTableSize;
//    }
//
//    //facem o metoda prin care dovedim ca am adaugat un rand in tabel
//    public void checkNewTableRecord(){
//        List<WebElement>tableElements = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
//    int actualTableSize = tableElements.size();
//    int expectedTableSize = initialTableSize + 1;
//        Assert.assertEquals(actualTableSize, expectedTableSize, "Actual table size: " +actualTableSize + " is different than expected table size: " +expectedTableSize);
//        System.out.println("Actual table size: "+actualTableSize + " and expected table size: " + expectedTableSize);
//    }






}
