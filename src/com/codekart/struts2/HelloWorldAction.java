package com.codekart.struts2;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class HelloWorldAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String execute() throws Exception {
		ValueStack stack = ActionContext.getContext().getValueStack();
		Map<String,String> context = new HashMap<String,String>();
		context.put("key1",new String("this is key1"));
		context.put("key2", new String("this is key2"));
		stack.push(context);
		return "success";
	}
	
	public void validate() {
		if(name==null || name.trim().equals(""))
			addFieldError("name", "stupid.. give ur name in text field..");
	}
}
