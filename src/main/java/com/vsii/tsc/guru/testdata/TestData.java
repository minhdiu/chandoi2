package com.vsii.tsc.guru.testdata;

import org.testng.annotations.DataProvider;
import com.vsii.tsc.utility.ExcelHandle;;

public class TestData {
	@DataProvider(name="Adminlogin")
	public static Object[][] getLoginValid() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Login", "TC02");
		return data;
	}
	
	@DataProvider(name="notAdminlogin")
    public static Object[][] getLoginnotAdmin() {
        Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "Login", "TC03");
        return data;
    }
	@DataProvider(name="ISMSSelectType")
    public static Object[][] ISMSSelectType() {
        Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "ISMSType", "TC10");
        return data;
    }
	@DataProvider(name = "ISMSAssginIssue")
	public static Object[][] getValidateCustomerData() {
		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "ISMSType", "TC11");
		return data;
	}
	@DataProvider(name="ISMSAssginSearch")
    public static Object[][]  ISMSAssginSearch() {
        Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "ISMSType", "TC16");
        return data;
    }
	@DataProvider(name="LogAnote")
    public static Object[][]  LogAnote() {
        Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "ISMSType", "TC20");
        return data;}
        @DataProvider(name="approveAnote")
        public static Object[][]  approveAnote() {
            Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "ISMSType", "TC21");
            return data;
    }
//	
//	@DataProvider(name="dpNewCustomer")
//	public static Object[][]  getCustomerData() {
//		Object[][] data = ExcelHandle.getTable("./data/TestData.xlsx", "CreateNewCustomer", "CN03");
//		return data;
//	}

//	@DataProvider(name = "dpEditCustomer")
//	public static Object[][] editCustomerData() {
//		Object[][] data = Utility.getTable("./data/TestData.xlsx", "EditCustomer", "ED03");
//		return data;
//	}
	
	
}
