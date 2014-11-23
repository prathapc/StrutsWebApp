package com.codekart.struts2;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyCustomInterceptor implements Interceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("CustomInterceptor destroy() is called...");
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("CustomInterceptor init() is called...");
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("CustomInterceptor, before invocation.invoke()...");
		 
		String result = invocation.invoke();
 
		System.out.println("CustomInterceptor, after invocation.invoke()...");
 
		return result;
	}

	

}
