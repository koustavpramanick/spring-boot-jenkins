package com.example.demo.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@ToString
public class Order {
	@Id
	private int orderId;
	private int orderPrice;
	private String orderName;
	private int orderQty;
	//private Delivery delivery;
}
