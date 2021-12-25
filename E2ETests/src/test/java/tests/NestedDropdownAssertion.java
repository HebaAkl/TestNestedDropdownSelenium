package tests;

import org.testng.Assert;

import helpers.TestConfigurations;
import pages.HomePage;

public class NestedDropdownAssertion extends TestConfigurations {

    HomePage homePage;

    public void assertMenuDropdownContentsAreNotDisplayed(){
        homePage = new HomePage(driver);
        homePage.waitForElementVisibility(homePage.menuDropdown);
        Assert.assertFalse(homePage.home.isDisplayed());
        Assert.assertFalse(homePage.about.isDisplayed());
        Assert.assertFalse(homePage.categories.isDisplayed());
    }

    public void assertCategoriesDropdownContentsAreNotDisplayed(){
        homePage = new HomePage(driver);
        homePage.waitForElementVisibility(homePage.menuDropdown);
        Assert.assertFalse(homePage.programming.isDisplayed());
        Assert.assertFalse(homePage.softwareTesting.isDisplayed());
        Assert.assertFalse(homePage.frontEnd.isDisplayed());
    }

    public void assertProgrammingDropdownContentsAreNotDisplayed(){
        homePage = new HomePage(driver);
        homePage.waitForElementVisibility(homePage.menuDropdown);
        Assert.assertFalse(homePage.PHP.isDisplayed());
        Assert.assertFalse(homePage.ruby.isDisplayed());
        Assert.assertFalse(homePage.java.isDisplayed());
    }

    public void assertMenuDropdownContentsAreDisplayed(){
        homePage = new HomePage(driver);
        homePage.waitForElementVisibility(homePage.home);
        Assert.assertTrue(homePage.home.isDisplayed());
        Assert.assertTrue(homePage.about.isDisplayed());
        Assert.assertTrue(homePage.categories.isDisplayed());
    }

    public void assertCategoriesDropdownContentsAreDisplayed(){
        homePage = new HomePage(driver);
        homePage.waitForElementVisibility(homePage.programming);
        Assert.assertTrue(homePage.programming.isDisplayed());
        Assert.assertTrue(homePage.softwareTesting.isDisplayed());
        Assert.assertTrue(homePage.frontEnd.isDisplayed());
    }

    public void assertProgrammingDropdownContentsAreDisplayed(){
        homePage = new HomePage(driver);
        homePage.waitForElementVisibility(homePage.PHP);
        Assert.assertTrue(homePage.PHP.isDisplayed());
        Assert.assertTrue(homePage.ruby.isDisplayed());
        Assert.assertTrue(homePage.java.isDisplayed());
    }

    public void assertOnlyMenuContentsAreDisplayed()
    {
        assertMenuDropdownContentsAreDisplayed();
        assertCategoriesDropdownContentsAreNotDisplayed();
        assertProgrammingDropdownContentsAreNotDisplayed();

    }

    public void assertOnlyMenuAndCategoryContentsAreDisplayed()
    {
        assertMenuDropdownContentsAreDisplayed();
        assertCategoriesDropdownContentsAreDisplayed();
        assertProgrammingDropdownContentsAreNotDisplayed();

    }

    public void assertAllNestedDropdownsContentsAreDisplayed() {
        assertMenuDropdownContentsAreDisplayed();
        assertCategoriesDropdownContentsAreDisplayed();
        assertProgrammingDropdownContentsAreDisplayed();

    }

    public void assertNoContentsOfNestedDropdownsAreDisplayed (){
        assertMenuDropdownContentsAreNotDisplayed();
        assertCategoriesDropdownContentsAreNotDisplayed();
        assertProgrammingDropdownContentsAreNotDisplayed();

    }
}
