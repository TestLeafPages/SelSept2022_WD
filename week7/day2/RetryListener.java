package week5.day1testcase;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IListenersAnnotation;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer{
	
   public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	   annotation.setRetryAnalyzer(week5.day1testcase.RetryFailedTests.class);

}

}
