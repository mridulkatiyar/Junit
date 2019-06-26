package com.niit.junit;

import org.junit.runner.*;
import org.junit.runner.notification.*;
public class TestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(AnnotationsExample.class);					
		for (Failure failure : result.getFailures()) {							
     System.out.println(failure.toString());					
  }		
  System.out.println("Result=="+result.wasSuccessful());	

	}

}
