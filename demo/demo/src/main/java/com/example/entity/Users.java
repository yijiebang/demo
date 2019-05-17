package com.example.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Users {
	    private int id;
	    private String username;
	    private String email;
	    @Min(value = 18)
	    @Max(value = 30)
	    private int age;
	    private String phone;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		 
	    
}
