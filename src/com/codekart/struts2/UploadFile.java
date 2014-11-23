package com.codekart.struts2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class UploadFile extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File myFile;
	private String myFileContentType;
	private String myFileFileName;
	private String dstPath;
	
	public String execute() {
		dstPath = "E:/Installations/apache-tomcat-8.0.9/work/";
		
		try{
	     	 System.out.println("Src File name: " + myFile);
	     	 System.out.println("Dst File name: " + myFileFileName);
	     	    	 
	     	 File destFile  = new File(dstPath, myFileFileName);
	    	 FileUtils.copyFile(myFile, destFile);
	  
	      }catch(IOException e){
	         e.printStackTrace();
	         return ERROR;
	      }
	      return SUCCESS;
	}

	public File getMyFile() {
		return myFile;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public String getMyFileContentType() {
		return myFileContentType;
	}

	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}

	public String getMyFileFileName() {
		return myFileFileName;
	}

	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}

	public String getDstPath() {
		return dstPath;
	}

	public void setDstPath(String dstPath) {
		this.dstPath = dstPath;
	}
	
	
}
