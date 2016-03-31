package com.vsii.tsc.guru.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.pages.ISMSPage;
import com.vsii.tsc.guru.pages.method.ISMSMethod;
import com.vsii.tsc.guru.pages.method.ISMS_LoginPageMethod;
import com.vsii.tsc.guru.testdata.TestData;
import com.vsii.tsc.utility.CommonOperations;
import com.vsii.tsc.utility.TestBase;

public class ISMS_ComposeISMS extends TestBase
{
    ISMS_LoginPageMethod objLogin; 
    ISMSMethod objISMS;
    ISMSPage objISMSPage;
    @BeforeClass
    public void setupClass() throws NumberFormatException, IOException {
        objLogin = new ISMS_LoginPageMethod(TestBase.driver);
        objISMS = new ISMSMethod(TestBase.driver);
        objISMSPage = new ISMSPage();
    }

  //@Test(priority = 1, description = "Verify that the form Compose ISMS Request is opened correctly")
    public void TC04() throws IOException {     
        TestBase.methodName = "TC04";       
        objLogin.login("diuttm","12345678");   
        objISMS.GotoISMSPage();
        objISMS.ClickComposeISMSRequest();
        objISMS.VerifyComposeISMSReuestPopUp();
    }
  // @Test(priority = 2, description = "Verify that user can report a issue")
    public void TC05() throws IOException {     
        TestBase.methodName = "TC05";
        objLogin.login("diuttm","12345678"); 
        objISMS.ClickComposeISMSRequest();
        objISMS.ComposeISMSReuest("Causing confusion in the use for users","Files and Documents");
       // objISMS.logout();
    }
   //@Test(priority = 3, description = "Verify that ISMS Issues List is displayed correctly")
    public void TC06() throws IOException, InterruptedException {     
        TestBase.methodName = "TC06";
        objLogin.login("diuttm","12345678"); 
        Thread.sleep(10000);
        objISMS.GotoISMSPage();
        objISMS.ClickISMSissue();
        objISMS.VerrifyISMSIssuesListdisplayedcorrectly();
    }
   //@Test(priority = 4, description = "Verify that the form New of Asset Categories is opened correctly",dataProvider = "Asset Categories", dataProviderClass = TestData.class)
   public void TC38(String user, String pass) throws InterruptedException{     
   TestBase.methodName = "TC38";    
   objLogin.login(user,pass);
   objISMS.GotoISMSPage();
   objISMS.ClickAssetCategories(); 
   objISMS.ClickassetCreatBtn();
   objISMS.VerrifyAssetManagedisplayedcorrectly();
   objISMS.logout();
   }
   //@Test(priority = 5, description = "Verify that the field Name is required field on Asset Categories",dataProvider = "Asset Categories", dataProviderClass = TestData.class)
   public void TC39(String user, String pass) throws InterruptedException{     
   TestBase.methodName = "TC39";    
   objLogin.login(user,pass);
   objISMS.GotoISMSPage();
   objISMS.ClickAssetCategories(); 
   objISMS.ClickassetCreatBtn();
   objISMS.ClickSaveAsset();
   objISMS.verifyerrormsg();
   objISMS.logout();
   }
   //@Test(priority = 5, description = "Verify that the field Name is required field on Asset Categories",dataProvider = "Create Asset Categories", dataProviderClass = TestData.class)
   public void TC40(String user, String pass, String Name) throws InterruptedException{     
   TestBase.methodName = "TC40";    
   objISMS.createAssetCategories(user,pass,Name);
  Assert.assertEquals(objISMS.actualName(), Name);
   Assert.assertEquals(objISMS.actualParent(), "");
  // Assert.assertEquals(objISMS.actuaSeq(), "140");
   Assert.assertEquals(objISMS.actualDes(), "");
   objISMS.logout();
   }
  // @Test(priority = 5, description = "Verify that the fileds Name Category are required fileds on Assets",dataProvider = "Create Asset Company", dataProviderClass = TestData.class)
   public void TC41(String user, String pass) throws InterruptedException{     
   TestBase.methodName = "TC41";    
   objISMS.createAssetCompany(user,pass);
   Assert.assertEquals(objISMS.getErrTit(), "The following fields are invalid:");
   Assert.assertEquals(objISMS.geterrmsCont1(), "Name");
   Assert.assertEquals(objISMS.geterrmsCont2(), "Category");
   objISMS.logout();
   }
   @Test(priority = 5, description = "Verify that the fileds Name Category are required fileds on Assets",dataProvider = "Create Asset Company 2", dataProviderClass = TestData.class)
   public void TC42(String user, String pass) throws InterruptedException{     
   TestBase.methodName = "TC42";    
   objLogin.login(user,pass);
   objISMS.GotoISMSPage();
   objISMS.clickAsset(); 
   objISMS. ClickassetCreatBtn();
   objISMS.VerrifyAssetCompanydisplayedcorrectly();
   objISMS.logout();
   }
@AfterMethod
public void afterMethod() throws Exception {
 CommonOperations.takePicture();
//TestBase.driver.quit();
 TestBase.driver.manage().deleteAllCookies();
}}