package com.niit.mockito;

public class Bar {
	public String greet(Demo d) {
        System.out.println("Bar invokes Demo.greet");
        return d.greet();
    }
}
