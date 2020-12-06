package STRATEGY_DESIGN_PATTERN_1;

public class PaypalPaymentMethod implements PaymentMethod {

	String name;
	String email;
	String password;
	
	public PaypalPaymentMethod(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	@Override
	public void paymentMethod(int amount) {
		System.out.println("Amount payment via paypal : " + amount);

	}

}
