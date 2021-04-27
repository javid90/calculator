package az.rabitabank.calculator.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import az.rabitabank.calculator.dto.request.ArithmeticRequestDto;
import az.rabitabank.calculator.dto.response.CalculatorResponseDto;
import az.rabitabank.stub.Calculator;
import az.rabitabank.stub.CalculatorSoap;

@Service
public class ArithmeticServiceImpl implements ArithmeticService {

	private static final Logger LOG = Logger.getLogger(ArithmeticServiceImpl.class);

	private CalculatorSoap calculatorSoap;

	private ArithmeticServiceImpl() {

		calculatorSoap = (new Calculator()).getCalculatorSoap();

	}

	public CalculatorResponseDto add(ArithmeticRequestDto request) {

		LOG.info("Request to SOAP");

		Integer result = calculatorSoap.add(request.getA(), request.getB());

		LOG.info("Response from SOAP");

		return CalculatorResponseDto.builder().result(result).build();

	}

	@Override
	public CalculatorResponseDto subtract(ArithmeticRequestDto request) {

		LOG.info("Request to SOAP");

		Integer result = calculatorSoap.subtract(request.getA(), request.getB());

		LOG.info("Response from SOAP");

		return CalculatorResponseDto.builder().result(result).build();

	}

	@Override
	public CalculatorResponseDto multiply(ArithmeticRequestDto request) {

		LOG.info("Request to SOAP");

		Integer result = calculatorSoap.multiply(request.getA(), request.getB());

		LOG.info("Response from SOAP");

		return CalculatorResponseDto.builder().result(result).build();

	}

	@Override
	public CalculatorResponseDto divide(ArithmeticRequestDto request) {

		LOG.info("Request to SOAP");

		Integer result = calculatorSoap.divide(request.getA(), request.getB());

		LOG.info("Response from SOAP");

		return CalculatorResponseDto.builder().result(result).build();

	}

}
