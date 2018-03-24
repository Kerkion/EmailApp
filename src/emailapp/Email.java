package emailapp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private int mailBoxCap;

	
	//Constructor
	public Email(String firstName,String lastName) {
		this.firstname = firstName;
		this.lastName = lastName;
		
		this.department = setDepartment();
		System.out.println("You choosed : " + department);
	}
	
	//Ask for department
	
	private String setDepartment() {
		
		System.out.println("CODE FOR DEPARTMENTS\n1 Sales\n2 Accounting\n3 Services\n4 Development\n0 for none\n Pick your department : ");
		Scanner s = new Scanner(System.in);
		int code = s.nextInt();
		if(code == 1) {return "sales";}
		else if(code == 2) {return "acc";}
		else if(code == 3) {return "serv";}
		else if(code == 4) {return "dev";}
		else {return "";}
	}
		
	
	
	
	
	//Generate random password
	
	//Set mailbox cap
	
	//set alternate e-mail
	
	// change password

	
}
