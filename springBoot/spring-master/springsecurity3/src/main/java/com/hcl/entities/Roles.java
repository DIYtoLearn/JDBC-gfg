package com.hcl.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Roles {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer roleId;
    @Column(unique=true)
	String role;

}

	