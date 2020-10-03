/**
 * 
 */
package com.ravindra.web.xfire;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ravindra.web.xfire.webobjects.Action;
import com.ravindra.web.xfire.webobjects.Request;
import com.ravindra.web.xfire.webobjects.Response;

/**
 * @author raven
 *
 */
public class CalculatorImplementationTest {

	private CalculatorImplementation impl = new CalculatorImplementation();
	private Request request = new Request();
	
	/**
	 * Test method for {@link com.ravindra.web.xfire.CalculatorImplementation#calculate(com.ravindra.web.xfire.webobjects.Request)}.
	 */
	@Test
	public final void testCalculate_add() {
		request.setAction(Action.ADD);
		request.setInput1(101.0);
		request.setInput2(99.0);
		Response response = impl.calculate(request);
		assertEquals(200.0, response.getResult(), 0.0);
		
	}
	
	@Test
	public final void testCalculate_substract() {
		request.setAction(Action.SUBSTRACT);
		request.setInput1(101.0);
		request.setInput2(99.0);
		Response response = impl.calculate(request);
		assertEquals(2.0, response.getResult(), 0.0);
		
	}
	
	@Test
	public final void testCalculate_multiply() {
		request.setAction(Action.MULTIPLY);
		request.setInput1(1.1);
		request.setInput2(2.2);
		Response response = impl.calculate(request);
		assertEquals(2.42, response.getResult(), 0.001);
		
	}
	
	@Test
	public final void testCalculate_division() {
		request.setAction(Action.DIVIDE);
		request.setInput1(2.2);
		request.setInput2(1.1);
		Response response = impl.calculate(request);
		assertEquals(2.0, response.getResult(), 0.0);
		
	}

}
