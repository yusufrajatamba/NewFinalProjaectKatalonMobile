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

WebUI.callTestCase(findTestCase('USER ACCOUNT/REGISTER/TC001_Register Account'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('USER ACCOUNT/LOGIN/TC002_Login01'), [:], FailureHandling.STOP_ON_FAILURE)

check = Mobile.verifyElementVisible(findTestObject('ADD ACCOOUNT/Accounts'), 5, FailureHandling.CONTINUE_ON_FAILURE)

if (check == false) {
    Mobile.tap(findTestObject('ADD ACCOOUNT/widget.ImageButton'), 5)

    Mobile.tap(findTestObject('ADD ACCOOUNT/Accounts'), 3)

    Mobile.tap(findTestObject('ADD ACCOOUNT/add account bawah'), 3)

    Mobile.setText(findTestObject('ADD ACCOOUNT/Account Name'), name, 3)

    Mobile.setText(findTestObject('ADD ACCOOUNT/Initial Balance (Optional)'), '10000', 5)

    Mobile.tap(findTestObject('ADD ACCOOUNT/Button - ADD finish'), 4)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)
}

