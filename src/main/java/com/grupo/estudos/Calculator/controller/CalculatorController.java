package com.grupo.estudos.Calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.grupo.estudos.Calculator.dto.RequestCalculation;
import com.grupo.estudos.Calculator.service.CalculatorService;

@Controller
public class CalculatorController {
	@Autowired
	private CalculatorService calculatorService;

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@PostMapping("/")
	public ModelAndView calculation(RequestCalculation request) {
		double result = 0;
		ModelAndView modelAndView = new ModelAndView("home");

		switch (request.getOperator()) {

		case "+":
			result = calculatorService.add(request.getFirstOperand(), request.getSecondOperand());
			break;

		case "-":
			result = calculatorService.subtract(request.getFirstOperand(), request.getSecondOperand());
			break;

		case "*":
			result = calculatorService.multiply(request.getFirstOperand(), request.getSecondOperand());
			break;

		case "/":
			result = calculatorService.divide(request.getFirstOperand(), request.getSecondOperand());
			break;
		}

		modelAndView.addObject("result", result);

		return modelAndView;
	}


}
