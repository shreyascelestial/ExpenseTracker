package com.example.demo.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="TBL_EXPENSES")
@ToString
public class Expense {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@Column(name="description")
	private String name;
	
	private  BigDecimal amount;
	private String notr;
	private long createdAt;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getNote() {
		return notr;
	}
	public void setNotr(String notr) {
		this.notr = notr;
	}
	public long getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}
	
//	public String getName() {
//		return name;
//	}
//	
//	public BigDecimal getAmount() {
//		return amount;
//	}
//	
//	public String getNote() {
//		return notr;
//	}
//	
//	public long getcreatedAt() {
//		return createdAt;
//	}
	
	
}
