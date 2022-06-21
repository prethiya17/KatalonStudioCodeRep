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

WebUI.navigateToUrl('https://pirqa.flex.com/login')

WebUI.setText(findTestObject('Object Repository/Page_Price It Right  Design It Right/input_Sign in_username'), 'gssprpra')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Price It Right  Design It Right/input_Sign in_password'), 
    'itNCG6nSMrdTy+lDlHuqVA==')

WebUI.click(findTestObject('Object Repository/Page_Price It Right  Design It Right/button_Sign in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Design It Right/i_PIR  DIR_fa fa-chart-pie'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Design It Right/i_PIR  DIR_fa fa-chart-pie'))

WebUI.click(findTestObject('Object Repository/Page_Design It Right/i_PIR  DIR_fa fa-chart-pie'))

WebUI.click(findTestObject('Object Repository/Page_Price It Right/button_QWProject'))

WebUI.click(findTestObject('Object Repository/Page_Price It Right/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Price It Right/div_Created with Highcharts 7.2.013.3 2020._1e77e6'))

WebUI.verifyElementNotVisible(findTestObject('Object Repository/Page_Price It Right/div_Created with Highcharts 7.2.013.3 2020._1e77e6'))

WebUI.click(findTestObject('Object Repository/Page_Price It Right/tspan_40.0'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_Price It Right/tspan_40.0'))

WebUI.rightClick(findTestObject('Object Repository/Page_Price It Right/div_0 210Current value 2,10Current value 2C_8bb405'))

WebUI.click(findTestObject('Object Repository/Page_Price It Right/div_0 210Current value 2,10Current value 2C_8bb405'))

WebUI.click(findTestObject('Object Repository/Page_Price It Right/div_PSLStdCostDNP'))

WebUI.verifyElementNotVisible(findTestObject('Object Repository/Page_Price It Right/div_PSLStdCostDNP'))

WebUI.click(findTestObject('Object Repository/Page_Price It Right/input'))

WebUI.closeBrowser()

