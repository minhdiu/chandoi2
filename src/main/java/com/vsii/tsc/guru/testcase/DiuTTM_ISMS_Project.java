package com.vsii.tsc.guru.testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.pages.DiuTTM_ISMSPage;
import com.vsii.tsc.guru.pages.method.DiuTTM_ISMSMethod;
import com.vsii.tsc.guru.pages.method.DiuTTM_LoginPageMethod;
import com.vsii.tsc.guru.pages.method.DiuTTM_ProjectMethod;
import com.vsii.tsc.guru.testdata.TestData;
import com.vsii.tsc.utility.CommonOperations;
import com.vsii.tsc.utility.TestBase;

public class DiuTTM_ISMS_Project extends TestBase
{
    DiuTTM_LoginPageMethod objLogin; 
    DiuTTM_ISMSMethod objISMS;
    DiuTTM_ProjectMethod objProject;
    @BeforeClass
    public void setupClass() throws NumberFormatException, IOException {
        objLogin = new DiuTTM_LoginPageMethod(TestBase.driver);
        objProject = new DiuTTM_ProjectMethod(TestBase.driver);
        objISMS = new DiuTTM_ISMSMethod(TestBase.driver);
    }

 // @Test(priority = 0, description = "Verify that user can see the issues of a project 1")
    public void TC07() throws IOException {     
        TestBase.methodName = "TC07";       
        objLogin.login("diuttm","1234578");   
        objProject.GotoProjectPage();
        objProject.ExpandProj();
        objProject.ISOProjectPage();
        objProject.Clickissuebtn();
        objProject.VerifyissueofProject();
    }
  //@Test(priority = 1, description = "Verify that user can see the issues of a project 2")
  public void TC08() throws IOException {     
      TestBase.methodName = "TC08";       
      objLogin.login("diuttm","12345678");   
      objProject.GotoProjectPage();
      objProject.clickIssueProjbtn();
      objProject.clickAdvSearchBtn();
      objProject.filterbyProject();
      objProject.clickAdvSearchBtn();
      objProject.clickListView();
  }
 // @Test(priority = 2, description = "Verify that a issue is displayed correctly")
  public void TC09() throws IOException {     
      TestBase.methodName = "TC09";       
      objLogin.login("admin","12345678");   
      objProject.GotoProjectPage();
      objProject.clickIssueProjbtn2();
      objProject.clickIssueTitle1();
      objProject.verifyIssuedisplayCorrectly();
  }
// @Test(priority = 3, description = "Verify that user can classify the severity of the issue.",dataProvider = "ISMSSelectType", dataProviderClass = TestData.class)
  public void TC10(String Level, String Level2) throws IOException {     
      TestBase.methodName = "TC10";       
      objLogin.login("lienlt","12345678");   
      objProject.GotoProjectPage();
      objProject.clickIssueProjbtn2();
      objProject.clickIssueTitle1();
      objProject.clickEditIssue();
      objProject.selectLevel(Level);
      objProject.clickSaveIssueBtn();
      objProject.verifyselectlevelcorrect(Level2);  
      objISMS.logout();
  }
 // @Test(priority = 4, description = "Verify that user can assign a task to a person",dataProvider = "ISMSAssginIssue", dataProviderClass = TestData.class)
  public void TC11(String Assignee, String Assignee2) throws IOException {     
      TestBase.methodName = "TC11";       
      objLogin.login("lienlt","12345678");   
      objProject.GotoProjectPage();
      objProject.clickIssueProjbtn2();
      objProject.clickIssueTitle1();
      objProject.clickEditIssue();
     objProject.inputAssginee(Assignee);
     objProject.clickSaveIssueBtn();
     objProject.verifyselectassigncorrect(Assignee2);           
  }
  //Case nay bi loi nen mac dinh la fail
 //@Test(priority = 5, description = "Verify that user can close the issue")
  public void TC12() throws IOException {     
      TestBase.methodName = "TC12";       
      objLogin.login("lienlt","12345678");   
      objProject.GotoProjectPage();
      objProject.clickIssueProjbtn2();
      objProject.clickIssueTitle1();
      objProject.clickDoneBtn();
      objProject.VerifyTrueResultafterClickDoneOrCancel();
      
  }
//Case nay bi loi nen mac dinh la fail
 //@Test(priority = 6, description = "Verify that user can cancel a issue")
  public void TC13() throws IOException {     
      TestBase.methodName = "TC13";       
      objLogin.login("lienlt","12345678");   
      objProject.GotoProjectPage();
      objProject.clickIssueProjbtn2();
      objProject.clickIssueTitle1();
      objProject.clickCancelIssueBtn();
      objProject.VerifyTrueResultafterClickDoneOrCancel();
  }
//Case nay bi loi nen mac dinh la fail
 //@Test(priority = 6, description = "Verify that user can postpone a request to delete a issue")
  public void TC15() throws IOException {     
      TestBase.methodName = "TC15";       
      objLogin.login("lienlt","12345678");   
      objProject.GotoProjectPage();
      objProject.clickIssueProjbtn2();
      objProject.clickIssueTitle1();
      objProject.clickMoreBtn();
      objProject.selectDelete();
      objProject.clickOKonDeleteIssueAlert();
      objProject.verifyDeleteSuccess();
               
  }
//@Test(priority = 6, description = "Verify that Seach Box works correctly",dataProvider = "ISMSAssginSearch", dataProviderClass = TestData.class)
 public void TC16(String searchCodi, String searchCondition) throws IOException {     
     TestBase.methodName = "TC16";       
     objLogin.login("lienlt","12345678");   
     objProject.GotoProjectPage();
     objProject.clickIssueProjbtn2(); 
     objProject.inputSearchissueCondition(searchCodi);
     objProject.verifySearchTrue(searchCondition);              
 }
 //done@Test(priority = 1, description = "Verify that user can filter the issues according to priority levels")
 public void TC17() throws IOException {     
     TestBase.methodName = "TC17";       
     objLogin.login("lienlt","12345678");   
     objProject.GotoProjectPage();
     objProject.clickIssueProjbtn2();
     objProject.clickAdvSearchBtn();
     objProject.filterbyPriority();
     objProject.verifyFilterbyPriorityCorrectly();

 }
 //@Test(priority = 1, description = "Verify that user can filter to see the issues which he is assigned to ")
 public void TC18() throws IOException {     
     TestBase.methodName = "TC18";       
     objLogin.login("lienlt","12345678");   
     objProject.GotoProjectPage();
     objProject.clickIssueProjbtn2();
     objProject.clickAdvSearchBtn();
     objProject.filterbyMyIssue();//chua verify
 }
//@Test(priority = 1, description = "Verify that user can filter to see the issues which he is assigned to ")
public void TC19() throws IOException {     
    TestBase.methodName = "TC19";       
    objLogin.login("lienlt","12345678");   
    objProject.GotoProjectPage();
    objProject.clickIssueProjbtn2();
    objProject.clickAdvSearchBtn();
    objProject.filterbyStage();
    objProject.VerifyStage();
}
 //@Test(priority = 1, description = "Verify that user can propose the solutions for solving the issue",dataProvider = "LogAnote", dataProviderClass = TestData.class)
 public void TC20(String Note, String expNote) throws IOException {     
     TestBase.methodName = "TC20";       
     objLogin.login("lienlt","12345678");   
     objProject.GotoProjectPage();
     objProject.clickIssueProjbtn2();
     objProject.clickIssueTitle1();
     objProject.clickLogaNote_Btn();
     objProject.InputNoteArea(Note);
     objProject.clickSaveNote_btn();
     objProject.VerifyMakeNoteSucc(expNote);
 }
// @Test(priority = 1, description = "Verify that user can propose the solutions for solving the issue",dataProvider = "approveAnote", dataProviderClass = TestData.class)
 public void TC21(String Note, String expNote) throws IOException {     
     TestBase.methodName = "TC21";       
     objLogin.login("lienlt","12345678");   
     objProject.GotoProjectPage();
     objProject.clickIssueProjbtn2();
     objProject.clickIssueTitle1();
     objProject.clickLogaNote_Btn();
     objProject.InputNoteArea(Note);
     objProject.clickSaveNote_btn();
     objProject.VerifyMakeNoteSucc(expNote);
     objISMS.logout();
 }
@Test(priority = 3, description = "Verify that form Create Task is opened corectly")
public void TC22() throws IOException {     
    TestBase.methodName = "TC22";       
    objLogin.login("diuttm","12345678");   
    objProject.GotoProjectPage();
    objProject.clickIssueProjbtn();
    objProject.clickIssueTitle1();
    objProject.clickEditIssue();
  objProject.clickCreateEditTask_icon();
  objProject.selectCreateEditTasklable();
objProject.VerifyCreateTaskDissplayCorrect();  
}

@Test(priority = 3, description = "Verify that form Create Task is opened corectly")
public void TC27() throws IOException {     
    TestBase.methodName = "TC27";       
    objLogin.login("lienle","12345678");   
    objProject.GotoProjectPage();
    objProject.clickIssueProjbtn();
    objProject.clickIssueTitle1();
    objProject.clickEditIssue();
  objProject.ClickrelationTab();
//  objProject.selectCreateEditTasklable();
//objProject.VerifyCreateTaskDissplayCorrect();  
}
//   @AfterClass
//    public void teardownClass() {
//       objLogin = null;    
//    }
}
