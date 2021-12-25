package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helpers.TestConfigurations;
import pages.HomePage;

public class TestNestedDropdown extends TestConfigurations {
    HomePage homePage;
    NestedDropdownAssertion nestedDropdownAssertion;

    @BeforeMethod
    public void setUp (){
        startDriver();
        homePage = new HomePage(driver);
        nestedDropdownAssertion = new NestedDropdownAssertion();
    }

    @Test
    public void testNestedDropdownOpensAndCloseSuccessfully() throws InterruptedException {
        nestedDropdownAssertion.assertNoContentsOfNestedDropdownsAreDisplayed();

        homePage.clickMenuDropDown();
        nestedDropdownAssertion.assertOnlyMenuContentsAreDisplayed();

        homePage.clickCategoriesNestedDropDown();
        nestedDropdownAssertion.assertOnlyMenuAndCategoryContentsAreDisplayed();

        homePage.clickProgrammingNestedDropDown();
        nestedDropdownAssertion.assertAllNestedDropdownsContentsAreDisplayed();

        homePage.clickProgrammingNestedDropDown();
        nestedDropdownAssertion.assertOnlyMenuAndCategoryContentsAreDisplayed();

        homePage.clickCategoriesNestedDropDown();
        nestedDropdownAssertion.assertOnlyMenuContentsAreDisplayed();

        homePage.clickMenuDropDown();
        nestedDropdownAssertion.assertNoContentsOfNestedDropdownsAreDisplayed();
    }

    @Test
    public void testClosingTheMainDropdownWillNotCloseTheNestedDropdowns() throws InterruptedException {
        homePage.clickMenuDropDown();
        homePage.clickCategoriesNestedDropDown();
        homePage.clickMenuDropDown();
        homePage.clickMenuDropDown();
        nestedDropdownAssertion.assertOnlyMenuAndCategoryContentsAreDisplayed();
    }
}
