package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.stream.Collectors;

public class CrudAppTestSuite {
    private static final String BASE_URL = "https://tomysnatalia.github.io/";
    private WebDriver webdriver;
    private Random generator;

    @Before
    public void initTest() {
        webdriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webdriver.get(BASE_URL);
        generator = new Random();
    }

    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action, \"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action, \"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action, \"createTask\")]/fieldset[3]/button";

        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = webdriver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = webdriver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = webdriver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }

    private void sentTestTaskToTrello (String taskName) throws InterruptedException {
        webdriver.navigate().refresh();

        while (!webdriver.findElement(By.xpath("//select[1]")).isDisplayed()) ;

        webdriver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                        .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreatedCard =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreatedCard.click();
                });
        Thread.sleep(5000);
        webdriver.switchTo().alert().accept();
    }

    private boolean checkTaskExistsInTrello (String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result;

        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("hanf.natalia@gmail.com");
        driverTrello.findElement(By.id("password")).sendKeys("xykpam-wUhge8-vahgim");
        driverTrello.findElement(By.id("login")).submit();
        WebElement el = driverTrello.findElement(By.id("login"));
        el.submit();

        //Thread.sleep(4000);

        //driverTrello.findElement(By.id("password")).sendKeys("xykpam-wUhge8-vahgim");
        //driverTrello.findElement(By.id("login-submit")).submit();

        Thread.sleep(4000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-title\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//div[@value=\"Kodilla Application\"]")).size() > 0)
                .forEach( WebElement::click);

        Thread.sleep(4000);

        final WebDriverWait webDriverWait = new WebDriverWait(driverTrello, 10);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span")));

        result = driverTrello.findElements(By.xpath("//span")).stream()
                .filter(theSpan -> theSpan.getText().contains(taskName))
                .collect(Collectors.toList())
                .size() > 0;

        driverTrello.close();

        return result;
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sentTestTaskToTrello(taskName);
       Assert.assertTrue(checkTaskExistsInTrello(taskName));
    }

    @After
    public void cleanUpAfterTest() {
        webdriver.close();
    }
}
