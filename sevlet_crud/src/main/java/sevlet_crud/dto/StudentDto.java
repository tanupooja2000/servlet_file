package sevlet_crud.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDto {
 
	@Id
	private int id;
	private String name;
	private String email;
	private long phone_no;
	private String dob;
	private String gender;
	private String country;
	private String account;
	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", email=" + email + ", phone_no=" + phone_no + ", dob="
				+ dob + ", gender=" + gender + ", country=" + country + ", account=" + account + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
}
