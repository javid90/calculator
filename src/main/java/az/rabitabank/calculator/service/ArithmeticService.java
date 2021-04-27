package az.rabitabank.calculator.service;

import az.rabitabank.calculator.dto.request.ArithmeticRequestDto;
import az.rabitabank.calculator.dto.response.CalculatorResponseDto;

public interface ArithmeticService {

	public CalculatorResponseDto add(ArithmeticRequestDto request);
	
	public CalculatorResponseDto subtract(ArithmeticRequestDto request);
	
	public CalculatorResponseDto multiply(ArithmeticRequestDto request);
	
	public CalculatorResponseDto divide(ArithmeticRequestDto request);
	
}
