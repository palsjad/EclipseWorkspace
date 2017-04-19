package com.wbl.main;

public class HomePage {

	
	public String doLogin() {
		
		System.out.println("Loginpage :enter yrcredentials\n");
		return "success";
	}
	

	public String doRecording() {
		
		System.out.println("inside recording\n");
		return "recording playing";
	}	
	

	public int doPresentation() {
		
		System.out.println("inside presentation\n");
		return 20;
	}	
	
	public String doLogout() {
		
		System.out.println("Logout page  \n");
		return "success";
	}
	
	
}
