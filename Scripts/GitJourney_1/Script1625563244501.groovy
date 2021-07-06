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

WebUI.openBrowser('https://the-internet.herokuapp.com/javascript_alerts')

not_run: WebUI.maximizeWindow()

not_run: Thread.sleep(3000)

WebUI.verifyElementPresent(findTestObject('GitJourney1/Page_The Internet/h3_JavaScript Alerts'), 3)

WebUI.verifyElementPresent(findTestObject('GitJourney1/Page_The Internet/h4_Result'), 3)

WebUI.verifyElementText(findTestObject('GitJourney1/Page_The Internet/h3_JavaScript Alerts'), 'JavaScript Alerts')

WebUI.verifyElementText(findTestObject('GitJourney1/Page_The Internet/h4_Result'), 'Result:', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('GitJourney1/Page_The Internet/button_Click for JS Alert'))

WebUI.waitForAlert(3)

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('GitJourney1/Page_The Internet/button_Click for JS Confirm'))

WebUI.waitForAlert(2)

WebUI.acceptAlert()

WebUI.delay(1)

WebUI.click(findTestObject('GitJourney1/Page_The Internet/button_Click for JS Confirm'))

WebUI.waitForAlert(2)

WebUI.dismissAlert()

WebUI.delay(3)

WebUI.click(findTestObject('GitJourney1/Page_The Internet/button_Click for JS Prompt'))

WebUI.setAlertText('Fine')
println("Fine")

WebUI.acceptAlert()

WebUI.closeBrowser()

