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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Page_LoginPage_It-Right/input_Sign in_username'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LoginPage_It-Right/input_Sign in_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Page_LoginPage_It-Right/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_It-Right Platform/button_Welcome_navbar-toggler'))

WebUI.click(findTestObject('Object Repository/Page_It-Right Platform/a_GCM'))

WebUI.click(findTestObject('Object Repository/Page_PIR/span_Last updated on 06212022 0346 AM PST'))

WebUI.click(findTestObject('Object Repository/Page_PIR/span_Last updated on 06212022 0346 AM PST'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_PIR/select_AllCRAIG MEDICHGE CHIAMJONATHAN LEEW_ed489d'), 
    'JONATHAN LEE', true)

WebUI.click(findTestObject('Object Repository/Page_PIR/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_PIR/button_Export'))

WebUI.click(findTestObject('Object Repository/Page_PIR/a_Current View'))

WebUI.closeBrowser()

