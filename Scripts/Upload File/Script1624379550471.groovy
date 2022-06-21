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

WebUI.setText(findTestObject('Object Repository/Page_Price It Right  Design It Right/input_Sign in_username'), GlobalVariable.Username)

WebUI.setMaskedText(findTestObject('Object Repository/Page_Price It Right  Design It Right/input_Sign in_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Page_Price It Right  Design It Right/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Design It Right/i_PIR  DIR_fa fa-chart-pie'))

WebUI.uploadFile(findTestObject('UploadFileObjects/Page_Price It Right/UploadFile_PIR'), 'C:\\Users\\gssprpra\\OneDrive - Flex\\Desktop\\Automation\\PRICE_TYPE_TEST_COMMODITY_MANAGEMENT_108875-AGILENT-_20170831-1_Updated 2702.xlsx')

