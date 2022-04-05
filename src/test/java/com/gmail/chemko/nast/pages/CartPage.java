package com.gmail.chemko.nast.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private SelenideElement

            cartPage = $(".navbar-pc__icon--basket"),
            searchInput = $("#searchInput"),
            resultsHeader = $(".same-part-kt"),
            addToCartButton = $(".btn-main"),
            cartSection = $(".basket-page"),
            deleteButton = $(".btn__del");

    @Step("Enter article number of the item in the search bar")
    public CartPage inputArticle() {
        searchInput.setValue("21028330").pressEnter();

        return this;
    }

    @Step("Check the search result")
    public CartPage checkArticleResult() {
        resultsHeader.shouldBe(text("Браслет для часов"));

        return this;
    }

    @Step("Add the item to cart")
    public CartPage addItemToCart() {
        addToCartButton.click();
        Selenide.sleep(1000);

        return this;
    }

    @Step("Go to shopping cart")
    public CartPage goToCartPage() {
        cartPage.click();

        return this;
    }

    @Step("Check that the item has been added to cart")
    public CartPage checkAddedItem() {
        cartSection.shouldHave(text("Браслет для часов"));

        return this;
    }

    @Step("Remove the item from cart")
    public CartPage removeItemFromCart() {
        cartSection.hover();
        deleteButton.click();

        return this;
    }

    @Step("Check that the cart is empty")
    public CartPage checkThatCartIsEmpty() {
        cartSection.shouldHave(text("В корзине пока ничего нет"));

        return this;
    }
}
