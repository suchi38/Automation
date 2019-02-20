import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('https://www.katalon.com/')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.katalon.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('http://automationpractice.com/index.php')

selenium.click('link=Women')

WebUI.scrollToPosition(0, 800)

def old_pos = 800

def j = 400

def i = 1

for (def index : (1..6)) {
    if ((index % (i + 3)) == 0) {
        old_pos = (old_pos + j)

        WebUI.scrollToPosition(0, old_pos)
    }
    
    WebUI.delay(5)

    //selenium.click("//li[2]/div/div[2]/div["+index+"]/a")
    selenium.click(('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'More\'])[' + index) + ']/preceding::span[1]')

    WebUI.delay(3)

    selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Categories\'])[1]/preceding::span[2]')
}

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('AddToCartObjects/CartClick'))

for (def index1 : (1..6)) {
    selenium.click('xpath= /html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[1]/td[7]/div/a/i')
	WebUI.delay(3)
}