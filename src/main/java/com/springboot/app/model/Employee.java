package com.springboot.app.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Type;

import com.sun.istack.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Employee implements Serializable {

	private static final long serialVersionUID = 4657004580847194341L;

	@Id
	@SequenceGenerator(name = "employeeGen", sequenceName = "employee_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "employeeGen", strategy = GenerationType.SEQUENCE)
	private Long id;
	@NotNull
	@Type(type="uuid-char")
	private UUID uuid;
	private String name;
	private String surname;
	private String address;
	private BigDecimal salary;
	private String gender;
}
