package com.springboot.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.sun.istack.NotNull;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class User implements Serializable {
	
	private static final long serialVersionUID = -2755307865628967587L;

	@Id
	@SequenceGenerator(name = "userGen", sequenceName = "user_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "userGen", strategy = GenerationType.SEQUENCE)
	private Long id;
	@NotNull
	private UUID uuid;
	private String name;
	private String surname;
	private String email;
	private String password;
}
