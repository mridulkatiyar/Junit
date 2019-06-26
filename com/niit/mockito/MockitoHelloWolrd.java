package com.niit.mockito;
import static com.niit.mockito.Demo.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class MockitoHelloWolrd {
	@Test
	public void demoGreets() {
        Demo d = mock(Demo.class); // Create mock demo object
        when(d.greet()).thenReturn(HELLO_WORLD); // Add Behaviour
        System.out.println("Demo greets: " + d.greet());
        assertEquals(d.greet(), HELLO_WORLD);
    }

}
