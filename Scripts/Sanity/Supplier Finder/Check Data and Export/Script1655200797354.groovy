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

WebUI.setText(findTestObject('Page_It-Right Platform_SupplierFinder/Username'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Page_It-Right Platform_SupplierFinder/password'), GlobalVariable.Password)

WebUI.click(findTestObject('Page_It-Right Platform_SupplierFinder/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_It-Right Platform_SupplierFinder/span_WelcomeToggler'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_It-Right Platform_SupplierFinder/div_WelcomeMenu'), 1)

WebUI.click(findTestObject('Object Repository/Page_It-Right Platform_SupplierFinder/span_Supplier Finder'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DIR_SupplierFinder/div_Supplier Finder'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DIR_SupplierFinder/div_datatable_header'), 1)

WebUI.verifyElementText(findTestObject('Object Repository/Page_DIR_SupplierFinder/td_SupplierName'), '5D INDUSTRIA')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DIR_SupplierFinder/button_Export'), 1)

WebUI.click(findTestObject('Object Repository/Page_DIR_SupplierFinder/button_Export'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DIR_SupplierFinder/div_Supplier Finder'), 2)

WebUI.click(findTestObject('Object Repository/Page_DIR_SupplierFinder/span_Welcome Thangasumathy Jayakumar'))

WebUI.click(findTestObject('Object Repository/Page_DIR_SupplierFinder/a_Logout'))

WebUI.closeBrowser()

