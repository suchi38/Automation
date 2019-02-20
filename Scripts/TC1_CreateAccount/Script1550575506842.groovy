import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Object Repository/CreateAccount/Page_My Store/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/CreateAccount/Page_Login - My Store/input_Email address_email_crea'), email)

WebUI.click(findTestObject('Object Repository/CreateAccount/Page_Login - My Store/button_Create an account'))

WebUI.click(findTestObject('CreateAccount/Page_Login - My Store/input_Mr._id_gender'))

WebUI.setText(findTestObject('Object Repository/CreateAccount/Page_Login - My Store/input__customer_firstname'), firstname)

WebUI.setText(findTestObject('Object Repository/CreateAccount/Page_Login - My Store/input__customer_lastname'), lastname)

WebUI.setText(findTestObject('Object Repository/CreateAccount/Page_Login - My Store/input__passwd'), password)

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateAccount/Page_Login - My Store/select_-1234567891011121314151'), 
    birthday, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateAccount/Page_Login - My Store/select_-JanuaryFebruaryMarchAp'), 
    birthmonth, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateAccount/Page_Login - My Store/select_-2019201820172016201520'), 
    birthyear, true)

WebUI.setText(findTestObject('Object Repository/CreateAccount/Page_Login - My Store/input_Company_company'), company)

WebUI.setText(findTestObject('Object Repository/CreateAccount/Page_Login - My Store/input__address1'), address1)

WebUI.click(findTestObject('Object Repository/CreateAccount/Page_Login - My Store/p_Address (Line 2)Apartment su'))

WebUI.setText(findTestObject('CreateAccount/Page_Login - My Store/input_Address (Line 2)_address'), address2)

WebUI.setText(findTestObject('Object Repository/CreateAccount/Page_Login - My Store/input__city'), city)

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateAccount/Page_Login - My Store/select_-AlabamaAlaskaArizonaAr'), 
    state, true)

WebUI.setText(findTestObject('Object Repository/CreateAccount/Page_Login - My Store/input__postcode'), postcode)

WebUI.setText(findTestObject('Object Repository/CreateAccount/Page_Login - My Store/input__phone_mobile'), phone)

WebUI.click(findTestObject('Object Repository/CreateAccount/Page_Login - My Store/button_Register'))

