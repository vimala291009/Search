package com.springer.test;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty","html:target/cucumber.html"},
					features = "Feature")
public class Runner {
	 public static void main (String [] args)throws Throwable{

	        new Runner();
}
}
