package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiuTTM_ProjectPage
{   @FindBy(xpath = "//*[contains(text(),'Project')]")
    public WebElement Project_btn;

    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[1]/div[1]/div[2]/ul[1]/li[4]/a/span")
    public WebElement issue_btn;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody[1]/tr/th/span[1]")
    public WebElement projectGroup;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[1]/td[2]/div/div/div[3]")
    public WebElement advSearchBtn;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody[2]/tr[6]/td[3]")
    public WebElement ISOproject;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/div[2]/button[5]/span")
    public WebElement issueISO;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div[3]/div/div[2]")
    public WebElement Filter_newCol;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div[3]/div/div[2]")
    public WebElement Filter_taomoiCol;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div[3]/div/div[2]")
    public WebElement Filter_xulyCol;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[1]/td[4]/div/div[3]/div/div[2]")
    public WebElement Filter_kiemtraCol;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[1]/td[5]/div/div[3]/div/div[2]")
    public WebElement Filter_dongCol;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div[3]/div/div[2]")
    public WebElement taomoiCol;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div[3]/div/div[2]")
    public WebElement xulyCol;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div[3]/div/div[2]")
    public WebElement kiemtraCol;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[1]/td[4]/div/div[3]/div/div[2]")
    public WebElement dongCol;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/div/table/tbody/tr[1]/td[5]/div/div[3]/div/div[2]")
    public WebElement huyboCol;      
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[1]/td[2]/div/div/div[4]/div[1]/div[2]/ul/li[3]")
    public WebElement filterbyProject;
    @FindBy(xpath = " html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[1]/td[2]/div/div/div[4]/div[1]/div[2]/ul/li[5]")
    public WebElement filterbyPriority;
   
    @FindBy(xpath = "//table/tbody/tr[2]/td[3]/ul/li[2]")
    public WebElement listviewBtn;
 
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[1]/div[1]/div[3]/ul[1]/li[6]/a/span")
    public WebElement adIssueBtn;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div[2]/div[1]/div/div[2]/div[1]/b")
    public WebElement Issuetitle1;
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[1]/td[1]/h2/span/span[2]")
    public WebElement Issuetitle2;
    @FindBy(xpath = " //table/tbody/tr/td[1]/table/tbody/tr[1]/td[1]/label")
    public WebElement asignto;
    @FindBy(xpath = " //table/tbody/tr/td[1]/table/tbody/tr[2]/td[1]/label")
    public WebElement contact;
    @FindBy(xpath = " //table/tbody/tr/td[1]/table/tbody/tr[3]/td[1]/label")
    public WebElement email;
    @FindBy(xpath = " //table/tbody/tr/td[1]/table/tbody/tr[4]/td[1]/label")
    public WebElement project;
    @FindBy(xpath = "//table/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/label")
    public WebElement ID;
    @FindBy(xpath = " //table/tbody/tr/td[2]/table/tbody/tr[3]/td[1]/label")
    public WebElement priority;
    @FindBy(xpath = " //table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/label")
    public WebElement level;
    @FindBy(xpath = " //table/tbody/tr/td[2]/table/tbody/tr[5]/td[1]/label")
    public WebElement type;
    @FindBy(xpath = "//table/tbody/tr/td[2]/table/tbody/tr[6]/td[1]/label")
    public WebElement task;
    @FindBy(css = "button.oe_button.oe_form_button_edit")
    public WebElement editIssue_btn;
    @FindBy(xpath = "(//a[@class='ui-tabs-anchor'])[1]")
    public WebElement descriptionTab;
    @FindBy(xpath = "(//a[@class='ui-tabs-anchor'])[2]")
    public WebElement worklogTab;
    @FindBy(xpath = "(//a[@class='ui-tabs-anchor'])[3]")
    public WebElement extraInfoTab;
    @FindBy(xpath = "(//a[@class='ui-tabs-anchor'])[4]")
    public WebElement relationTab;
    @FindBy(xpath = "(//a[@class='ui-tabs-anchor'])[5]")
    public WebElement relatedTaskTab;
    @FindBy(xpath = "//table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/span/select")
    public WebElement type_level;
    @FindBy(xpath = "//table/tbody/tr[4]/td[2]/span[@class='oe_form_field oe_form_field_selection'][1]")
    public WebElement expectedLevel;    
    @FindBy(xpath = ".//*[@class='oe_form_field oe_form_field_many2one oe_form_field_with_button']/div/input")
    public WebElement assignto_txb; 
    @FindBy(xpath = " html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div[2]/span[2]/button")
    public WebElement saveIssuebtn; 
    
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[4]/div/div[4]/div/div/header/button[4]")
    public WebElement DoneBtn; 

    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[4]/div/div[4]/div/div/header/button[5]")
    public WebElement cancelIssueBtn;

    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[2]/div/div/div/div[2]/button")
    public WebElement moreBtn;
    @FindBy(xpath = " html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[2]/div/div/div/div[2]/ul/li[3]/a")
    public WebElement deleteIsueBtn;

    @FindBy(xpath = " html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[1]/td[1]/h2/span/a")
    public WebElement issueLink;
   
    @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[1]/td[2]/div/div/div[1]/div[@class='oe_searchview_input']")
    public WebElement searchIssue_Txb;
    @FindBy(xpath = "//table/tbody/tr[1]/td[2]/div/div/div[4]/div[1]/div[2]/ul/li[6]")
    public WebElement filter_Stage;
  
  
   @FindBy(xpath = " html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div[3]/div/div[2]")
    public WebElement normalPriority;
   @FindBy(xpath = "  html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div[3]/div/div[2]")
   public WebElement highPriority;
   @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div[3]/div/div[2]")
   public WebElement lowPriority;

   @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[1]/td[2]/div/div/div[4]/div[1]/div[1]/ul[4]/li")
   public WebElement myIssue;
   @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div[2]/div/div/div[2]/div[1]/b")
   public WebElement searchTitleResult;
   @FindBy(xpath = "//div//a[@class='oe_compose_log']")
   public WebElement logAnote;
   @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/textarea")
   public WebElement logAnoteTextArea;
   @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[4]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/span/a[@class='oe_form_uri']")
   public WebElement expectAssignee;
   @FindBy(xpath = " //button[@class='oe_post']")
   public WebElement logNote_Btn;
  
   @FindBy(xpath = "(//div[@class='oe_msg_body']/p)[1]")
   public WebElement expect_noteTile;   
   @FindBy(xpath = "//table/tbody/tr/td[2]/table/tbody/tr[6]/td[2]/div/span[1]/div/span[2]/img")
   public WebElement CreateEditTask_icon; 
   @FindBy(xpath = ".//*[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all openerp']/li/a")
   public WebElement CreateEditTasklable; 
   @FindBy(xpath = "//input[@placeholder='Task summary...']")
   public WebElement Task_Sumary; 

   @FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[4]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/span/div/input")
   public WebElement Task_ProjectDrop; 
   
   @FindBy(xpath = "html/body/div[6]/div[2]/div/div/div[3]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/span/div/span[2]")
   public WebElement Task_AssigntoDrop; 
   
   @FindBy(xpath = "html/body/div[6]/div[2]/div/div/div[3]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[4]/td[2]/span/div/input")
   public WebElement Task_TypeDrop; 
   
   @FindBy(xpath = "//*[@class='field_boolean']")
   public WebElement Task_IsbillDrop; 
   
   @FindBy(xpath = "html/body/div[6]/div[2]/div/div/div[3]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[6]/td[2]/span/div/input")
   public WebElement Task_ProjPhaseDrop; 
   
   @FindBy(xpath = "//span[@class='oe_form_field oe_form_field_float']/input")
   public WebElement Task_InitiTxb; 
   
   @FindBy(xpath = "//input[@class='oe_datepicker_master']")
   public WebElement Task_deadLineTxb; 
   
   @FindBy(xpath = "html/body/div[6]/div[2]/div/div/div[3]/div/div/div[1]/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/div/div/div/div[1]")
   public WebElement Task_Tags; 
   
   @FindBy(xpath = "//span[@class='oe_form_field oe_form_field_progressbar ui-progressbar ui-widget ui-widget-content ui-corner-all']")
   public WebElement Task_Progress; 
   @FindBy(xpath = "(.//*[@class='ui-tabs-anchor'])[1]")
   public WebElement Task_DescripTab;
   @FindBy(xpath = "(.//*[@class='ui-tabs-anchor'])[2]")
   public WebElement Task_DeligationTab;
   @FindBy(xpath = "(.//*[@class='ui-tabs-anchor'])[3]")
   public WebElement Task_ExtraInfoTab;
   @FindBy(xpath = "(.//*[@class='ui-tabs-anchor'])[4]")
   public WebElement Task_RelatedTab;
   @FindBy(xpath = "//*[@class='ui-dialog-title']")
   public WebElement Task_Title;
   @FindBy(xpath = "//*[@class='ui-dialog-title']")
   public WebElement Task_Title;
 //table/thead/tr[1]/th/div[1]/button[1]
   
   
}
