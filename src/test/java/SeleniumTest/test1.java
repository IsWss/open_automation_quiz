package SeleniumTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

    public static void main(String[] args) throws InterruptedException {
      
        System.setProperty("webdriver.chrome.driver", "E:\\ZDtest\\selenuimtest\\chromedriver.exe");

        //初始化一个chrome浏览器实例，实例名称叫driver
        WebDriver driver = new ChromeDriver();
        //最大化窗口
        driver.manage().window().maximize();
        //设置隐性等待时间
        //driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        // get()打开一个站点
        driver.get("https://www.baidu.com");
        //getTitle()获取当前页面title的值
        
       /*
        Collection  key = new ArrayList ();
        key.add("wss");
        key.add("Selenium");
       
        Iterator it = key.iterator();
        while(it.hasNext()){
        	// 获取元素
        	Object o = it.next();
        	*/
      //By name 定位
        //定位到百度搜索
       driver.findElement(By.id("kw")).sendKeys("wss");//搜索输入框输入
        
        driver.findElement(By.id("su")).click();//点击百度一下按钮
        System.out.println("搜过名字的结果 ：\n");
       
        Thread.sleep(2000);
        //String handle1 = driver.getWindowHandle();
        //System.out.println("百度主页面1句柄："+handle1);
        //driver.switchTo().window(handle1);
       //String list_windows = driver.window_handles ();
       
        		//driver.switch_to.window(list_windows[1]) #list_windows 存储了上一步中获取的窗口

      //By xpath 定位
         driver.findElement(By.xpath( "/html/body/div[2]/div[4]/div[2]/div/div/a[1]/span" )) .click();
         
         Thread.sleep(2000);
        
         
        // driver.manage().window().maximize();
         //将title里面的a标签取出
         List<WebElement> ll = driver.findElements(By.cssSelector("html>body>div>div>div>div>div>div>div>h3>a"));
         //循环a标签
         for(WebElement w:ll){
             //将a标签对应的文本和url取出
             System.out.println(w.getText() +  "   -->    "
                                 + w.getAttribute("href"));
             System.out.println("\n");
        }
        
         Thread.sleep(2000);
         
        //关闭并退出浏览器
      //  driver.quit();

        
        
        
         driver.get("https://www.baidu.com");
         Thread.sleep(2000);
         
     driver.findElement(By.id("kw")).sendKeys("selenuim");//搜索输入框输入
        
        driver.findElement(By.id("su")).click();//点击百度一下按钮
        System.out.println("搜过selenuim的结果 ：\n");
       
        Thread.sleep(2000);
        //String handle1 = driver.getWindowHandle();
        //System.out.println("百度主页面1句柄："+handle1);
        //driver.switchTo().window(handle1);
       //String list_windows = driver.window_handles ();
       
        		//driver.switch_to.window(list_windows[1]) #list_windows 存储了上一步中获取的窗口

      //By xpath 定位
         driver.findElement(By.xpath( "/html/body/div[2]/div[4]/div[2]/div/div/a[1]/span" )) .click();
         
         Thread.sleep(2000);
        
         
        // driver.manage().window().maximize();
         //将title里面的a标签取出
         List<WebElement> l2 = driver.findElements(By.cssSelector("html>body>div>div>div>div>div>div>div>h3>a"));
         //循环a标签
         for(WebElement w2:l2){
             //将a标签对应的文本和url取出
             System.out.println(w2.getText() +  "   -->    "
                                 + w2.getAttribute("href"));
             System.out.println("\n");
        }
        
        
         
        //关闭并退出浏览器
        driver.quit();

    
  }
    

}