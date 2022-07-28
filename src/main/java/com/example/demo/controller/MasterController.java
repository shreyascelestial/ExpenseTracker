package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Expense;
import com.example.demo.service.ExpenseService;

@Controller
public class MasterController {
	
	@Autowired
	ExpenseService expenseservice;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mov= new ModelAndView("home");
		mov.addObject("message","lsit of expenses");
		List<Expense> expenses=expenseservice.findAll();
		mov.addObject("expenses", expenses);
		return mov;
	}
	
	@RequestMapping("/expense")
	public ModelAndView addexpense() {
		ModelAndView mov= new ModelAndView("expense");
		mov.addObject("expense",new Expense());
		return mov;
	}
	
	@RequestMapping(value="/expense",method=RequestMethod.POST)
	public String save(@ModelAttribute("expense") Expense expense) {
		expenseservice.save(expense);
		return "redirect:/";
	}
	
	@RequestMapping(value="/expense/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		ModelAndView mov=new ModelAndView("expense");
		Expense expense=expenseservice.findById(id);
		mov.addObject("expense", expense);
		return mov;
	}
	
	@RequestMapping(value="/expense/{id}/delete")
	public String delete(@PathVariable("id") Long id) {
		return "";
	}
}