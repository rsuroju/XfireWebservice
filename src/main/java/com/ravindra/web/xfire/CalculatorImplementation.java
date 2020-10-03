package com.ravindra.web.xfire;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.ravindra.web.xfire.webobjects.Action;
import com.ravindra.web.xfire.webobjects.Request;
import com.ravindra.web.xfire.webobjects.Response;

@WebService(endpointInterface = "com.ravindra.web.xfire.CalculatorInterface", serviceName = "CalculatorService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class CalculatorImplementation implements CalculatorInterface {

	public static void main(String[] args) {

	}

	public Response calculate(Request request) {
		Response response = new Response();
		double result = 0.0;
		response.setSuccess(true);
		Action action = request.getAction();
		if (null != action) {
			switch (action) {
			case ADD:
				result = request.getInput1() + request.getInput2();
				break;
			case SUBSTRACT:
				result = request.getInput1() - request.getInput2();
				break;
			case MULTIPLY:
				result = request.getInput1() * request.getInput2();
				break;
			case DIVIDE:
				result = request.getInput1() / request.getInput2();
			}
		} else {
			response.setSuccess(false);
			response.setErrorMessage("Action is a required filed");
		}
		response.setResult(result);
		return response;
	}

}
