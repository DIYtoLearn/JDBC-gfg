package com.hcl.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Roles {

	 @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer roleId;
	String role;

}
