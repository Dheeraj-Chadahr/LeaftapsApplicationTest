package LeafTapsApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationTest {

    @Test()
    public void test () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/SAI/Desktop/Chromedriver/Chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Launch URL
        driver.get("http://leaftaps.com/opentaps/control/login");

        //Enter UserName
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

        //Enter Password
        driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

        //Click on login button
        driver.findElement(By.className("decorativeSubmit")).click();
        Thread.sleep(2000);

        //Click on CRM/SFA Link
        driver.findElement(By.xpath("//a")).click();
        Thread.sleep(2000);

        //Click on Leads button
        driver.findElement(By.xpath("//a[@id='ext-gen604']")).click();
        Thread.sleep(2000);

        //Click on Create Lead Button
        driver.findElement(By.cssSelector("a#ext-gen874")).click();

        //Fill companyName
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("DemoTest");

        //Fill first name
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("DemoTest");

        //Filln Last name
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("DemoTest");

        //click on source
        driver.findElement(By.xpath("//select[@name='dataSourceId']")).click();
        //select source
        driver.findElement(By.xpath("//*[@id=\"createLeadForm_dataSourceId\"]/option[5]")).click();

        //select marketing Campaign
        driver.findElement(By.xpath("//select[@name='marketingCampaignId']")).click();
        //select source
        driver.findElement(By.xpath("//select[@name='marketingCampaignId']//select[@name='marketingCampaignId']")).click();

        //Fill first Name Local
        driver.findElement(By.xpath("//*[@id='createLeadForm_firstNameLocal']")).sendKeys("Testfirst");

        //Fill
        driver.findElement(By.xpath("//*[@id='createLeadForm_lastNameLocal']")).sendKeys("TestLast");

        //Fill solution
        driver.findElement(By.xpath("//*[@id='createLeadForm_personalTitle']")).sendKeys("abc");

        //Fill date of birth
        driver.findElement(By.xpath("//*[@name='birthDate']")).sendKeys("01/01/1990");

        //Fill title
        driver.findElement(By.xpath("//*[@name='generalProfTitle']")).sendKeys("Title");

        //Fill Department Name
        driver.findElement(By.xpath("//*[@name='departmentName']")).sendKeys("Department");

        //Fill Annual Revenue
        driver.findElement(By.xpath("//*[@name='annualRevenue']")).sendKeys("2500000");

        //Select Currency mode
        driver.findElement(By.xpath("//*[@name='currencyUomId']")).click();
        //Select currency
        driver.findElement(By.xpath("//*[@id=\"createLeadForm_currencyUomId\"]/option[2]")).click();

        //Select industry
        driver.findElement(By.xpath("//*[@name='industryEnumId']")).click();
        //Select industry
        driver.findElement(By.xpath("//*[@id=\"createLeadForm_industryEnumId\"]/option[2]")).click();

        //fill number of employement
        driver.findElement(By.xpath("//*[@name='numberEmployees']")).sendKeys("100");

        //click on ownership
        driver.findElement(By.xpath("//*[@name='ownershipEnumId']")).click();
        // select ownership
        driver.findElement(By.xpath("//*[@id=\"createLeadForm_ownershipEnumId\"]/option[2]")).click();

        //fill Sic Code
        driver.findElement(By.xpath("//*[@name='sicCode']")).sendKeys("xyz");

        //fill ticker Symbol
        driver.findElement(By.xpath("//*[@name='tickerSymbol']")).sendKeys("ticker Symbol");

        //fill description
        driver.findElement(By.xpath("//*[@name='description']")).sendKeys("test description");

        //fill important Note
        driver.findElement(By.xpath("//*[@name='importantNote']")).sendKeys("importantNote");


        // Contact information

        //fill CountryCode
        driver.findElement(By.xpath("//*[@id='createLeadForm_primaryPhoneCountryCode']")).sendKeys("+91");

        //fill Area pin code
        driver.findElement(By.xpath("//*[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("359009");

        //fill phone no.
        driver.findElement(By.xpath("//*[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9999999999");

        //fill Extension
        driver.findElement(By.xpath("//*[@id='createLeadForm_primaryPhoneExtension']")).sendKeys("Test");

        //fill Person to Ask For
        driver.findElement(By.xpath("//*[@id='createLeadForm_primaryPhoneAskForName']")).sendKeys("Demo");

        //fill Email
        driver.findElement(By.xpath("//*[@id='createLeadForm_primaryEmail']")).sendKeys("Test@demo.com");

        //fill web url
        driver.findElement(By.xpath("//*[@id='createLeadForm_primaryWebUrl']")).sendKeys("http://leaftaps.com/");


        //Primary Adress


        //fill To name
        driver.findElement(By.xpath("//*[@id='createLeadForm_generalToName']")).sendKeys("To Test");

        //fill Attention Name
        driver.findElement(By.xpath("//*[@id='createLeadForm_generalAttnName']")).sendKeys("Attention Name");

        //fill Address 1
        driver.findElement(By.xpath("//*[@id='createLeadForm_generalAddress1']")).sendKeys("Address 1");

        //fill Address 1
        driver.findElement(By.xpath("//*[@id='createLeadForm_generalAddress2']")).sendKeys("Address 2");

        //fill city name
        driver.findElement(By.xpath("//*[@id='createLeadForm_generalCity']")).sendKeys("Surat");

        //click on state
        driver.findElement(By.xpath("//*[@id='createLeadForm_generalStateProvinceGeoId']")).click();
        //Select state
        driver.findElement(By.xpath("//*[@id=\"createLeadForm_generalStateProvinceGeoId\"]/option[3]")).click();

        //fill Zip/Postal Code
        driver.findElement(By.xpath("//*[@id='createLeadForm_generalPostalCode']")).sendKeys("05789");

        //click on country
        driver.findElement(By.xpath("//*[@id='createLeadForm_generalCountryGeoId']")).click();
        //Select country
        driver.findElement(By.xpath("//*[@id=\"createLeadForm_generalCountryGeoId\"]/option[3]")).click();

        //fill Zip/Postal Code Extension
        driver.findElement(By.xpath("//*[@id='createLeadForm_generalPostalCodeExt']")).sendKeys("55555");

        //click on create lead button
        driver.findElement(By.xpath("//*[@name='submitButton']")).click();

        //fill
        driver.findElement(By.xpath("")).sendKeys();


    }





    }

