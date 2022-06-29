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

WebUI.scrollToElement(findTestObject('Object Repository/Page_LoginPage_It-Right/span_New Business Quoting'), 0)

WebUI.click(findTestObject('Object Repository/Page_PIR/Page_PIR_NBQ/span_New Business Quoting'))

WebUI.click(findTestObject('Object Repository/Page_PIR/Page_PIR_NBQ/button_QWProject_qw-caret'))

WebUI.click(findTestObject('Object Repository/Page_PIR/Page_PIR_NBQ/a_Restore your last saved QW project'))

WebUI.click(findTestObject('Object Repository/Page_PIR/Page_PIR_NBQ/button_Export'))

WebUI.click(findTestObject('Object Repository/Page_PIR/Page_PIR_NBQ/button_Export'))

WebUI.click(findTestObject('Object Repository/Page_PIR/Page_PIR_NBQ/button_Export'))

WebUI.click(findTestObject('Object Repository/Page_PIR/Page_PIR_NBQ/a_All'))

WebUI.verifyElementClickable(findTestObject('Page_PIR/Page_PIR_NBQ/Add to Compare_button'))

WebUI.takeFullPageScreenshot()

