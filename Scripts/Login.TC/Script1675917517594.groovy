import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import internal.GlobalVariable as GlobalVariable

KeywordUtil.logInfo(GlobalVariable.Envi)
KeywordUtil.logInfo('User'+GlobalVariable.UserID)

def ResponseRequestID = WS.sendRequest(findTestObject('login case'))


