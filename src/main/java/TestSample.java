import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class TestSample {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "C://Auto//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Ex01
//        driver.get("https://www.google.com");
//
//        WebElement element = driver.findElement(By.name("q"));
//        element.sendKeys("Cheese");
//        element.submit();

        //Ex02 KeyboardAndMouseInput
//          driver.get("https://formy-project.herokuapp.com/keypress");
//          WebElement name = driver.findElement(By.id("name"));
//          name.click();
//          name.sendKeys("Nhi Duong");
//
//          WebElement button = driver.findElement(By.id("button"));
//          button.click();

        //Ex03 Autocomplete
//            driver.get("https://formy-project.herokuapp.com/autocomplete");
//            WebElement autocomplete = driver.findElement(By.id("autocomplete"));
//            autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
//            Thread.sleep(1000);
//
//
//            WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
//            autocompleteResult.click();


        //Ex04 Scroll to element

//              driver.get("https://formy-project.herokuapp.com/scroll");
//              WebElement name = driver.findElement(By.id("name"));
//              Actions actions = new Actions(driver);
//              actions.moveToElement(name);
//              name.sendKeys("ND");
//
//              WebElement date = driver.findElement(By.id("date"));
//              date.sendKeys("01/01/2021");


        //Ex05 SwitchToActiveWindow
//                driver.get("https://formy-project.herokuapp.com/switch-window");
//
//                WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
//                newTabButton.click();
//
//                String originalHandle = driver.getWindowHandle();
//
//                for(String handle1: driver.getWindowHandles()){
//                    driver.switchTo().window(handle1);
//                }
//
//                driver.switchTo().window(originalHandle);


        //Ex06 SwitchToAlert

//                driver.get("https://formy-project.herokuapp.com/switch-window");
//
//                WebElement alertButton = driver.findElement(By.id("alert-button"));
//                alertButton.click();
//
//                Alert alert = driver.switchTo().alert();
//                alert.accept();

        //Ex07 Executing JavaScripts commands

//                 driver.get("https://formy-project.herokuapp.com/modal");
//
//                 WebElement modalButton = driver.findElement(By.id(("modal-button")));
//                 modalButton.click();
//                 Thread.sleep(2000);
//                WebElement closeButton = driver.findElement(By.id(("close-button")));
//                JavascriptExecutor js = (JavascriptExecutor)driver;
//                js.executeScript("arguments[0].click();", closeButton);

        //EX08 DragAnDrop

//                 driver.get("https://formy-project.herokuapp.com/dragdrop");
//
//                 WebElement image = driver.findElement(By.id("image"));
//                 WebElement box = driver.findElement(By.id("box"));
//
//                 Actions actions = new Actions(driver);
//                 actions.dragAndDrop(image,box).build().perform();

        //EX09 RadioButtonsAndCheckboxes

//                driver.get("https://formy-project.herokuapp.com/radiobutton");
//
//                WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
//                radioButton1.click();
//                Thread.sleep(1000);
//                //radio-button-2 no ID, no classes, no name, not unique so select to use the value to locate
//                // button 2 by using By.cssSelector("input[value='']");
//                // value=option2
//                 WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
//                 radioButton2.click();
//                 Thread.sleep(1000);
//                 // The third radio-button also same as 2nd
//                // Using by Xpath /html/body/div/div[3]/input
//                WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
//                radioButton3.click();

//                driver.get("https://formy-project.herokuapp.com/checkbox");
//                WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
//                checkBox1.click();
//
//                WebElement checkBox2 = driver.findElement(By.id("checkbox-2"));
//                checkBox2.click();
//
//                WebElement checkBox3 = driver.findElement(By.id("checkbox-3"));
//                checkBox3.click();


        //EX10 DatePicker

//                    driver.get("https://formy-project.herokuapp.com/datepicker");
//                    WebElement dateField = driver.findElement(By.id("datepicker"));
//                    dateField.sendKeys("21/12/2021");
//                    dateField.sendKeys(Keys.RETURN);



        //EX11 DropdownMenus

//        driver.get("https://formy-project.herokuapp.com/dropdown");
//        WebElement dropdownButton = driver.findElement(By.id("dropdownMenuButton"));
//        dropdownButton.click();

//        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
//        autocompleteItem.click();

//        WebElement scrollItem = driver.findElement(By.xpath("/html/body/div/div/div/a[12]"));
//        scrollItem.click();


        //EX12 FileUpload
//        driver.get("https://formy-project.herokuapp.com/fileupload");
//        WebElement fileUpload = driver.findElement(By.id("file-upload-field"));
////        fileUpload.click();
//        fileUpload.sendKeys("3.jpg");
//
//        WebElement resetButton = driver.findElement(By.cssSelector(".btn.btn-warning"));
//        resetButton.click();

        // EX13 ImplicitWait
//
//        driver.get("https://formy-project.herokuapp.com/autocomplete");
//
//        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
//        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
//
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
//        autocompleteResult.click();
//
//        driver.quit();

        //EX14 ExplicitWait

//        driver.get("https://formy-project.herokuapp.com/autocomplete");
//
//        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
//        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
//
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//
//        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
//        autocompleteResult.click();

        // Automate a workflow

//        driver.get("https://formy-project.herokuapp.com/form");
//        WebElement firstName = driver.findElement(By.id("first-name"));
//        firstName.sendKeys("Yi");
//
//        WebElement lastName = driver.findElement(By.id("last-name"));
//        lastName.sendKeys("Yang");
//
//        WebElement jobTitle = driver.findElement(By.id("job-title"));
//        jobTitle.sendKeys("QC");
//
//        WebElement radioButton = driver.findElement(By.id("radio-button-3"));
//        radioButton.click();
//
//        WebElement checkBox = driver.findElement(By.id("checkbox-1"));
//        checkBox.click();
//
//        WebElement dropMenu =driver.findElement(By.id("select-menu"));
//        dropMenu.click();
//        WebElement option1 = driver.findElement(By.cssSelector("option[value='1']"));
//        option1.click();
//
//        WebElement datePicker = driver.findElement(By.id("datepicker"));
//        datePicker.sendKeys("12/12/2021");
//
//        WebElement submitButton = driver.findElement(By.cssSelector(".btn"));
//        submitButton.click();
    }
}
