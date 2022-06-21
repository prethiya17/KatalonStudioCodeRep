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

WebUI.setEncryptedText(findTestObject('Page_LoginPage_It-Right/input_Sign in_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Page_LoginPage_It-Right/button_Sign in'))

WebUI.click(findTestObject('Page_LoginPage_It-Right/Three line icon'))

WebUI.click(findTestObject('Page_LoginPage_It-Right/span_GBS'))

WebUI.click(findTestObject('UploadFileObjects/Page_Design It Right/UploadFile_GBS'))

WebUI.click(findTestObject('Object Repository/Page_Design It Right/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Design It Right/input__dueDate'))

WebUI.click(findTestObject('Object Repository/Page_Design It Right/div_27'))

WebUI.setText(findTestObject('Object Repository/Page_Design It Right/textarea_Comments_comments'), 'Test')

WebUI.click(findTestObject('Object Repository/Page_Design It Right/div_Thank you for your patience_js-loading-bar'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Design It Right/div_Thank you for your patience_js-loading-bar'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_AudioEmbedded SystemsGeneralHMI  Mul_c0ed04'), 
    'Audio', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Audio AmplifierAudio CodecMicrophones'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Design It Right/button_Create'))

