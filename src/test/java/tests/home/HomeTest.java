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
    @Test (groups = "search")
    void testFindProduct(){
        String expectedResult = "Биг Хит";
        String actualResult;

        homePage.findProduct("Биг хит");

        actualResult = driver.findElement(CHECK_NAME_PRODUCT).getText();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "parse")
    void testComboDescription() throws Exception{
        String expectedResult = "Звездное Комбо Даши Верещагиной: Чикен Премьер, 4 наггетса, Санрайз Малина-ежевика или холодный напиток средний на выбор (кроме молочных коктейлей и сезонных напитков) и мороженое на выбор";
        String actualResult;

        actualResult = homePage.comboDescription();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "parse")
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
    @Test (groups = "checkButtons")
    void testSelectMenu(){
        String expectedResult = "https://vkusnoitochka.ru/menu";
        String actualResult;

        homePage.selectMenu();

        actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "checkButtons")
    void testSelectKafe(){
        String expectedResult = "https://vkusnoitochka.ru/cafe";
        String actualResult;

        homePage.selectKafe();

        actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "checkButtons")
    void testSelectSuperBox(){
        String expectedResult = "https://vkusnoitochka.ru/superbox";
        String actualResult;

        homePage.selectSuperBox();

        actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "checkButtons")
    void testSelectKidsCombo(){
        String expectedResult = "https://vkusnoitochka.ru/kidscombo";
        String actualResult;

        homePage.selectKidsCombo();

        actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "checkButtons")
    void testSelectQuality(){
        String expectedResult = "https://vkusnoitochka.ru/quality";
        String actualResult;

        homePage.selectQuality();

        actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "checkButtons")
    void testSelectBonus(){
        String expectedResult = "https://vkusnoitochka.ru/bonus";
        String actualResult;

        homePage.selectBonus();

        actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "checkButtons")
    void testSelectMap(){
        String expectedResult = "https://vkusnoitochka.ru/restaurants/map";
        String actualResult;

        homePage.selectMap();

        actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "checkButtons")
    void testSelectNews(){
        String expectedResult = "https://vkusnoitochka.ru/articles/news";
        String actualResult;

        homePage.selectNews();

        actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "checkButtons")
    void testSelectAboutUs(){
        String expectedResult = "https://vkusnoitochka.ru/company";
        String actualResult;

        homePage.selectAboutUs();

        actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "parse")
    void testParseFooterNavigation(){
        List<WebElement> actualElements = homePage.parseFooterNavigation();
        List<String> actualResult = new ArrayList<>();
        List<String> expectedResult = Arrays.asList(
                "Благотворительность\nРабота у нас\nМы на карте\nО компании\nКачество\nНовости\nУчебный центр\nПрограмма лояльности\nОбратная связь"
        );

        // Преобразование веб-элементов в строки
        for (WebElement element : actualElements) {
            actualResult.add(element.getText());
        }

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "parse")
    void testParseMenuCategories(){
        List<WebElement> actualElements = homePage.parseMenuCategories();
        List<String> actualResult = new ArrayList<>();
        List<String> expectedResult = Arrays.asList(
                "Новинки\nСеты и пары\nПопулярное\nНапитки\nКомбо Обед\nБургеры и роллы\nКартофель, стартеры и салаты\nКафе"

        );

//        Завтрак
//        Кидз Комбо
//        Десерты
//        Соусы и другое
//        Сеты менее 600 ккал

        // Преобразование веб-элементов в строки
        for (WebElement element : actualElements) {
            actualResult.add(element.getText());
        }

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "parse")
    void testParseFooterInfo(){
        List<WebElement> actualElements = homePage.parseFooterInfo();
        List<String> actualResult = new ArrayList<>();
        List<String> expectedResult = Arrays.asList(
                "Контакт-центр 8 800 600-07-70\nПравовая информация"
        );

        // Преобразование веб-элементов в строки
        for (WebElement element : actualElements) {
            actualResult.add(element.getText());
        }

        Assert.assertEquals(actualResult, expectedResult);
    }
    // будут проваливаться, потому что такое модальное окно есть
    @Test (expectedExceptions = {HomePage.NoSuchModalWindow.class}, groups = "negative")
    void testSelectMyCityMenuNegative() throws Exception{
        homePage.selectMyCityMenu();
    }
    @Test (expectedExceptions = {HomePage.NoSuchModalWindow.class}, groups = "negative")
    void testComboDescriptionNegative() throws Exception{
        homePage.comboDescription();
    }
}
