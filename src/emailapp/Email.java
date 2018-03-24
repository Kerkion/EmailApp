package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private String email;
	private String comSuffix = "company.com";
	private int mailboxCap = 300;
	private int defaultPasswordLength = 12;

	
	//Constructor
	public Email(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.department = setDepartment();
		System.out.println("You choosed department : " + department);
		
		//Call for rand password
		this.password = randomPass(defaultPasswordLength);
		//System.out.println("Your password is: " + this.password);
		
		//Combine fname,lname,and department to create email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + comSuffix;
		//System.out.println("Your email is: " + email);
		
		showInfo();
	}
	
	//Ask for department
	
	private String setDepartment() {
		
		System.out.println("CODE FOR DEPARTMENTS\n1 Sales\n2 Accounting\n3 Services\n4 Development\n0 for none\n Pick your department : ");
		Scanner s = new Scanner(System.in);
		int code = s.nextInt();
		if(code == 1) {return "sales";}
		else if(code == 2) {return "accounting";}
		else if(code == 3) {return "services";}
		else if(code == 4) {return "development";}
		else {return "no department";}
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
	
	public void setMailboxCap(int capacity) {
		this.mailboxCap = mailboxCap;
	}
	
	//set alternate e-mail
	
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	// change password
	public void ChangePassword(String password) {
		this.password = password;
	}
	//Geters
	public int getMailcoxCapacity() {return mailboxCap;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "Display Name: " + firstName + " " + lastName + "\nEmail : " + email + "\nMailboxCapacity is: " + mailboxCap + "mb";
	}
	
}
