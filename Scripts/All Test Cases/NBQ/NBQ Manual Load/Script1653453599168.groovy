import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Page_LoginPage_It-Right/input_Sign in_username'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Page_LoginPage_It-Right/input_Sign in_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Page_LoginPage_It-Right/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_LoginPage_It-Right/Three line icon'))

WebUI.click(findTestObject('Page_LoginPage_It-Right/span_New Business Quoting'))

WebUI.uploadFile(findTestObject('Page_PIR/Page_PIR_NBQ/UploadFile_PIR'), GlobalVariable.FileLocation)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Price It Right/select_Select typeNew project quote  pre qu_b32c8e'), 
    'TEST_OR_TRAINING', true)

WebUI.click(findTestObject('Object Repository/Page_Price It Right/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Price It Right/button_Run'))

WebUI.click(findTestObject('Object Repository/Page_Price It Right/button_Run_run-caret'))

WebUI.click(findTestObject('Object Repository/Page_Price It Right/button_Run_run-caret'))

WebUI.click(findTestObject('Object Repository/Page_Price It Right/a_by CPN'))

WebUI.waitForElementVisible(findTestObject('Page_Price It Right/Page_Price It Right/Chart Area Enabled'), 45)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_PIR/Page_PIR_NBQ/Save_button'), 3)

WebUI.closeBrowser()

