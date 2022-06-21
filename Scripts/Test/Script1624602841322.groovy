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

WebUI.click(findTestObject('Object Repository/Page_Design It Right/i_Supplier Finder_fa fa-barcode'))

WebUI.click(findTestObject('Object Repository/Page_Design It Right/button_Sort and Filter'))

WebUI.click(findTestObject('Object Repository/Page_Design It Right/div_Nothing selected'))

WebUI.setText(findTestObject('Object Repository/Page_Design It Right/input_Nothing selected_form-control'), 'pre')

WebUI.click(findTestObject('Object Repository/Page_Design It Right/span_Prethiya Prakasam'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Adam BandurskiAnurag KumarBalaji Nam_77542c'), 
    '413', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Adam BandurskiAnurag KumarBalaji Nam_77542c'), 
    '413', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Adam BandurskiAnurag KumarBalaji Nam_77542c'), 
    '413', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Adam BandurskiAnurag KumarBalaji Nam_77542c'), 
    '413', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Adam BandurskiAnurag KumarBalaji Nam_77542c'), 
    '413', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Adam BandurskiAnurag KumarBalaji Nam_77542c'), 
    '413', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Adam BandurskiAnurag KumarBalaji Nam_77542c'), 
    '413', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Adam BandurskiAnurag KumarBalaji Nam_77542c'), 
    '413', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Adam BandurskiAnurag KumarBalaji Nam_77542c'), 
    '413', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Adam BandurskiAnurag KumarBalaji Nam_77542c'), 
    '413', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Adam BandurskiAnurag KumarBalaji Nam_77542c'), 
    '413', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Adam BandurskiAnurag KumarBalaji Nam_77542c'), 
    '413', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Adam BandurskiAnurag KumarBalaji Nam_77542c'), 
    '413', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Adam BandurskiAnurag KumarBalaji Nam_77542c'), 
    '413', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Adam BandurskiAnurag KumarBalaji Nam_77542c'), 
    '413', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Adam BandurskiAnurag KumarBalaji Nam_77542c'), 
    '413', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Adam BandurskiAnurag KumarBalaji Nam_77542c'), 
    '413', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Design It Right/select_Adam BandurskiAnurag KumarBalaji Nam_77542c'), 
    '413', true)

WebUI.click(findTestObject('Object Repository/Page_Design It Right/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Design It Right/button_'))

WebUI.click(findTestObject('Object Repository/Page_Design It Right/i_Prethiya Prakasam_fa fa-folder-open'))

WebUI.click(findTestObject('Object Repository/Page_Design It Right/a_Welcome Prethiya Prakasam'))

WebUI.click(findTestObject('Object Repository/Page_Design It Right/a_Logout'))

