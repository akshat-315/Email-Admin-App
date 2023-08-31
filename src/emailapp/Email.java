package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String companySuffix = "xyzcompany.com";
	private int defaultPasswordLength = 10;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	
	//Constructor to receive the first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created : " +this.firstName+" "+this.lastName);	
		
		//call a method asking for the department and return the department
		this.department = setDepartment();
		System.out.println("Department : " +this.department);
		
		//call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Password : " +this.password);
		
		//combine elements to generate email
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.println("Your Email is : " +email);
	}
	
	//Ask for Department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES\n0 for none\n1 for Sales\n2 for Development\n3 for Accounting\nEnter Department Code:  ");
		Scanner sc = new Scanner(System.in);
		int deptChoice = sc.nextInt();
		
		if(deptChoice == 1) return "Sales";
		else if(deptChoice == 2) return "Development";
		else if(deptChoice == 3) return "Accounting";
		else return "none";
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ012346789!@#$%";
		char[] password = new char[length];
		for(int i = 0; i<length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
}
