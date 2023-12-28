package com.actitime.testscript;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test(groups = "smokeTest")
	public void createCustomer() {
		Reporter.log("createCustomer",true);}
	@Test(groups = {"regressionTest","smokeTest"})
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);}
	@Test(dependsOnMethods = "createCustomer")
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);}
}
/*
 * @Listeners annotation should be declared in every Test class which is used to monitor the test
 * execution in runtime(Else the test classes will not be monitored).It will take fully qualified
 * name of the class along with .class has extension
 * 
 * The execution of the test method will be monitored by Listener and that execution result will 
 * be sent to the implementing class with the help of annotation
 *
 * 
 * 
 */



