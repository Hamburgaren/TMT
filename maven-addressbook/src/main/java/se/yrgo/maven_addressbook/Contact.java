package se.yrgo.maven_addressbook;

public class Contact extends Person {
	
	private String address;
	private int phoneNumber;
	private String email;
	
	public Contact(String firstname, String lastname, int age, String address, int phoneNumber, String email) {
		super(); 		// TODO: call superclass constructor with super(firstname, lastname, age);
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
}