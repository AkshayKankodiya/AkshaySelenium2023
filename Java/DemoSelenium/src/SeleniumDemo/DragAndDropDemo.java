package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDropDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.navigate().to("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.switchTo().frame(0);

        WebElement dnd = driver.findElement(By.xpath("//div[@id='draggable']"));
        System.out.println(dnd.getText());


        WebElement drp = driver.findElement(By.xpath(" //div[@id='droppable']"));
        System.out.println(drp.getText());
        Actions action = new Actions(driver);
        action.moveToElement(dnd).dragAndDrop(dnd,drp).build().perform();
        action.moveToElement(dnd).dragAndDropBy(dnd,-150,150).build().perform();


        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/droppable");
        driver.findElement(By.xpath("//a[@id='droppableExample-tab-preventPropogation']")).click();
        WebElement smallBox =driver.findElement(By.xpath("//div[@id='dragBox']"));
        System.out.println(smallBox.getText());

        WebElement outerBox1 =driver.findElement(By.xpath("(//div[@class='drop-box-outer mt-4 ui-droppable'])[1]"));
        WebElement innerBox1 =driver.findElement(By.xpath("//div[@id='notGreedyInnerDropBox']"));

        Actions actionbox =new Actions(driver);
        actionbox.moveToElement(smallBox).dragAndDrop(smallBox,outerBox1).build().perform();
        Actions actionbox5 =new Actions(driver);
        actionbox5.moveToElement(smallBox).dragAndDropBy(smallBox,-100,50).build().perform();




    }
}
