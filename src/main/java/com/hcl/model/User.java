package com.hcl.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private String userName;
	private Long mobileNo;
	private String emailId;
	private String address;
	private int pinCode;
	private String password;

}
