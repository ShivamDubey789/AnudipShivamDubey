package aug21;

public class Address {
	
	

	


	String city;
	String state;
	int pincode;
	
	
	public Address(String city, String state, int pincode) {
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}


	public Address() {};
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}
