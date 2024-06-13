package tests.home;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.HomePage;
import tests.base.BaseTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static constants.Constants.Locators.*;


public class HomeTest extends BaseTest {
    @Test (groups = "checkButtons")
    void testChangeCity(){
        String expectedResult = "Пермь";
        String actualResult;

        homePage.changeCity("Пермь");

        actualResult = driver.findElement(CHECK_CITY).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "positive")
    void testFindProduct(){
        String expectedResult = "Биг Хит";
        String actualResult;

        homePage.findProduct("Биг хит");

        actualResult = driver.findElement(CHECK_NAME_PRODUCT).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "positive")
    void testComboDescription(){
        String expectedResult = "Звездное Комбо Даши Верещагиной: Чикен Премьер, 4 наггетса, Санрайз Малина-ежевика или холодный напиток средний на выбор (кроме молочных коктейлей и сезонных напитков) и мороженое на выбор";
        String actualResult;

        actualResult = homePage.comboDescription();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "positive")
    void testGetMainMenu(){
        List<WebElement> actualElements = homePage.getMainMenu();
        List<String> actualResult = new ArrayList<>();
        List<String> expectedResult = Arrays.asList(
                "Меню", "Кафе", "Супер Бокс", "Кидз Комбо",
                "Качество", "Мой Бонус", "Мы на карте", "Новости", "О нас"
        );

        // Преобразование веб-элементов в строки
        for (WebElement element : actualElements) {
            actualResult.add(element.getText());
        }

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "checkButtons")
    void testCheckMoreButton(){
        String expectedResult = "Сырный соус + Кисло-Сладкий соус";
        String actualResult;

        homePage.checkMoreButton();

        actualResult = driver.findElement(CHECK_NAME_PRODUCT_FROM_CATEGORY).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "checkButtons")
    void testSelectMyCityMenu() throws Exception{
        String expectedResult = "...й край, Пермь, ул Петропавловская, 73А";
        String actualResult;

        homePage.selectMyCityMenu();

        actualResult = driver.findElement(CHECK_PLACE).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }
    // будет проваливаться, потому что такое модальное окно есть
    @Test (expectedExceptions = {HomePage.NoSuchModalWindow.class}, groups = "negative")
    void testSelectMyCityMenuNegative() throws Exception{
        homePage.selectMyCityMenu();
    }
}
