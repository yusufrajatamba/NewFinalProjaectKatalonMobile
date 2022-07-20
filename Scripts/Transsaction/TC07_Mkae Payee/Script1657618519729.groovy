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

Mobile.startApplication('C:\\Users\\095050\\Documents\\BootCamp Hacktiv8 x BFI\\KATALON SUPER\\FinalProjectKatalon_Mobile Testing\\FinalProjectKatalon_Mobile\\APK\\app-debug.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/Transsaction/Make Payee/CREATE A PROFILE'), 3)

Mobile.setText(findTestObject('Object Repository/Transsaction/Make Payee/First Name'), 'Yusuf', 3)

Mobile.setText(findTestObject('Object Repository/Transsaction/Make Payee/Last Name'), 'Tamba', 3)

Mobile.setText(findTestObject('Object Repository/Transsaction/Make Payee/Country'), 'Indonesia', 3)

Mobile.setText(findTestObject('Object Repository/Transsaction/Make Payee/Username'), 'YusufTamba', 3)

Mobile.setEncryptedText(findTestObject('Object Repository/Transsaction/Make Payee/Password'), 'E6J4RHe2jpw6vT7VKpKwcw==', 
    3)

Mobile.setEncryptedText(findTestObject('Object Repository/Transsaction/Make Payee/Confirm Password'), 'E6J4RHe2jpw6vT7VKpKwcw==', 
    3)

Mobile.tap(findTestObject('Object Repository/Transsaction/Make Payee/Create Profile'), 0)

Mobile.tap(findTestObject('Object Repository/Transsaction/Make Payee/LOGIN'), 3)

Mobile.tap(findTestObject('Object Repository/Transsaction/Make Payee/ADD ACCOUNT'), 3)

Mobile.setText(findTestObject('Object Repository/Transsaction/Make Payee/Account Name'), 'Kimura', 3)

Mobile.setText(findTestObject('Object Repository/Transsaction/Make Payee/Initial Balance (Optional)'), '30000', 3)

Mobile.tap(findTestObject('Object Repository/Transsaction/Make Payee/ADD'), 3)

Mobile.tap(findTestObject('Object Repository/Transsaction/Make Payee/ImageButton'), 3)

Mobile.setText(findTestObject('Transsaction/Make Payee/Account Name'), 'Nadya', 0)

Mobile.setText(findTestObject('Transsaction/Make Payee/Initial Balance (Optional)'), '25000', 0)

Mobile.tap(findTestObject('Transsaction/Make Payee/ADD (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Transsaction/Make Payee/ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Transsaction/Make Payee/Make a Payment'), 0)

Mobile.tap(findTestObject('Object Repository/Transsaction/Make Payee/ImageButton (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Transsaction/Make Payee/Payee Name'), 'Listrik', 0)

Mobile.tap(findTestObject('Object Repository/Transsaction/Make Payee/ADD (1)'), 0)

Mobile.setText(findTestObject('Transsaction/Make Payee/Amount'), '2000', 0)

Mobile.tap(findTestObject('Object Repository/Transsaction/Make Payee/Make Payment'), 0)

Mobile.tap(findTestObject('Object Repository/Transsaction/Make Payee/ImageButton (3)'), 0)

Mobile.setText(findTestObject('Transsaction/Make Payee/Payee Name'), 'Nadyan', 0)

Mobile.tap(findTestObject('Transsaction/Make Payee/ADD'), 0)

Mobile.setText(findTestObject('Transsaction/Make Payee/Amount'), '3000', 0)

Mobile.tap(findTestObject('Transsaction/Make Payee/Make Payment'), 0)

Mobile.tap(findTestObject('Transsaction/Make Payee/ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Transsaction/Make Payee/Logout'), 0)

WebUI.delay(8)

Mobile.closeApplication()

