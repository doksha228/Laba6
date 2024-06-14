package constants;

import org.openqa.selenium.By;

public class Constants {
    public static class Locators{
        public static final By BUTTON_CHANGE_CITY = By.cssSelector("#__layout > div > header > div > div.page-header__desktop-wrap > div > div > div > div.page-header__city.page-header__menu-item");
        public static final By INPUT_CITY = By.cssSelector("#__layout > div > div.common-modals > div > div > div > div.base-modal__body > div.common-input.modal-cities__input > input");
        public static final By CHOOSE_CITY = By.cssSelector("#__layout > div > div.common-modals > div > div > div > div.base-modal__body > div.modal-cities__outer-wrap > div > div > div.modal-cities__wrap-items > div");
        public static final By CHECK_CITY = By.cssSelector("#__layout > div > header > div > div.page-header__desktop-wrap > div > div > div > div.page-header__city.page-header__menu-item > span");
        public static final By SEARCH_BUTTON = By.cssSelector("#__layout > div > header > div > div.page-header__desktop-wrap > div > div > div > button");
        public static final By INPUT_NAME_PRODUCT = By.cssSelector("#__layout > div > header > div.header-search > div.header-search__bar > div > input");
        public static final By CHOOSE_PRODUCT = By.cssSelector("#__layout > div > header > div.header-search > div.header-search__details > ul > li:nth-child(3)");
        public static final By CHECK_NAME_PRODUCT = By.cssSelector("#__layout > div > div.common-modals > div > div > div > div > div > div.modal-product__content-helper.modal-product__content-helper_active.modal-product__content-helper_show > div > div.product-settings__top > div > div.product-settings__info > div");
        public static final By BUTTON_COMBO_DINNER = By.cssSelector("#category_433");
        public static final By CHOOSE_COMBO = By.cssSelector("#product-11737");
        public static final By COMBO_DESCRIPTION = By.cssSelector("#__layout > div > div.common-modals > div > div > div > div > div > div.modal-product__content-helper.modal-product__content-helper_active.modal-product__content-helper_show > div > div.product-settings__offer-settings > div > div:nth-child(3)");
        public static final By CLOSE_WINDOW = By.cssSelector("#__layout > div > div.cookie-popup > div > svg");
        public static final By FIND_ITEMS_FOR_LIST = By.cssSelector("#__layout > div > header > div > div.page-header__desktop-wrap > div > div > nav > a");
        public static final By MORE_BUTTON = By.cssSelector("#menuOuter > div > div.menu-categories__more");
        public static final By CHOOSE_CATEGORY = By.cssSelector("#category_425");
        public static final By CHOOSE_PRODUCT_FROM_CATEGORY = By.cssSelector("#product-9516");
        public static final By CHECK_NAME_PRODUCT_FROM_CATEGORY = By.cssSelector("#__layout > div > div.common-modals > div > div > div > div > div > div.modal-product__content-helper.modal-product__content-helper_active.modal-product__content-helper_show > div > div.product-settings__top > div > div.product-settings__info > div");
        public static final By SELECT_MY_CITY_MENU = By.cssSelector("#delivery > div > div > div > button");
        public static final By CONFIRM_CHOICE = By.cssSelector("#restaurant-888 > div > div.restaurants-list-item__controls > button");
        public static final By CHECK_PLACE = By.cssSelector("#bannerRestaurantContent > span:nth-child(2)");
        public static final String SELECT_MENU = "https://vkusnoitochka.ru/menu";
        public static final String SELECT_KAFE = "https://vkusnoitochka.ru/cafe";
        public static final String SELECT_SUPER_BOX = "https://vkusnoitochka.ru/superbox";
        public static final String SELECT_KIDS_COMBO = "https://vkusnoitochka.ru/kidscombo";
        public static final String SELECT_QUALITY = "https://vkusnoitochka.ru/quality";
        public static final String SELECT_MY_BONUS = "https://vkusnoitochka.ru/bonus";
        public static final String SELECT_MAP = "https://vkusnoitochka.ru/restaurants/map";
        public static final String SELECT_NEWS = "https://vkusnoitochka.ru/articles/news";
        public static final String SELECT_ABOUT_US = "https://vkusnoitochka.ru/company";
        public static final By FOOTER_NAVIGATION = By.cssSelector("#__layout > div > footer > div.footer__nav > div > ul");
        public static final By ELEMENTS_FROM_MENU_CATEGORIES = By.cssSelector("#menuOuter > div > div.menu-categories__wrap");
        public static final By FOOTER_INFO = By.cssSelector("#__layout > div > footer > div.footer__info");
    }
    public static class TimeOutVariable{
        public static final int IMPLICIT_WAIT = 15;
        public static final int EXPLICIT_WAIT = 20;
    }
}