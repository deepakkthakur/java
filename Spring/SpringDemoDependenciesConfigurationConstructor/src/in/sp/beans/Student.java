package in.sp.beans;

public class Student {
	 private String name;
	 private int rollNo;
	 private Address address;
	 
	public Student(String name,int rollNo,Address address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.rollNo = rollNo;
		this.address = address; 
	}

	public void display() {
		System.out.println("Name : "+name);
		System.out.println("roll No : "+rollNo);
		System.out.println("Address : "+address);
	}
}
