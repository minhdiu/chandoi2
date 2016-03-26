package com.vsii.tsc.guru.pages.method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.vsii.tsc.guru.pages.DiuTTM_ISMSPage;
import com.vsii.tsc.guru.pages.DiuTTM_ProjectPage;
import com.vsii.tsc.utility.TestBase;

public class DiuTTM_ProjectMethod
{    
    
    WebDriver driver;    
    public DiuTTM_ProjectPage ObjecProject = new DiuTTM_ProjectPage();

    public DiuTTM_ProjectMethod(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, ObjecProject);      
    }  
    
public void GotoProjectPage(){
    ObjecProject.Project_btn.click();
}
public void clickIssueProjbtn(){
    ObjecProject.issue_btn.click();
}
public void clickAdvSearchBtn(){
    ObjecProject.advSearchBtn.click();
}
public void filterbyProject(){
    ObjecProject.filterbyProject.click();
}
public void filterbyPriority(){
    ObjecProject.filterbyPriority.click();
}

public void clickListView(){
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    ObjecProject.listviewBtn.click();
}
public void ExpandProj(){
    ObjecProject.projectGroup.click();
}
public void ISOProjectPage(){
    ObjecProject.ISOproject.click();
}
public void Clickissuebtn(){
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    ObjecProject.issueISO.click();
}
public void clickIssueProjbtn2(){
    ObjecProject.adIssueBtn.click();
}
public void clickIssueTitle1(){
    ObjecProject.Issuetitle1.click();
}
 
public void verifyIssuedisplayCorrectly(){
Assert.assertEquals(ObjecProject.ID.getText(), "ID");
Assert.assertEquals(ObjecProject.asignto.getText(), "Assigned to");
Assert.assertEquals(ObjecProject.contact.getText(), "Contact");
Assert.assertEquals(ObjecProject.email.getText(), "Email");
Assert.assertEquals(ObjecProject.project.getText(), "Project");
Assert.assertEquals(ObjecProject.priority.getText(), "Priority");
Assert.assertEquals(ObjecProject.level.getText(), "Level");
Assert.assertEquals(ObjecProject.type.getText(), "Type");
Assert.assertEquals(ObjecProject.descriptionTab.getText(), "Description");
Assert.assertEquals(ObjecProject.worklogTab.getText(), "Worklogs");
Assert.assertEquals(ObjecProject.extraInfoTab.getText(), "Extra Info");
Assert.assertEquals(ObjecProject.relationTab.getText(), "Relations");
Assert.assertEquals(ObjecProject.relatedTaskTab.getText(), "Related Tasks");}

public void VerifyissueofProject(){
    ObjecProject.taomoiCol.isDisplayed();
    ObjecProject.xulyCol.isDisplayed();
    ObjecProject.kiemtraCol.isDisplayed();
    ObjecProject.dongCol.isDisplayed();
    ObjecProject.huyboCol.isDisplayed();  
}
public void clickEditIssue(){
    
    //new Actions(driver).moveToElement(ObjecProject.editIssue_btn).click().perform();
    //ObjecProject.adIssueBtn();

    //ObjecProject.adIssueBtn.sendKeys(Keys.TAB);

//  ObjecProject.editIssue_btn.click();
//ObjecProject.issueLink.sendKeys(Keys.TAB);
//ObjecProject.issueLink.sendKeys(Keys.TAB);


//    ObjecProject.editIssue_btn.sendKeys(Keys.RETURN);
 // Actions action = new Actions(driver);
//    action.moveToElement(ObjecProject.editIssue_btn).doubleClick().build().perform();
//driver.findElement(By.xpath="//div/button[@class='oe_button oe_form_button_edit']");
//JavascriptExecutor jse = (JavascriptExecutor) driver;
//jse.executeScript("document.getElementByxpath('//div/button[@class='oe_button oe_form_button_edit']').focus())");
//ObjecProject.editIssue_btn.click();
//WebDriver driver = new FirefoxDriver();
//JavascriptExecutor jse = (JavascriptExecutor) driver;
//jse.executeScript("document.getElementById('elementid').focus();");
TestBase.driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[4]/div/div[4]/div/div/div[1]/div/h1/span/span")).click();
WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.oe_button.oe_form_button_edit")));
myDynamicElement.click();
//action.moveToElement(ObjecProject.editIssue_btn).clickAndHold();
}
public void selectLevel(String level){
	new Select(ObjecProject.type_level).selectByVisibleText(level);  	
}
public void verifyselectlevelcorrect(String level2){
    TestBase.driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[4]/div/div[4]/div/div/div[1]/div/h1/span/span")).click();
	Assert.assertEquals(ObjecProject.expectedLevel.getText(),level2);
}
public void inputAssginee(String Assignee){
    Actions action = new Actions(driver);
    action.moveToElement(ObjecProject.assignto_txb).doubleClick().build().perform();
    action.moveToElement(ObjecProject.assignto_txb).doubleClick().build().perform();
    ObjecProject.assignto_txb.clear();
	ObjecProject.assignto_txb.sendKeys(Assignee);
	ObjecProject.assignto_txb.sendKeys(Keys.ARROW_DOWN);
	ObjecProject.assignto_txb.sendKeys(Keys.ENTER);
}
public void verifyselectassigncorrect(String Assignee2){
	Assert.assertEquals(ObjecProject.expectAssignee.getText(),Assignee2);
}
public void clickSaveIssueBtn(){
	ObjecProject.saveIssuebtn.click();
}
public void clickDoneBtn(){
    TestBase.driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[4]/div/div[4]/div/div/div[1]/div/h1/span/span")).click();
	ObjecProject.DoneBtn.click();
}
public void clickCancelIssueBtn(){
    TestBase.driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[4]/div/div[4]/div/div/div[1]/div/h1/span/span")).click();
	ObjecProject.cancelIssueBtn.click();
}
public void clickMoreBtn(){
    TestBase.driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[4]/div/div[4]/div/div/div[1]/div/h1/span/span")).click();
	ObjecProject.moreBtn.click();
}
public void selectDelete(){
	ObjecProject.deleteIsueBtn.click();
}
public void clickOKonDeleteIssueAlert(){
    Alert alert = driver.switchTo().alert();
    alert.accept();
}
public void verifyDeleteSuccess(){
    Assert.assertEquals(ObjecProject.Issuetitle2.getText(), "Issues");
}

public void inputSearchissueCondition(String searchCodi){
//    WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[1]/td[2]/div/div/div[1]")));
//    myDynamicElement.click();
   // new Actions(driver).moveToElement(ObjecProject.searchIssue_Txb).perform();
//    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//    ObjecProject.searchIssue_Txb.sendKeys(Keys.TAB);

    ObjecProject.searchIssue_Txb.sendKeys(searchCodi);
    ObjecProject.searchIssue_Txb.sendKeys(Keys.ENTER);
}
public void verifyFilterbyPriorityCorrectly(){
    Assert.assertEquals(ObjecProject.normalPriority.getText(),"Normal");
    Assert.assertEquals(ObjecProject.highPriority.getText(),"High");
    Assert.assertEquals(ObjecProject.lowPriority.getText(),"Low");
}
public void filterbyMyIssue(){
    ObjecProject.myIssue.click();}

public void filterbyStage(){
    ObjecProject.filter_Stage.click();}

public void verifySearchTrue(String searchCondition){
    Assert.assertTrue(ObjecProject.searchTitleResult.getText().contains(searchCondition));
}
public void clickLogaNote_Btn(){
    TestBase.driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[4]/div/div[4]/div/div/div[1]/div/h1/span/span")).click();
    ObjecProject.logAnote.click();
}
public void InputNoteArea(String Note){
    ObjecProject.logAnoteTextArea.sendKeys(Note);
}
public void clickSaveNote_btn(){
    ObjecProject.logNote_Btn.click();
}

public void VerifyTrueResultafterClickDoneOrCancel(){
    Assert.assertEquals(ObjecProject.Issuetitle2.getText(), "Issues");
}
public void VerifyMakeNoteSucc(String expNote){ 
    //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    Assert.assertEquals(ObjecProject.expect_noteTile.getText(), expNote);
}
public void VerifyStage(){
    ObjecProject.Filter_taomoiCol.isDisplayed();
    ObjecProject.Filter_xulyCol.isDisplayed();
    ObjecProject.Filter_kiemtraCol.isDisplayed();
    ObjecProject.Filter_dongCol.isDisplayed();
    ObjecProject.Filter_newCol.isDisplayed();
}
public void clickCreateEditTask_icon(){ 
    ObjecProject.CreateEditTask_icon.click();    
}
public void selectCreateEditTasklable(){ 
    ObjecProject.CreateEditTasklable.click();    
}
public void VerifyCreateTaskDissplayCorrect(){
    ObjecProject.Task_Title.click();
    ObjecProject.Task_Sumary.isDisplayed();
    ObjecProject.Task_ProjectDrop.isDisplayed();
   
    ObjecProject.Task_AssigntoDrop.isDisplayed();

    ObjecProject.Task_TypeDrop.isDisplayed();

  ObjecProject.Task_IsbillDrop.isDisplayed();

  ObjecProject.Task_ProjPhaseDrop.isDisplayed();
    ObjecProject.Task_InitiTxb.isDisplayed();
    ObjecProject.Task_deadLineTxb.isDisplayed();
    ObjecProject.Task_Tags.isDisplayed();
    ObjecProject.Task_Progress.isDisplayed();
    ObjecProject.Task_DescripTab.isDisplayed();
    ObjecProject.Task_DeligationTab.isDisplayed();
    ObjecProject.Task_ExtraInfoTab.isDisplayed();
    ObjecProject.Task_RelatedTab.isDisplayed();

}
public void ClickrelationTab(){ 
    ObjecProject.relationTab.click();    
}

}
