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

WebUI.setText(findTestObject('Page_It-Right Platform_GBS/Username'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Page_It-Right Platform_GBS/password'), GlobalVariable.Password)

WebUI.click(findTestObject('Page_It-Right Platform_GBS/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_It-Right Platform_GBS/span_WelcomeToggler'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_It-Right Platform_GBS/div_WelcomeMenu'), 0)

WebUI.scrollToElement(findTestObject('Page_It-Right Platform_GBS/span_GBS'), 0)

WebUI.waitForElementClickable(findTestObject('Page_It-Right Platform_GBS/span_GBS'), 0)

WebUI.click(findTestObject('Page_It-Right Platform_GBS/span_GBS'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/button_Technical Sourcing'))

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/span_Flex_Organization'))

WebUI.selectOptionByValue(findTestObject('Page_DIR_GBS/GBS Project/select_Organization'), 'FLEX', true)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS Project/div_To Create Project   Drop GBS project'), 0)

WebUI.uploadFileWithDragAndDrop(findTestObject('Page_DIR_GBS/GBS Project/div_To Create Project   Drop GBS project'), GlobalVariable.GBSAF_File)

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS Project/div_Choose Analysis Type'), 3)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/button_OK'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS Project/div_Create Project'), 3)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/input__dueDate'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/span_Month'))

WebUI.scrollToElement(findTestObject('Page_DIR_GBS/GBS Project/span_MonthDecember'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/span_MonthDecember'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/span_Year'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Page_DIR_GBS/GBS Project/span_Year2024'), 2)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/span_Year2024'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/div_Date31'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_DIR_GBS/GBS Project/textarea_Comments_comments'), 'Test')

WebUI.scrollToElement(findTestObject('Page_DIR_GBS/GBS Project/button_Create'), 2)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/button_Create'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Page_DIR_GBS/GBS Project/div_Project success msg'), 3)

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS Project/div_Project success msg'), 3)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Page_DIR_GBS/GBS Project/td_FileName_Dummy'), 2)

WebUI.verifyElementAttributeValue(findTestObject('Page_DIR_GBS/GBS Project/td_FileName_Dummy'), 'text', GlobalVariable.GBSAF_FileName, 3)

WebUI.click(findTestObject('Page_DIR_GBS/GBS Project/Alternate Finder/AF_Mainpage/span_Welcome Thangasumathy Jayakumar'))

WebUI.click(findTestObject('Page_DIR_GBS/a_Logout'))

