package com.grupo.estudos.Calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	double result;

	public double add(int num1, int num2) {
		result = num1 + num2;
		return result;
	}

	public double subtract(int num1, int num2) {
		result = num1 - num2;
		return result;
	}

	public double multiply(int num1, int num2) {
		result = num1 * num2;
		return result;
	}

	public double divide(int num1, int num2) {
		result = num1 / num2;
		return result;
	}

}
