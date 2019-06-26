package com.niit.mockito;
import static com.niit.mockito.Demo.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class MockitoHelloWorld1 {
private Demo d;

@Before
public void setupMock() {       
    d = mock(Demo.class);
    when(d.greet()).thenReturn(HELLO_WORLD);
}

@Test
public void fooGreets() {
    System.out.println("Demo greets: " + d.greet());
    assertEquals("Hello World", d.greet());
}
@Test
public void barGreets() {
    Bar bar = new Bar();
    assertEquals("Hello World", bar.greet(d));
}
	

}
