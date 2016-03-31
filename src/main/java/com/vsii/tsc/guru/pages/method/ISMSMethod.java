package com.vsii.tsc.guru.pages.method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.vsii.tsc.guru.pages.ISMSPage;
import com.vsii.tsc.utility.TestBase;

public class ISMSMethod
{    
    //Logger log = Logger.getLogger("minhdiu");
    
    WebDriver driver;
    ISMS_LoginPageMethod objLogin = new ISMS_LoginPageMethod(TestBase.driver);
    public ISMSPage objISMSPage = new ISMSPage();

    public ISMSMethod(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, objISMSPage);      
    }
  
    
public void GotoISMSPage(){
    objISMSPage.ISMSHelpdesk_btn.click();
}

public void ClickComposeISMSRequest(){

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    objISMSPage.ComposeISMSRequest.click();
}
public void ClickISMSissue(){
    objISMSPage.ISMSIssue.click();
}
public void ClickAssetCategories(){
    objISMSPage.AssetCategories.click();
}

public void VerifyISMSAdmin(){
   Assert.assertTrue(objISMSPage.AssetCategories.getSize()!=null);
   Assert.assertTrue(objISMSPage.Assets.getSize()!=null);
   Assert.assertTrue(objISMSPage.ComposeISMSRequest.getSize()!=null);
   Assert.assertTrue(objISMSPage.ISMSIssue.getSize()!=null);
   Assert.assertTrue(objISMSPage.ISMSRequest.getSize()!=null);
   Assert.assertTrue(objISMSPage.IssueManagement.getSize()!=null);  
}
public void logout(){
    objISMSPage.namename.click();
    objISMSPage.logout_btn.click();
}
public void VerifyISMSnotAdmin(){

  Assert.assertTrue(objISMSPage.ComposeISMSRequest.getSize()!=null);
 Assert.assertTrue(objISMSPage.ISMSIssue.getSize()!=null);
  Assert.assertTrue(objISMSPage.ISMSRequest.getSize()!=null);
 
 }
public void getTitlePopup(){
    String title = objISMSPage.composeTitle.getText();
    Assert.assertEquals(title, "Compose ISMS Request");    
}
public void getComposeIssueLable(){
    String title = objISMSPage.composeIssue_label.getText();
    Assert.assertEquals(title, "What is the issue?");    
}
public void getComposeCategoryLable(){
    String title = objISMSPage.composeCategory_lable.getText();
    Assert.assertEquals(title, "Please choose a category");    
}
public void getComposeProblemLable(){
    String title = objISMSPage.composeProblem_lable.getText();
    Assert.assertEquals(title, "What problem is your issue relating to?");    
}
public void getSimilarIssueLable(){
    String title = objISMSPage.similarIssue_lable.getText();
    Assert.assertEquals(title, "Anything is similar with your issue?");    
}

public void VerifyComposeISMSReuestPopUp(){

    getTitlePopup();
    getComposeIssueLable();
    getComposeCategoryLable();
    getComposeProblemLable();
    getSimilarIssueLable();
   // verifyissueBlank();
    verifyCategoryBlank();
//   verifyproblemBlank();
//   verifysimilarIssueBlank();
//    verifyDescripBlank();
}
public void SetIssue(String issue){

    objISMSPage.composeIssue_txb.sendKeys(issue);
   // webElement.sendKeys(Keys.TAB);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   // objISMSPage.composeIssue_txb.sendKeys(Keys.TAB);
   
}
public void SetCategory(String category){   
   // new Select(objISMSPage.composeCategory_txb).selectByVisibleText(category);       
    objISMSPage.composeCategory_txb.sendKeys(category);
    objISMSPage.composeCategory_txb.sendKeys(Keys.ARROW_DOWN);
    objISMSPage.composeCategory_txb.sendKeys(Keys.ENTER);
}

public void SetProblem(String problem){    
    //new Select(objISMSPage.composeProblem_txb).selectByVisibleText(problem);
    objISMSPage.composeProblem_txb.sendKeys(problem);
}

public void SetsimilarIssue(String similarIssue){    
   // new Select(objISMSPage.similarIssue_txb).selectByVisibleText(similarIssue);
    objISMSPage.similarIssue_txb.sendKeys(similarIssue);
}
public void SetDescrip(String Descrip){    
   // new Select(objISMSPage.descripIssue_txb).selectByVisibleText(Descrip);        
    objISMSPage.descripIssue_txb.sendKeys(Descrip);
}
public void ClickcomposeSend(){    
    objISMSPage.composeSend_btn.click();
}
public void verifyissueBlank(){    
 Assert.assertEquals(objISMSPage.composeIssue_txb.getText(),"");
}
public void verifyCategoryBlank(){    
   Assert.assertEquals(objISMSPage.composeCategory_txb.getText(),"");
  }
public void verifyproblemBlank(){    
   Assert.assertEquals(objISMSPage.composeProblem_txb.getText(), "");
  }
public void verifysimilarIssueBlank(){    
   Assert.assertEquals(objISMSPage.similarIssue_txb.getText(), "");
  }
public void verifyDescripBlank(){    
   Assert.assertEquals(objISMSPage.descripIssue_txb.getText(), "");
  }

public void ComposeISMSReuest(String issue,String category){    
    SetIssue(issue);
   SetCategory(category);
//SetProblem(problem);
//SetsimilarIssue(similarIssue);
// SetDescrip(Descrip);    
   ClickcomposeSend();
//   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//  driver.navigate().refresh();
   //ClickISMSissue();
   System.out.println(objISMSPage.issueNamefirstcol.getText());
   Assert.assertEquals(objISMSPage.issueNamefirstcol.getText(), issue);
}
public void VerrifyISMSIssuesListdisplayedcorrectly(){
    objISMSPage.issuecol.isDisplayed();
    objISMSPage.contacrcol.isDisplayed();
    objISMSPage.projectCol.isDisplayed();
    objISMSPage.priorityCol.isDisplayed();
    objISMSPage.dateCol.isDisplayed();
    objISMSPage.assignCol.isDisplayed();
    objISMSPage.progressCol.isDisplayed();
    objISMSPage.StageCol.isDisplayed();
   
}
public void VerrifyAssetManagedisplayedcorrectly(){
    objISMSPage.assetCatename.isDisplayed();
    objISMSPage.assetparentCategory.isDisplayed();
    objISMSPage.assetSequence.isDisplayed();
    objISMSPage.assetDescrip.isDisplayed();
    Assert.assertEquals(objISMSPage.assetCatename.getText(), "");
    Assert.assertEquals(objISMSPage.assetparentCategory.getText(), "");
    Assert.assertEquals(objISMSPage.assetDescrip.getText(), "");
}
public void VerrifyAssetCompanydisplayedcorrectly(){
    objISMSPage.assetCatename.isDisplayed();
    objISMSPage.assetparentCategory.isDisplayed();
    objISMSPage.assetSequence.isDisplayed();
    objISMSPage.assetDescrip.isDisplayed();
    objISMSPage.AssetpopularIssue.isDisplayed();
    objISMSPage.AssetpopularIssueName.isDisplayed();
    objISMSPage.AssetpopularIssuePriority.isDisplayed();
    objISMSPage.AssetpopularIssueType.isDisplayed();
    
    Assert.assertEquals(objISMSPage.assetCatename.getText(), "");
    Assert.assertEquals(objISMSPage.assetparentCategory.getText(), "");
    Assert.assertEquals(objISMSPage.assetDescrip.getText(), "");
}
public void ClickSaveAsset(){    
    objISMSPage.assetSaveBtn.click();
}
public void ClickassetCreatBtn(){ 
    objISMSPage.assetTitle.click();
    
    objISMSPage.assetCreatBtn.click();
}
public void verifyerrormsg() throws InterruptedException{ 
    WebElement element = driver.findElement(By.cssSelector(".ui-state-error.ui-notify-message.ui-notify-message-style:first-child>ul>li"));
    WebElement element1 = driver.findElement(By.cssSelector(".ui-state-error.ui-notify-message.ui-notify-message-style:first-child>h1"));
    Assert.assertEquals(element.getText(), "Name");
    Assert.assertEquals(element1.getText(), "The following fields are invalid:");
    Thread.sleep(10);
    
}
public void inputAssetName(String Name){    
    objISMSPage.assetCatename.sendKeys(Name);
}
public void createAssetCategories(String user, String pass, String Name) throws InterruptedException{ 
    objLogin.login(user,pass);
    GotoISMSPage();
    ClickAssetCategories(); 
    clickexistCate();   
    inputAssetName(Name);
    ClickSaveAsset();    
}
public String actualName(){    
   return objISMSPage.AssetexpectName.getText();    
}   
public String actualParent(){    
    return objISMSPage.Assetexpectparent.getText();    
 }   
public String actuaSeq(){    
    return objISMSPage.expectSeq.getText();    
 }   
public String actualDes(){    
    return objISMSPage.expectDes.getText();    
 }   
public void clickexistCate(){    
    if(objISMSPage.existCate.getSize()!=null)
        {
        objISMSPage.radioBtn.click();        
        objISMSPage.moreBtn.click();
        objISMSPage.deleteBtn.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        ClickassetCreatBtn();}
    
        else 
            ClickassetCreatBtn();
}

public void clickdeleteBtn(){      
    objISMSPage.deleteBtn.click();
}

public void clickAsset(){      
    objISMSPage.Assets.click();
}
public void createAssetCompany(String user, String pass) throws InterruptedException{ 
    objLogin.login(user,pass);
    GotoISMSPage();
    clickAsset(); 
    ClickassetCreatBtn();
    ClickSaveAsset();    
}
public String getErrTit(){      
    return objISMSPage.errmsgTit.getText();
}
public String geterrmsCont1(){      
    return objISMSPage.errmsCont1.getText();
}
public String geterrmsCont2(){      
    return objISMSPage.errmsCont2.getText();
}
}

