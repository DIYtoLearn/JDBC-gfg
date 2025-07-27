package com.digLib.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name="roles")
@Getter
@Setter
@ToString
public class Role {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	

}
