package in.sp.beans;

public class Address {
	private int houseNo;
	private String city;
	private int pincode;

	public Address(int houseNo,String city,int pincode) {
		// TODO Auto-generated constructor stub
		this.houseNo = houseNo;
		this.city = city;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nHouse No : "+ houseNo + "\nCity : "+ city +"\npin code : "+pincode;
	}
}
