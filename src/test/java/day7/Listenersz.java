package day7;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenersz implements ITestListener 
{
	public void onTestStart(ITestResult result)
	{
		System.out.println("on start.........");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("on test sucess........");
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("on test failure.......");
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("on test skipped.......");
	}
	public void onFinish(ITestContext context)
	{
		 System.out.println("on finish............");
	}
	
	
	
	
	
	
	
	
	
	
	
}
