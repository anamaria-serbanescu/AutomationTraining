package training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class WebTablePage extends BasePage{

    //web-elemente specifice paginii
    @FindBy(xpath = "//h1")
    private WebElement pageTitleElement;

    @FindBy(id = "addNewRecordButton")
    private WebElement addPeopleInForm;

    @FindBy(id = "firstName")
    private WebElement firstNameElement;

    @FindBy(id = "lastName")
    private WebElement lastNameElement;

    @FindBy(id = "userEmail")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='age']")
    private WebElement ageInput;

    @FindBy(xpath = "//input[@id='salary']")
    private WebElement salaryInput;

    @FindBy(xpath = "//input[@id='department']")
    private WebElement departmentInput;

    @FindBy(xpath = "//button[id@='submit']")
    private WebElement submitButton;

    int initialTableSize = 0;

    @FindBy(xpath = "//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']")
    private List<WebElement>tableElements;

    public WebTablePage(WebDriver driver) {
        super(driver);
    }

    public void addButton(){
        elementsHelper.clickElement(addPeopleInForm);
    }

    public void fillRegistrationForm(Map<String, Object> webElementData){
        List <String> firstNameValue = (List<String>)webElementData.get("firstName");
        List <String> lastNameValue = (List<String>)webElementData.get("LastName");
        List <String> emailValue = (List<String>)webElementData.get("email");
        List <String> ageValue = (List<String>)webElementData.get("age");
        List <String> salaryValue = (List<String>)webElementData.get("salary");
        List <String> departmentValue = (List<String>)webElementData.get("department");
        for (int index = 0; index<firstNameValue.size(); index ++){
            firstNameInput(firstNameValue.get(index));
            lastNameInput(lastNameValue.get(index));
            emailInput(emailValue.get(index));
            ageInput(ageValue.get(index));
            salaryInput(salaryValue.get(index));
            departmentInput(departmentValue.get(index));
            submitInput();
        }


    }

    public void firstNameInput(String name){
        elementsHelper.fillElement(firstNameElement, name);
    }

    public void lastNameInput(String numeFamilie){
        elementsHelper.fillElement(lastNameElement, numeFamilie);
    }

    public void emailInput(String email){
        elementsHelper.fillElement(emailInput,email);
    }

    public void ageInput(String age) {
        elementsHelper.fillElement(ageInput, age);
    }

    public void salaryInput(String salary) {
        elementsHelper.fillElement(salaryInput, salary);
    }

    public void departmentInput(String department) {
        elementsHelper.fillElement(departmentInput, department);
    }

    public void submitInput() {
        elementsHelper.clickElement(submitButton);
    }


    public int getInitialTableSize() {
        initialTableSize = tableElements.size();
        System.out.println("Tabelul are: "+initialTableSize + " randuri" );
        return initialTableSize;
    }

    //facem o metoda prin care dovedim ca am adaugat un rand in tabel
    public void checkNewTableRecord(){
        int actualTableSize = tableElements.size();
        int expectedTableSize = initialTableSize + 1;
        Assert.assertEquals(actualTableSize, expectedTableSize, "Actual table size: " +actualTableSize + " is different than expected table size: " +expectedTableSize);
        System.out.println("Actual table size: "+actualTableSize + " and expected table size: " + expectedTableSize);
    }

    @Override
    public void isPageLoaded() {
        Assert.assertEquals(pageTitleElement.getText(), "Web Tables", "Title is invalid and actual value is: " +pageTitleElement.getText());

    }
}
