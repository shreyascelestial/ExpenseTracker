package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Expense;

public interface ExpenseService {
	
	List<Expense> findAll();
	
	void save(Expense expense);
	
	Expense findById(Long id);

}
