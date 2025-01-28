package training.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PracticeFormPage extends BasePage {

    //WebElemente specifice pentru pagina:
    @FindBy(xpath = "//h1")
    private WebElement pageTitleElement;

    @FindBy(id = "firstName")
    private WebElement firstNameFieldElement;

    @FindBy(id = "lastName")
    private WebElement lastNameFieldElement;

    @FindBy(id = "userEmail")
    private WebElement emailInput;

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    private WebElement maleGenderElement;

    @FindBy(xpath = "//label[@for='gender-radio-2']")
    private WebElement femaleGenderElement;

    @FindBy(xpath = "//label[@for='gender-radio-3']")
    private WebElement otherGenderElement;

    @FindBy(id = "userNumber")
    private WebElement phoneNumberInput;

    @FindBy(id = "subjectsInput")
    private WebElement subjectsInput;

    @FindBy(xpath = "//label[text()=\"Sports\"]")
    private WebElement hobbiesInput;

    @FindBy(xpath = "//label[text()=\"Reading\"]")
    private WebElement hobbiesInput2;

    @FindBy(xpath = "//label[text()=\"Music\"]")
    private WebElement musicHobbyElement;

    @FindBy(id = "currentAddress")
    private WebElement currentAddress;

    @FindBy(id = "uploadPicture")
    private WebElement uploadPicture;

    @FindBy(id = "dateOfBirthInput")
    private WebElement dateOfBirth;
    @FindBy(id = "dateOfBirthInput")
    private WebElement defaultElement;

    @FindBy(xpath = "//*[@id=\"react-select-3-input\"]")
    private WebElement stateInput;
    @FindBy(xpath = "//*[@id=\"react-select-4-input\"]")
    private WebElement cityInput;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(id = "closeLargeModal")
    private WebElement closeForm;


    public void fillEntireForm(String firstName, String lastName, String emailValue, String gender, String phoneNumber, List<String> subjects, List<String> hobbies,
                               String address, String DOB, String state, String city) {
        fillFirstAndLastName(firstName, lastName);
        emailInput(emailValue);
        elementsHelper.scrollDown();
        genderLabel(gender);
        phoneNumberInput(phoneNumber);
        selectSubject(subjects);
        elementsHelper.scrollDown();
        hobbiesInput(hobbies);
        currentAddress(address);
        uploadPicture();
        dateOfBirth(DOB);
        elementsHelper.scrollDown();
        stateAndCity(state, city);
        pause();
        elementsHelper.scrollDown();
        submitButton();
        pause2();
    }

    public void fillEntireFormWithPropertiesData(Map<String, Object> practiceFormData) {
        fillFirstAndLastName((String) practiceFormData.get("firstname"), (String) practiceFormData.get("lastName"));
        emailInput((String) practiceFormData.get("email"));
        elementsHelper.scrollDown();
        genderLabel((String) practiceFormData.get("gender"));
        phoneNumberInput((String) practiceFormData.get("phoneNumber"));
        selectSubject((List<String>) practiceFormData.get("subject"));
        elementsHelper.scrollDown();
        hobbiesInput((List<String>) practiceFormData.get("hobbies"));
        currentAddress((String) practiceFormData.get("address"));
        uploadPicture();
        dateOfBirth((String) practiceFormData.get("DOB"));
        elementsHelper.scrollDown();
        stateAndCity((String) practiceFormData.get("state"), (String) practiceFormData.get("city"));
        elementsHelper.scrollDown();
        submitButton();
    }

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    //Metode specifice paginii:
    public void emailInput(String emailValue) {
        elementsHelper.fillElement(emailInput, "itschool@gmail.com");
    }

    public void fillFirstAndLastName(String firstName, String lastName) {
        elementsHelper.fillElement(firstNameFieldElement, firstName);
        elementsHelper.fillElement(lastNameFieldElement, lastName);
    }

    public void genderLabel(String gender) {
        List<WebElement> genderListElement = new ArrayList<>();
        genderListElement.add(maleGenderElement);
        genderListElement.add(femaleGenderElement);
        genderListElement.add(otherGenderElement);
        elementsHelper.selectElementByTextFromList(gender, genderListElement);
    }

    public void phoneNumberInput(String phoneNumber) {
        elementsHelper.fillElement(phoneNumberInput, phoneNumber);
    }

    public void selectSubject(List<String> subjectList) {
        for (String subject : subjectList) {
            elementsHelper.selectElementUsingKeys(subjectsInput, subject, Keys.ENTER);
        }
//        elementsHelper.selectElementUsingKeys(subjectsInput, "Accounting", Keys.ENTER );
//        elementsHelper.selectElementUsingKeys(subjectsInput, "Maths", Keys.ENTER);
    }

    public void hobbiesInput(List<String> hobbiesList) {
        List<WebElement> hobbiesElementslist = List.of(hobbiesInput, hobbiesInput2, musicHobbyElement);
        for (String hobby : hobbiesList) {
            elementsHelper.selectElementByTextFromList(hobby, hobbiesElementslist);
        }
    }
//        elementsHelper.clickElement(hobbiesInput);
//        elementsHelper.clickElement(hobbiesInput2);

    public void currentAddress(String address) {
        elementsHelper.fillElement(currentAddress, address);
    }

    public void uploadPicture() {
        elementsHelper.uploadFileToElement(uploadPicture);
    }

    public void dateOfBirth(String dateOfBirthValue) {
        elementsHelper.selectElementUsingKeys(dateOfBirth, dateOfBirthValue, Keys.HOME);
        for (int index = 1; index <= 11; index++) {
            elementsHelper.keyboardEnters(defaultElement, Keys.DELETE);
        }
        elementsHelper.keyboardEnters(defaultElement, Keys.ENTER);
    }

//    public void scrollDown() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,160)");
//    }

    public void stateAndCity(String stateValue, String cityValue) {
        elementsHelper.selectElementUsingKeys(stateInput, stateValue, Keys.ENTER);
        elementsHelper.selectElementUsingKeys(cityInput, cityValue, Keys.ENTER);
    }

    public void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void submitButton() {
        elementsHelper.clickElement(submitButton);
    }

    public void pause2() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void closeTheForm() {
        elementsHelper.clickElement(closeForm);
    }

    @Override
    public void isPageLoaded() {
        elementsHelper.waitForElement(pageTitleElement);
        Assert.assertEquals(pageTitleElement.getText(), "Practice Form", "Title is invalid and actual value is: " + pageTitleElement.getText());
    }
}
