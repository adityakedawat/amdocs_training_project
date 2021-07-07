package Models;

public class Users {
	
	private String name;
	private String registrationDate;
	private String address;
	private String password;
	private String email;
	private Long phone;
	private String imageUrl;
	private int userId;
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", name=" + name + ", registrationDate=" + registrationDate + ", address="
				+ address + ", password=" + password + ", email=" + email + ", phone=" + phone + ", imageUrl="
				+ imageUrl + "]";
	}
	public Users(int userId, String name, String registrationDate, String address, String password, String email,
			Long phone, String imageUrl) {
		super();
		this.userId = userId;
		this.name = name;
		this.registrationDate = registrationDate;
		this.address = address;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.imageUrl = imageUrl;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
