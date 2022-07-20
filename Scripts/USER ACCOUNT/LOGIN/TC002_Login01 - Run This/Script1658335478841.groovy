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

Mobile.setText(findTestObject('Object Repository/Login Page/username'), 'Yusuf27', 5)

Mobile.setText(findTestObject('Object Repository/Login Page/password'), 'Sembilan7', 5)

Mobile.tap(findTestObject('Object Repository/Login Page/Remember Credentials'), 5)

Mobile.tap(findTestObject('Object Repository/Login Page/btn_loginLOGIN'), 5)

WebUI.verifyElementText(findTestObject('Login Page/Dashbord'), 'Dashbord')

WebUI.verifyElementText(findTestObject('Login Page/Yusuf. Welcome to the Bank App Demo. Happy Tuesday'), 'God morning,Yusuf.Welcome to the Bank App Demo. Happy Tuesday', 
    FailureHandling.CONTINUE_ON_FAILURE)

checkrespon = Mobile.verifyElementText(findTestObject('Login Page/android.widget.TextView - You do not have any accounts, click below to add an account'), 
    'You do not have any accounts, click below to add an account')

