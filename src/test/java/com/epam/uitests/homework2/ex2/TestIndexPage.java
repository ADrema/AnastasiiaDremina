package com.epam.uitests.homework2.ex2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.openqa.selenium.By.id;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestIndexPage {

    @Test(groups = "Smoke")
    public void IndexPageTest() {
        WebDriver driver = initDriverWithOptions();
//        1. Open test site by URL
        driver.navigate().to("https://epam.github.io/JDI ");

//        2. Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");

//        3. Perform login
        driver.findElement(By.className("profile-photo")).click();
        driver.findElement(id("Name")).sendKeys("epam");
        driver.findElement(id("Password")).sendKeys("1234");
        driver.findElement(By.className("fa-sign-in")).click();

//        4. Assert User name in the left-top side of screen that user is
        assertEquals(driver.findElement(By.xpath(".//div[@class = 'profile-photo']/span[@ui = 'label']")).getText(), "PITER CHAILOVSKII");

//        5. Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");

//        6. Assert that there are 4 items on the header section are displayed and they have proper texts
        List<WebElement> navBarItems = driver.findElements(By.xpath(".//nav[@role = 'navigation']//ul[contains(@class, 'navbar-nav')][0]/li/a"));
        List<String> navBarItemTexts = Arrays.asList("HOME", "CONTACT FORM", "SERVICE", "METALS & COLORS");
        for (WebElement element : navBarItems) {
            System.out.println(element.getText());
            assertTrue(navBarItemTexts.contains(element.getText()));
        }

//        7. Assert that there are 4 images on the Index Page and they are displayed
        List<WebElement> imageElements = driver.findElements(By.xpath(".//div[@class = 'row clerafix benefits']//div[contains(@class, 'benefit-icon')]//a"));
        for (int i = 0; i < imageElements.size(); i++) {
            imageElements.get(i).isDisplayed();
        }

//        8. Assert that there are 4 texts on the Index Page under icons and they have proper text
        List<WebElement> elements = driver.findElements(By.xpath(".//div[@class = 'row clerafix benefits']/div"));
        List<String> textContent = Arrays.asList(
                "To include good practices\n" +
                        "and ideas from successful\n" +
                        "EPAM project",
                "To be flexible and\n" +
                        "customizable",
                "To be multiplatform",
                "Already have good base\n" +
                        "(about 20 internal and\n" +
                        "some external projects),\n" +
                        "wish to get more…"
        );

        for (WebElement element : elements) {
            assertTrue(textContent.contains(element.getText()));
        }

//        9. Assert a text of the main header
        assertEquals(driver.findElement(By.xpath(".//div[@class = 'main-content']//h3[@name = 'main-title']")).getText(), "EPAM FRAMEWORK WISHES…");

//        10. Assert a text of the sub header
        assertEquals(driver.findElement(By.xpath(".//div[@class = 'main-content']//p[@name = 'jdi-text']")).getText(),
                "LOREM IPSUM DOLOR SIT AMET," +
                        " CONSECTETUR ADIPISICING ELIT, SED DO EIUSMOD TEMPOR INCIDIDUNT UT LABORE ET DOLORE MAGNA ALIQUA." +
                        " UT ENIM AD MINIM VENIAM, QUIS NOSTRUD EXERCITATION ULLAMCO LABORIS NISI UT ALIQUIP EX EA COMMODO" +
                        " CONSEQUAT DUIS AUTE IRURE DOLOR IN REPREHENDERIT IN VOLUPTATE VELIT ESSE CILLUM DOLORE EU FUGIAT NULLA PARIATUR.");

//         11. Assert that JDI GITHUB is a link and has a proper URL
        WebElement gitLinkToJDI = driver.findElement(By.xpath(".//div[@class = 'main-content']//h3[@class = 'text-center']/a"));

        assertEquals(gitLinkToJDI.getText(), "JDI GITHUB");
        assertEquals(gitLinkToJDI.getAttribute("href"), "https://github.com/epam/JDI");

//        12.Assert that there is Left Section
        assertTrue(driver.findElement(By.xpath(".//body/div[@class ='wrapper']/div[@name = 'navigation-sidebar']")).isDisplayed());

//        13. Assert that there is Footer
        assertTrue(driver.findElement(By.xpath(".//body/footer")).isDisplayed());
        quiteDriver(driver);
    }

    @Test(groups = "Smoke")
    public void IndexPageTest2() {
        WebDriver driver = initDriverWithOptions();
//        1. Open test site by URL
        driver.navigate().to("https://epam.github.io/JDI ");

//        2. Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");

//        3. Perform login
        driver.findElement(By.className("profile-photo")).click();
        driver.findElement(id("Name")).sendKeys("epam");
        driver.findElement(id("Password")).sendKeys("1234");
        driver.findElement(By.className("fa-sign-in")).click();

//        4. Assert User name in the left-top side of screen that user is
        assertEquals(driver.findElement(By.xpath(".//div[@class = 'profile-photo']/span[@ui = 'label']")).getText(), "PITER CHAILOVSKII");

//        5. Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");

//        6. Assert that there are 4 items on the header section are displayed and they have proper texts
        List<WebElement> navBarItems = driver.findElements(By.xpath(".//nav[@role = 'navigation']//ul[contains(@class, 'navbar-nav')][0]/li/a"));
        List<String> navBarItemTexts = Arrays.asList("HOME", "CONTACT FORM", "SERVICE", "METALS & COLORS");
        for (WebElement element : navBarItems) {
            System.out.println(element.getText());
            assertTrue(navBarItemTexts.contains(element.getText()));
        }

//        7. Assert that there are 4 images on the Index Page and they are displayed
        List<WebElement> imageElements = driver.findElements(By.xpath(".//div[@class = 'row clerafix benefits']//div[contains(@class, 'benefit-icon')]//a"));
        for (int i = 0; i < imageElements.size(); i++) {
            imageElements.get(i).isDisplayed();
        }

//        8. Assert that there are 4 texts on the Index Page under icons and they have proper text
        List<WebElement> elements = driver.findElements(By.xpath(".//div[@class = 'row clerafix benefits']/div"));
        List<String> textContent = Arrays.asList(
                "To include good practices\n" +
                        "and ideas from successful\n" +
                        "EPAM project",
                "To be flexible and\n" +
                        "customizable",
                "To be multiplatform",
                "Already have good base\n" +
                        "(about 20 internal and\n" +
                        "some external projects),\n" +
                        "wish to get more…"
        );

        for (WebElement element : elements) {
            assertTrue(textContent.contains(element.getText()));
        }

//        9. Assert a text of the main header
        assertEquals(driver.findElement(By.xpath(".//div[@class = 'main-content']//h3[@name = 'main-title']")).getText(), "EPAM FRAMEWORK WISHES…");

//        10. Assert a text of the sub header
        assertEquals(driver.findElement(By.xpath(".//div[@class = 'main-content']//p[@name = 'jdi-text']")).getText(),
                "LOREM IPSUM DOLOR SIT AMET," +
                        " CONSECTETUR ADIPISICING ELIT, SED DO EIUSMOD TEMPOR INCIDIDUNT UT LABORE ET DOLORE MAGNA ALIQUA." +
                        " UT ENIM AD MINIM VENIAM, QUIS NOSTRUD EXERCITATION ULLAMCO LABORIS NISI UT ALIQUIP EX EA COMMODO" +
                        " CONSEQUAT DUIS AUTE IRURE DOLOR IN REPREHENDERIT IN VOLUPTATE VELIT ESSE CILLUM DOLORE EU FUGIAT NULLA PARIATUR.");

//         11. Assert that JDI GITHUB is a link and has a proper URL
        WebElement gitLinkToJDI = driver.findElement(By.xpath(".//div[@class = 'main-content']//h3[@class = 'text-center']/a"));

        assertEquals(gitLinkToJDI.getText(), "JDI GITHUB");
        assertEquals(gitLinkToJDI.getAttribute("href"), "https://github.com/epam/JDI");

//        12.Assert that there is Left Section
        assertTrue(driver.findElement(By.xpath(".//body/div[@class ='wrapper']/div[@name = 'navigation-sidebar']")).isDisplayed());

//        13. Assert that there is Footer
        assertTrue(driver.findElement(By.xpath(".//body/footer")).isDisplayed());
        quiteDriver(driver);
    }

    @Test(groups = "Smoke")
    public void IndexPageTest3() {
        WebDriver driver = initDriverWithOptions();
//        1. Open test site by URL
        driver.navigate().to("https://epam.github.io/JDI ");

//        2. Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");

//        3. Perform login
        driver.findElement(By.className("profile-photo")).click();
        driver.findElement(id("Name")).sendKeys("epam");
        driver.findElement(id("Password")).sendKeys("1234");
        driver.findElement(By.className("fa-sign-in")).click();

//        4. Assert User name in the left-top side of screen that user is
        assertEquals(driver.findElement(By.xpath(".//div[@class = 'profile-photo']/span[@ui = 'label']")).getText(), "PITER CHAILOVSKII");

//        5. Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");

//        6. Assert that there are 4 items on the header section are displayed and they have proper texts
        List<WebElement> navBarItems = driver.findElements(By.xpath(".//nav[@role = 'navigation']//ul[contains(@class, 'navbar-nav')][0]/li/a"));
        List<String> navBarItemTexts = Arrays.asList("HOME", "CONTACT FORM", "SERVICE", "METALS & COLORS");
        for (WebElement element : navBarItems) {
            System.out.println(element.getText());
            assertTrue(navBarItemTexts.contains(element.getText()));
        }

//        7. Assert that there are 4 images on the Index Page and they are displayed
        List<WebElement> imageElements = driver.findElements(By.xpath(".//div[@class = 'row clerafix benefits']//div[contains(@class, 'benefit-icon')]//a"));
        for (int i = 0; i < imageElements.size(); i++) {
            imageElements.get(i).isDisplayed();
        }

//        8. Assert that there are 4 texts on the Index Page under icons and they have proper text
        List<WebElement> elements = driver.findElements(By.xpath(".//div[@class = 'row clerafix benefits']/div"));
        List<String> textContent = Arrays.asList(
                "To include good practices\n" +
                        "and ideas from successful\n" +
                        "EPAM project",
                "To be flexible and\n" +
                        "customizable",
                "To be multiplatform",
                "Already have good base\n" +
                        "(about 20 internal and\n" +
                        "some external projects),\n" +
                        "wish to get more…"
        );

        for (WebElement element : elements) {
            assertTrue(textContent.contains(element.getText()));
        }

//        9. Assert a text of the main header
        assertEquals(driver.findElement(By.xpath(".//div[@class = 'main-content']//h3[@name = 'main-title']")).getText(), "EPAM FRAMEWORK WISHES…");

//        10. Assert a text of the sub header
        assertEquals(driver.findElement(By.xpath(".//div[@class = 'main-content']//p[@name = 'jdi-text']")).getText(),
                "LOREM IPSUM DOLOR SIT AMET," +
                        " CONSECTETUR ADIPISICING ELIT, SED DO EIUSMOD TEMPOR INCIDIDUNT UT LABORE ET DOLORE MAGNA ALIQUA." +
                        " UT ENIM AD MINIM VENIAM, QUIS NOSTRUD EXERCITATION ULLAMCO LABORIS NISI UT ALIQUIP EX EA COMMODO" +
                        " CONSEQUAT DUIS AUTE IRURE DOLOR IN REPREHENDERIT IN VOLUPTATE VELIT ESSE CILLUM DOLORE EU FUGIAT NULLA PARIATUR.");

//         11. Assert that JDI GITHUB is a link and has a proper URL
        WebElement gitLinkToJDI = driver.findElement(By.xpath(".//div[@class = 'main-content']//h3[@class = 'text-center']/a"));

        assertEquals(gitLinkToJDI.getText(), "JDI GITHUB");
        assertEquals(gitLinkToJDI.getAttribute("href"), "https://github.com/epam/JDI");

//        12.Assert that there is Left Section
        assertTrue(driver.findElement(By.xpath(".//body/div[@class ='wrapper']/div[@name = 'navigation-sidebar']")).isDisplayed());

//        13. Assert that there is Footer
        assertTrue(driver.findElement(By.xpath(".//body/footer")).isDisplayed());
        quiteDriver(driver);
    }

    public WebDriver initDriverWithOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        return driver;
    }

    public void quiteDriver(WebDriver driver) {
        driver.quit();
    }
}
