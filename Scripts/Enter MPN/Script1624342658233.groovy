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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://pirqa.flex.com/login')

WebUI.setText(findTestObject('Object Repository/Page_Price It Right  Design It Right/input_Sign in_username'), 'gssprpra')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Price It Right  Design It Right/input_Sign in_password'), 
    'itNCG6nSMrdTy+lDlHuqVA==')

WebUI.click(findTestObject('Object Repository/Page_Price It Right  Design It Right/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Design It Right/i_PIR  DIR_fa fa-chart-pie'))

WebUI.click(findTestObject('Object Repository/Page_Price It Right/button_Enter MPNs'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Price It Right/select_Select typeNew project quote  pre qu_b32c8e'), 
    'TEST_OR_TRAINING', true)

WebUI.click(findTestObject('Object Repository/Page_Price It Right/button_Apply'))

WebUI.setText(findTestObject('Object Repository/Page_Price It Right/input_API Price Check_text'), 'DMG1012T|VZH220M1HTR0606K|LQH3NPN2R2MME|DMG1012T-7')

WebUI.click(findTestObject('Object Repository/Page_Price It Right/button_Run by MPN'))

WebUI.closeBrowser()

