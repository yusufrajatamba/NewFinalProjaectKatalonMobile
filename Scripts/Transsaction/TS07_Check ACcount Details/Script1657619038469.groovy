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

Mobile.tap(findTestObject('Check Transaksi account/LOGIN'), 3)

Mobile.tap(findTestObject('Check Transaksi account/ImageButton'), 3)

Mobile.tap(findTestObject('Check Transaksi account/Accounts'), 3)

Mobile.tap(findTestObject('Check Transaksi account/TextView - Kimura'), 3)

Mobile.takeScreenshot('C:\\Users\\095050\\AppData\\Local\\Temp\\screenshot3847963077019226976.png')

Mobile.tap(findTestObject('Check Transaksi account/widgetSpinner'), 3)

Mobile.tap(findTestObject('Check Transaksi account/CheckedTextView -'), 3)

Mobile.takeScreenshot('C:\\Users\\095050\\AppData\\Local\\Temp\\screenshot3520178523406084303.png')

Mobile.tap(findTestObject('Object Repository/Check Transaksi account/widget.Spinner'), 3)

Mobile.tap(findTestObject('Check Transaksi account/CheckedTextView'), 3)

Mobile.tap(findTestObject(''), 3)

Mobile.tap(findTestObject('Object Repository/Check Transaksi account/CheckedTextView - Kimura'), 
    3)

Mobile.tap(findTestObject('Object Repository/Check Transaksi account/ImageButton (1)'), 3)

Mobile.takeScreenshot('C:\\Users\\095050\\AppData\\Local\\Temp\\screenshot1029204931319900265.png')

