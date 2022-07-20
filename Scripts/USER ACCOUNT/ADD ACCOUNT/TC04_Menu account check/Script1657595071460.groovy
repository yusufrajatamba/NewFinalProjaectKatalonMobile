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

check = Mobile.verifyElementNotVisible(findTestObject('men account/Accounts'), 4)

if (check == true) {
    Mobile.tap(findTestObject('men account/widget'), 3)

    Mobile.tap(findTestObject('men account/Accounts'), 3)
} else {
    Mobile.tap(findTestObject('men account/Accounts'), 3)
}

Mobile.verifyElementVisible(findTestObject('men account/ViewGroup1'), 4)

if (true) {
    Mobile.tap(findTestObject('men account/ViewGroup1'), 3)

    Mobile.tap(findTestObject('men account/Check account transsaction/accountSpinner'), 0)

    Mobile.tap(findTestObject('men account/Check account transsaction/typeSpinner'), 0)

    Mobile.tap(findTestObject('men account/Check account transsaction/orderbySpinner'), 0)
} else {
    Mobile.tap(findTestObject('men account/ImageButtonadd'), 3)

    WebUI.callTestCase(findTestCase('USER ACCOUNT/ADD ACCOUNT/TC003_Add Account For Test Suites'), [:], FailureHandling.STOP_ON_FAILURE)
}

