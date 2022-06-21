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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_LoginPage_It-Right/input_Sign in_username'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Page_LoginPage_It-Right/input_Sign in_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Page_LoginPage_It-Right/button_Sign in'))

WebUI.click(findTestObject('Page_LoginPage_It-Right/Three line icon'))

WebUI.click(findTestObject('Page_DIR/Page_It-Right Platform/span_BOM Pulse'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Design It Right/div_BOM Pulse'), 'BOM Pulse')

WebUI.uploadFile(findTestObject('Page_Design It Right/Page_Design It Right/input_Load_file'), 'C:\\Users\\gssprpra\\OneDrive - Flex\\Desktop\\Automation\\17 MPNs_Flex - Without Dup.xlsx')

WebUI.selectOptionByValue(findTestObject('Page_Design It Right/Page_Design It Right/MPN Pop up Select'), '0', true)

WebUI.click(findTestObject('Object Repository/Page_Design It Right/button_Next'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Select type                         _6f78e4'), 
    'TEST_TRAINING', true)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Design It Right/button_Apply'))

WebUI.setText(findTestObject('Object Repository/Page_Design It Right/input_Save BOM_save-search-modal-input'), 'Test_Katalon_P2')

WebUI.click(findTestObject('Object Repository/Page_Design It Right/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Design It Right/label_Time Window'), 'Time Window')

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

