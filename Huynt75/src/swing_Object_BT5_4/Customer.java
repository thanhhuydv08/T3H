package swing_Object_BT5_4;

public class Customer {
String cardNumber, sName,sAddress,sCountry,sZipcode;

public Customer(String cardNumber, String sName, String sAddress, String sCountry, String sZipcode) {
	super();
	this.cardNumber = cardNumber;
	this.sName = sName;
	this.sAddress = sAddress;
	this.sCountry = sCountry;
	this.sZipcode = sZipcode;
}

public String getCardNumber() {
	return cardNumber;
}

public void setCardNumber(String cardNumber) {
	this.cardNumber = cardNumber;
}

public String getsName() {
	return sName;
}

public void setsName(String sName) {
	this.sName = sName;
}

public String getsAddress() {
	return sAddress;
}

public void setsAddress(String sAddress) {
	this.sAddress = sAddress;
}

public String getsCountry() {
	return sCountry;
}

public void setsCountry(String sCountry) {
	this.sCountry = sCountry;
}

public String getsZipcode() {
	return sZipcode;
}

public void setsZipcode(String sZipcode) {
	this.sZipcode = sZipcode;
}

}
