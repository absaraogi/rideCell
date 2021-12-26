package com.bookStore.trackingService.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private UserType userType;
	@ElementCollection(targetClass=Address.class)
	private List<Address> addresses;
	private String email;
	private Boolean isActive;


	public User(String firstName, String lastName, UserType userType, List<Address> addresses, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userType = userType;
		this.addresses = addresses;
		this.email = email;
		this.isActive = Boolean.TRUE;
	}

	
}
