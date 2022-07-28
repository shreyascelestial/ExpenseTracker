package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Expense;
import com.example.demo.repository.ExpenseRepository;

@Service
public class ExpenseServiceImplementation implements ExpenseService{

	@Autowired
	ExpenseRepository ex;
	
	@Override
	public List<Expense> findAll() {
		// TODO Auto-generated method stub
		return ex.findAll();
	}

	@Override
	public void save(Expense expense) {
		expense.setCreatedAt(System.currentTimeMillis());
		ex.save(expense);
		
	}

	@Override
	public Expense findById(Long id) {
	  if(ex.findById(id).isPresent()) {
		  return ex.findById(id).get();
	  }
	  return null;
	}

}
