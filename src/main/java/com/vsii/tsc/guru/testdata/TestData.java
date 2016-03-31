package com.vsii.tsc.guru.testdata;

import org.testng.annotations.DataProvider;
import com.vsii.tsc.utility.ExcelHandle;;

public class TestData {
	@DataProvider(name="Adminlogin")
	public static Object[][] getLoginValid() {
		Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "Login", "TC02");
		return data;
	}
	
	@DataProvider(name="notAdminlogin")
    public static Object[][] getLoginnotAdmin() {
        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "Login", "TC03");
        return data;
    }
	@DataProvider(name="ISMSSelectType")
    public static Object[][] ISMSSelectType() {
        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "ISMSType", "TC10");
        return data;
    }
	@DataProvider(name = "ISMSAssginIssue")
	public static Object[][] getValidateCustomerData() {
		Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "ISMSType", "TC11");
		return data;
	}
	@DataProvider(name="ISMSAssginSearch")
    public static Object[][]  ISMSAssginSearch() {
        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "ISMSType", "TC16");
        return data;
    }
	@DataProvider(name="LogAnote")
    public static Object[][]  LogAnote() {
        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "ISMSType", "TC20");
        return data;}
        @DataProvider(name="approveAnote")
        public static Object[][]  approveAnote() {
            Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "ISMSType", "TC21");
            return data;
    }
	
	@DataProvider(name="loginTask")
	public static Object[][]  loginTask() {
		Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "ISMSType", "TC28");
		return data;
	}
	@DataProvider(name="createATask")
    public static Object[][]  createATask() {
        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "CreateTask", "TC30");
        return data;
    }
	@DataProvider(name="phantich")
    public static Object[][]  phantich() {
        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "CreateTask", "TC32");
        return data;
    }
	@DataProvider(name="giaiphap")
    public static Object[][]  giaiphap() {
        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "CreateTask", "TC33");
        return data;
    }
	   @DataProvider(name="duyet")
	    public static Object[][]  duyet() {
	        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "CreateTask", "TC34");
	        return data;
	    }
	@DataProvider(name = "kiemtra1")
	public static Object[][] kiemtra1() {
		Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "CreateTask", "TC36");
		return data;
	}
	@DataProvider(name = "Asset Categories")
    public static Object[][] AssetCategories() {
        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "Login", "TC38");
        return data;
    }
	@DataProvider(name = "Asset Categories 1")
    public static Object[][] AssetCategories1() {
        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "Login", "TC39");
        return data;
    }
	@DataProvider(name = "Create Asset Categories")
    public static Object[][] CreateAssetCategories() {
        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "Login", "TC40");
        return data;
    }
	@DataProvider(name = "Create Asset Company")
    public static Object[][] CreateAssetCompany() {
        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "Login", "TC41");
        return data;
    }
	@DataProvider(name = "Create Asset Company 2")
    public static Object[][] CreateAssetCompany2() {
        Object[][] data = ExcelHandle.getTable("./data/ISMS_TestData.xlsx", "Login", "TC42");
        return data;
    }
}
