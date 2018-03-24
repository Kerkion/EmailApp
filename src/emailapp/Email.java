package emailapp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private int mailBoxCap;
	private int defaultPasswordLength = 12;

	
	//Constructor
	public Email(String firstName,String lastName) {
		this.firstname = firstName;
		this.lastName = lastName;
		
		this.department = setDepartment();
		System.out.println("You choosed : " + department);
		
		//Call for rand password
		this.password = randomPass(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
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
	
	private String randomPass(int length) {
		String passSet = "ABCDEFGIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i = 0; i < length;i++) {
			int random = (int) (Math.random() * passSet.length());
			password[i] = passSet.charAt(random);
		}
		return new String(password);
	}
	
	//Set mailbox cap
	
	//set alternate e-mail
	
	// change password

	
}
