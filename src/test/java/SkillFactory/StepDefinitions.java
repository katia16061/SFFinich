package SkillFactory;

import java.time.Duration;

import org.apache.log4j.Logger;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.html.parser.Element;

import static SkillFactory.freePage.*;
import static SkillFactory.mainPage.*;
import static java.awt.SystemColor.text;

public class StepDefinitions {
    public static WebDriver webDriver;
    public static final SkillFactory.mainPage MAIN_PAGE;
    public static final freePage FREE_PAGE;
    public static WebDriverWait wait;

    private static final Logger logger = Logger.getLogger(StepDefinitions.class);


    static {
        webDriver = new ChromeDriver();
        new WebDriverWait(webDriver, Duration.ofSeconds(30L));
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30L));
        webDriver.manage().window().maximize();
        MAIN_PAGE = new SkillFactory.mainPage(webDriver);
        FREE_PAGE = new freePage(webDriver);
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(40));
    }

    public StepDefinitions() {
    }

    @Test
    public void Test_1() {
        MAIN_PAGE.start();
        MAIN_PAGE.mainPage();
        String mpage1 = MAIN_PAGE.mainPage();
        String mpage = MAIN_PAGE.URL();
        Assert.assertEquals(mpage, mpage1);
    }

    @Test
    public void Test_2() {
        MAIN_PAGE.start();
        FREE_PAGE.buttonLOGO();
        String mpage = MAIN_PAGE.mainPage();
        String mpage1 = MAIN_PAGE.URL();
        Assert.assertEquals(mpage, mpage1);
    }

    @Test
    public void Test_3() {
        MAIN_PAGE.start();
        FREE_PAGE.onlineCousButton();
        FREE_PAGE.AllCoursButton();
        String text = webDriver.findElement(By.xpath(ALL_COURSE_BUTTON)).getText();
        Assert.assertEquals(text, "Все онлайн-курсы");
    }

    @Test
    public void Test_4() {
        MAIN_PAGE.start();
        FREE_PAGE.onlineCousButton();
        FREE_PAGE.DATA_SCIENCE_BUTTON();
        String text = webDriver.findElement(By.xpath(DATA_SCIENCE_BUTTON)).getText();
        Assert.assertEquals(text, "Data Science");

    }

    @Test
    public void Test_5() {
        MAIN_PAGE.start();
        FREE_PAGE.onlineCousButton();
        FREE_PAGE.ANALITIK_DAN();
        String text = webDriver.findElement(By.xpath(ANALITIK_DAN)).getText();
        Assert.assertEquals(text, "Аналитика данных");
    }

    @Test
    public void Test_6() throws Exception {
        MAIN_PAGE.start();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement element = webDriver.findElement(By.xpath("//INPUT[@aria-label='name']"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        MAIN_PAGE.TEL_INPUT();
        MAIN_PAGE.SUBMIT_BUTTON();
        Boolean element1 = MAIN_PAGE.verifyElementAbsent();
        Assert.assertEquals(element1, true);
    }

    @Test
    public void Test_7() throws Exception {
        MAIN_PAGE.start();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement element = webDriver.findElement(By.xpath("//INPUT[@aria-label='name']"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        MAIN_PAGE.NAME();
        MAIN_PAGE.SUBMIT_BUTTON();
        Boolean element1 = MAIN_PAGE.verifyElementAbsent();
        Assert.assertTrue(true);
    }

    @Test
    public void Test_8() {
        FREE_PAGE.start();
        FREE_PAGE.FREE_BUTTON();
        String text = webDriver.findElement(By.xpath(FREE_BUTTON)).getText();
        Assert.assertEquals(text, "БЕСПЛАТНО");
    }

    @Test
    public void Test_9() {
        MAIN_PAGE.start();
        MAIN_PAGE.careerCenter();
        String text = webDriver.findElement(By.xpath(careerCenter)).getText();
        Assert.assertEquals(text, "ЦЕНТР КАРЬЕРЫ");
    }

    @Test
    public void Test_10() {
        MAIN_PAGE.start();
        MAIN_PAGE.CONTACTS_BUTTON();
        String text = webDriver.findElement(By.xpath(CONTACTS_BUTTON)).getText();
        Assert.assertEquals(text, "КОНТАКТЫ");
    }


    @Test
    public void Test_11() { //корпоротивное обучение
        MAIN_PAGE.start();
        MAIN_PAGE.corporateTraining();
        String text = webDriver.findElement(By.xpath(corporateTraining)).getText();
        Assert.assertEquals(text, "КОРПОРАТИВНОЕ ОБУЧЕНИЕ");
    }

    @Test
    public void Test_12() { //Медиа
        MAIN_PAGE.start();
        MAIN_PAGE.MEDIA_BUTTON();
        String text = webDriver.findElement(By.xpath(MEDIA_BUTTON)).getText();
        Assert.assertEquals(text, "МЕДИА");
    }

    @Test
    public void Test_13() {
        MAIN_PAGE.start();
        FREE_PAGE.onlineCousButton();
        MAIN_PAGE.HIGHER_EDUCATION();
        String text = webDriver.findElement(By.xpath(HIGHER_EDUCATION)).getText();
        Assert.assertEquals(text, "Высшее образование");
    }

    @Test
    public void Test_14() {
        MAIN_PAGE.start();
        FREE_PAGE.onlineCousButton();
        MAIN_PAGE.WEB_DEVELOPMENT();
        String text = webDriver.findElement(By.xpath(WEB_DEVELOPMENT)).getText();
        Assert.assertEquals(text, "Веб-разработка");
    }

    @Test
    public void Test_15() {
        MAIN_PAGE.start();
        FREE_PAGE.onlineCousButton();
        MAIN_PAGE.PYTHON();
        String text = webDriver.findElement(By.xpath(PYTHON)).getText();
        Assert.assertEquals(text, "Python");
    }

    @Test
    public void Test_16() {
        MAIN_PAGE.start();
        FREE_PAGE.onlineCousButton();
        MAIN_PAGE.PROGRAMMING_BUTTON();
        String text = webDriver.findElement(By.xpath(PROGRAMMING_BUTTON)).getText();
        Assert.assertEquals(text, "Программирование");
    }


    @Test
    public void Test_17() {
        MAIN_PAGE.start();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement element = webDriver.findElement(By.xpath("//INPUT[@aria-label='name']"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        MAIN_PAGE.SUBMIT_BUTTON();
        webDriver.findElement(By.xpath("//*[@id=\"form625407935\"]/div[2]/div[1]/div/input")).click();
        String text = webDriver.findElement(By.xpath("//*[@id=\"form625407935\"]/div[2]/div[1]/div/div")).getText();
        Assert.assertTrue(true);
    }

    @Test
    public void Test_18() {
        MAIN_PAGE.start();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"rec625407935\"]/div/div/div[3]/div"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        MAIN_PAGE.SUBMIT_BUTTON();
        webDriver.findElement(By.xpath("//*[@id=\"form625407935\"]/div[2]/div[1]/div/input")).sendKeys("123АБВ");
        webDriver.findElement(By.cssSelector("#form625407935 > div.t-form__inputsbox > div.tn-form__submit > button")).click();
        String text = webDriver.findElement(By.xpath("//*[@id=\"form625407935\"]/div[2]/div[1]/div/div")).getText();
        Assert.assertTrue(true);

    }

    @Test
    public void Test_19() {
        MAIN_PAGE.start();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"rec625407935\"]/div/div/div[3]/div"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        MAIN_PAGE.SUBMIT_BUTTON();
        webDriver.findElement(By.cssSelector("#form625407935 > div.t-form__inputsbox > div.t-input-group.t-input-group_em.js-error-control-box > div > input")).sendKeys("k!!!@mail.r1");
        webDriver.findElement(By.cssSelector("#form625407935 > div.t-form__inputsbox > div.tn-form__submit > button")).click();
        String text = webDriver.findElement(By.xpath("//*[@id=\"form625407935\"]/div[2]/div[2]/div/div")).getText();
        Assert.assertTrue(true);
    }

    @Test
    public void Test_20() {
        MAIN_PAGE.start();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"rec625407935\"]/div/div/div[3]/div"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        MAIN_PAGE.SUBMIT_BUTTON();
        webDriver.findElement(By.xpath("//*[@id=\"form625407935\"]/div[2]/div[3]/div/div[1]/input[2]")).sendKeys("1234567890");
        webDriver.findElement(By.cssSelector("#form625407935 > div.t-form__inputsbox > div.tn-form__submit > button")).click();
        Boolean text = webDriver.findElement(By.xpath("//*[@id=\"form625407935\"]/div[2]/div[2]/div/div")).isDisplayed();
        Assert.assertTrue(true);
    }

    @Test
    public void Test_21() {
        MAIN_PAGE.start();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement element = webDriver.findElement(By.xpath("//span[contains(text(),'Все онлайн-курсы')]"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        MAIN_PAGE.GET_CONS_BUTTON();
        webDriver.findElement(By.xpath("//*[@id=\"form625407935\"]/div[2]/div[3]/div/div[1]/input[2]")).sendKeys("9873548103");
        webDriver.findElement(By.cssSelector("#form625407935 > div.t-form__inputsbox > div.tn-form__submit > button")).click();
        String text = webDriver.findElement(By.xpath("(//div[@class='t-input t-input-phonemask__wrap'])[2]")).getCssValue("border");
        Assert.assertEquals(text, "0px none rgb(0, 0, 0)");
    }

    @Test
    public void Test_22() {
        MAIN_PAGE.start();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement element = webDriver.findElement(By.xpath("//span[contains(text(),'Все онлайн-курсы')]"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        MAIN_PAGE.SUBMIT_BUTTON();
        webDriver.findElement(By.xpath("//*[@id=\"form625407935\"]/div[2]/div[1]/div/input")).sendKeys("Екатерина");
        webDriver.findElement(By.cssSelector("#form625407935 > div.t-form__inputsbox > div.tn-form__submit > button")).click();
        String text = webDriver.findElement(By.xpath("//*[@id=\"tilda-popup-for-error\"]/div[1]/p")).getCssValue("border");
        Assert.assertNotEquals(text, "1px solid rgb(255, 0, 0)");
    }


    @Test
    public void Test_23() {
        MAIN_PAGE.start();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement element = webDriver.findElement(By.xpath("//span[contains(text(),'Все онлайн-курсы')]"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        MAIN_PAGE.SUBMIT_BUTTON();
        webDriver.findElement(By.cssSelector("#form625407935 > div.t-form__inputsbox > div.t-input-group.t-input-group_em.js-error-control-box > div > input")).sendKeys("katia@mail.ru");
        webDriver.findElement(By.cssSelector("#form625407935 > div.t-form__inputsbox > div.tn-form__submit > button")).click();
        String text = webDriver.findElement(By.xpath("//*[@id=\"tilda-popup-for-error\"]/div[1]/p")).getCssValue("border");
        Assert.assertNotEquals(text, "1px solid rgb(255, 0, 0)");
    }
}












