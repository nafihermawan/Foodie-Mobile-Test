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

Mobile.startExistingApplication('com.foody.vn.activity')

Mobile.tap(findTestObject('Object Repository/Review/android.widget.LinearLayout'), 0)

Mobile.getText(findTestObject('Object Repository/Review/android.widget.TextView - Write review'), 0)

Mobile.getText(findTestObject('Object Repository/Review/android.widget.TextView - Midoricha - Ice Cream  Drink'), 0)

Mobile.setText(findTestObject(''), 'good', 0)

Mobile.setText(findTestObject('Object Repository/Review/android.widget.EditText - Please review more than 100 words, do not spam to get reward points'), 
    'good food', 0)

Mobile.tap(findTestObject('Object Repository/Review/android.widget.TextView - Post'), 0)

Mobile.tap(findTestObject('Object Repository/Review/android.widget.TextView - Rate'), 0)

Mobile.setSliderValue(findTestObject('Object Repository/Review/android.widget.SeekBar - 0.0'), 7, 0)

Mobile.setSliderValue(findTestObject('Object Repository/Review/android.widget.SeekBar - 50.0 (1)'), 7, 0)

Mobile.setSliderValue(findTestObject('Object Repository/Review/android.widget.SeekBar - 50.0 (2)'), 7, 0)

Mobile.setSliderValue(findTestObject('Object Repository/Review/android.widget.SeekBar - 50.0 (3)'), 7, 0)

Mobile.setSliderValue(findTestObject('Object Repository/Review/android.widget.SeekBar - 50.0 (4)'), 7, 0)

Mobile.tap(findTestObject('Object Repository/Review/android.widget.TextView - Done'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Review/android.widget.Button - CLOSE'), 0)

Mobile.closeApplication()

