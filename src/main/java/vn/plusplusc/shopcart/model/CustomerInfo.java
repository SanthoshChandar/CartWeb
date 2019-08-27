package vn.plusplusc.shopcart.model;

import java.io.Serializable;

public class CustomerInfo implements Serializable {
	 
    private String name;
    private String address;
    private String email;
    private String phone;
    
    private boolean valid;
 
 
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
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public boolean isValid() {
        return valid;
    }
 
    public void setValid(boolean valid) {
        this.valid = valid;
    }

	@Override
	public String toString() {
		return "CustomerInfo [name=" + name + ", address=" + address + ", email=" + email + ", phone=" + phone
				+ ", valid=" + valid + "]";
	}
 

}