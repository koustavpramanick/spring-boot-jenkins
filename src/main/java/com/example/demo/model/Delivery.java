package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class Delivery {
	@Id
	private String deliveryDetails;
	private String deliveryStatus;
}
