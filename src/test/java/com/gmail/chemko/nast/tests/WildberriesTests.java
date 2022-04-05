package com.gmail.chemko.nast.tests;

import com.gmail.chemko.nast.pages.CartPage;
import com.gmail.chemko.nast.pages.LoginPage;
import com.gmail.chemko.nast.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class WildberriesTests extends TestBase {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    CartPage cartPage = new CartPage();

    @Test
    @DisplayName("Checking the logo display")
    void logoTest() {
        mainPage.
                openMainPage().
                checkLogo();
    }

    @Test
    @DisplayName("Checking geolocation changes")
    void geolocationChangeTest() {
        mainPage.
                openMainPage().
                hoverOverGeolocation().
                clickOnCountry().
                checkChangeGeolocation();
    }

    static Stream<Arguments> commonSearchDataProvider() {
        return Stream.of(
                Arguments.of("Зонт", "По запросу «зонт» найдено"),
                Arguments.of("Женский шарф", "По запросу «женский шарф» найдено"));
    }

    @MethodSource("commonSearchDataProvider")
    @ParameterizedTest(name = "Searching for items {0} and checking the display of text {0} in the search results")
    @DisplayName("Checking the work of the items search")
    void searchAndCheckProductTest(String testData, String expectedResult) {
        mainPage.
                openMainPage().
                inputSearchItem(testData).
                checkSearchResults(expectedResult);
    }

    @Test
    @DisplayName("Checking the appearance of the captcha after entering a phone number")
    void captchaAppearsTest() {
        mainPage.
                openMainPage();
        loginPage.
                goToLoginPage().
                inputPhoneNumber().
                clickOnRequestCodeButton().
                checkThatCaptchaAppeared();
    }

    @Test
    @DisplayName("Checking the addition and removal of an item from cart")
    void addAndDeleteProductFromCartTest() {
        mainPage.
                openMainPage();
        cartPage.
                inputArticle().
                checkArticleResult().
                addItemToCart().
                goToCartPage().
                checkAddedItem().
                removeItemFromCart().
                checkThatCartIsEmpty();
    }
}

