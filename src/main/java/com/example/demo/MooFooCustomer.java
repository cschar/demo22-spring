package com.example.demo;

import java.util.Date;


import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

//import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.*;


@Entity
@Table(name = "customer2", schema="appdb")
public class MooFooCustomer {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@NotBlank
    @Column(name="moo")
    @Size(min = 1, max = 40)
    private String username;
	
	@Column(name="foo")
	@Temporal(TemporalType.DATE)
    private Date date;

	private Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	private String getUsername() {
		return username;
	}

	private void setUsername(String username) {
		this.username = username;
	}

	private Date getDate() {
		return date;
	}

	private void setDate(Date date) {
		this.date = date;
	}
	
	@Override
    public String toString() {
		return "Customer " + this.id + " " + this.username;
	}

}




