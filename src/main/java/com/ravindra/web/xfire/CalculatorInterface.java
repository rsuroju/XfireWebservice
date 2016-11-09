package com.ravindra.web.xfire;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.ravindra.web.xfire.webobjects.Request;
import com.ravindra.web.xfire.webobjects.Response;

@WebService(name = "CalculatorService", targetNamespace = "webobjects.xfire.web.ravindra.com")
public interface CalculatorInterface {

	@WebMethod
	public Response calculate(@WebParam(name = "request") Request request) throws Exception;

}
