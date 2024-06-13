package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import java.util.List;

import static constants.Constants.Locators.*;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickElement(By locator){
        WebElement button = driver.findElement(locator);
        waitElementIsVisible(button).click();

        return button;
    }
    public HomePage changeCity(String cityName){
        WebElement btnChangeCity = clickElement(BUTTON_CHANGE_CITY);
        driver.findElement(INPUT_CITY).sendKeys(cityName);
        WebElement chooseCity = clickElement(CHOOSE_CITY);

        return this;
    }
    public HomePage findProduct(String nameProduct){
        WebElement searchButton = clickElement(SEARCH_BUTTON);
        driver.findElement(INPUT_NAME_PRODUCT).sendKeys(nameProduct);
        WebElement chooseProduct = clickElement(CHOOSE_PRODUCT);

        return this;
    }
    public String comboDescription(){
        WebElement closeCookieWindow = clickElement(CLOSE_WINDOW);
        WebElement btnComboDinner = clickElement(BUTTON_COMBO_DINNER);
        WebElement chooseCombo = clickElement(CHOOSE_COMBO);
        String comboDescription = driver.findElement(COMBO_DESCRIPTION).getText();

        return comboDescription;
    }
    public List<WebElement> getMainMenu(){
        List<WebElement> mainMenu = driver.findElements(FIND_ITEMS_FOR_LIST);

        return mainMenu;
    }
    public HomePage checkMoreButton(){
        WebElement moreBtn = clickElement(MORE_BUTTON);
        WebElement chooseCategory = clickElement(CHOOSE_CATEGORY);
        WebElement chooseProduct = clickElement(CHOOSE_PRODUCT_FROM_CATEGORY);

        return this;
    }
    public HomePage selectMyCityMenu() throws Exception{
        try {
            WebElement closeCookieWindow = driver.findElement(CLOSE_WINDOW);
            if (closeCookieWindow.isDisplayed()){
                closeCookieWindow.click();
            }
        } catch (NoSuchElementException e){
            throw new NoSuchModalWindow("Такого модального окна нет");
        }

        WebElement selectMenu = clickElement(SELECT_MY_CITY_MENU);
        WebElement confirmBtn = clickElement(CONFIRM_CHOICE);

        return this;
    }
    public static class NoSuchModalWindow extends Exception {
        public NoSuchModalWindow(String message){
            super(message);
        }
    }
}
