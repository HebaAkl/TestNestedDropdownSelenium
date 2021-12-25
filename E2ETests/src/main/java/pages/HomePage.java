package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageConfigurations{

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public WebElement menuDropdown = driver.findElement(By.xpath("//*[@class='dropdown']/button"));
    public WebElement home = driver.findElement(By.xpath("//a[text()=\"Home\"]"));
    public WebElement about = driver.findElement(By.xpath("//a[text()=\"About\"]"));

    public WebElement categories = driver.findElement(By.xpath("//a[text()=\"Categories\"]"));
    public WebElement softwareTesting = driver.findElement(By.xpath("//a[text()=\"Software Testing\"]"));
    public WebElement frontEnd = driver.findElement(By.xpath("//a[text()=\"Front-end\"]"));

    public WebElement programming = driver.findElement(By.xpath("//a[text()=\"Programming\"]"));
    public WebElement PHP = driver.findElement(By.xpath("//a[text()=\"PHP\"]"));
    public WebElement ruby = driver.findElement(By.xpath("//a[text()=\"Ruby\"]"));
    public WebElement java = driver.findElement(By.xpath("//a[text()=\"JAVA\"]"));



    public void clickMenuDropDown () throws InterruptedException {
        clickOn(menuDropdown);
    }

    public void clickCategoriesNestedDropDown (){
        clickElement(categories);
    }

    public void clickProgrammingNestedDropDown (){
        clickElement(programming);
    }
}
