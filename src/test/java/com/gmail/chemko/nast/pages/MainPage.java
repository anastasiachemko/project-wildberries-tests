package com.gmail.chemko.nast.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

        private SelenideElement

                logo = $(".nav-element__logo"),
                searchInput = $("#searchInput"),
                searchResults = $(".searching-results__title"),
                geolocationMenu = $(".simple-menu__link--country"),
                addressSimpleMenu = $(".simple-menu__link--address");


        @Step("Open the main page")
        public MainPage openMainPage() {
            open("https://by.wildberries.ru");

            return this;
        }

        @Step("Check that the logo is displayed")
        public MainPage  checkLogo() {
            logo.shouldBe(visible);

            return this;
        }

        @Step("Enter the item 'Зонт' in the search bar and press ENTER")
        public MainPage  inputSearchItem(String testData) {
            searchInput.setValue(testData).pressEnter();

            return this;
        }

        @Step("Check the search results")
        public MainPage  checkSearchResults(String expectedResult) {
            searchResults.shouldHave(Condition.text(expectedResult));

            return this;
        }

        @Step("Hover the cursor over the geolocation menu")
        public MainPage  hoverOverGeolocation() {
            geolocationMenu.hover();

            return this;
        }

        @Step("Choose 'Россия' in the radiobutton")
        public MainPage  clickOnCountry() {
            $(byText("Россия")).click();

            return this;
        }

        @Step("Check that the geolocation has changed")
        public MainPage  checkChangeGeolocation() {
            addressSimpleMenu.shouldHave(Condition.text("Москва"));

            return this;
        }
    }

