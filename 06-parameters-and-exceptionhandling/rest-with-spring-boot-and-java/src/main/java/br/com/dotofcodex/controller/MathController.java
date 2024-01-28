package br.com.dotofcodex.controller;

import static br.com.dotofcodex.converter.NumberConverter.convertToDouble;
import static br.com.dotofcodex.converter.NumberConverter.isNumeric;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dotofcodex.exception.UnsupportedMathOperationException;
import br.com.dotofcodex.math.SimpleMath;

@RestController
public class MathController {

	private SimpleMath simpleMath = new SimpleMath();

	@RequestMapping(path = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please, set a numeric value");
		}

		return simpleMath.sum(convertToDouble(numberOne), convertToDouble(numberTwo));
	}

	@RequestMapping(path = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please, set a numeric value");
		}

		return simpleMath.subtraction(convertToDouble(numberOne), convertToDouble(numberTwo));
	}

	@RequestMapping(path = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiplication(@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please, set a numeric value");
		}

		return simpleMath.multiplication(convertToDouble(numberOne), convertToDouble(numberTwo));
	}

	@RequestMapping(path = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please, set a numeric value");
		}

		return simpleMath.division(convertToDouble(numberOne), convertToDouble(numberTwo));
	}

	@RequestMapping(path = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please, set a numeric value");
		}

		return simpleMath.mean(convertToDouble(numberOne), convertToDouble(numberTwo));
	}

	@RequestMapping(path = "/squareRoot/{number}", method = RequestMethod.GET)
	public Double squareRoot(@PathVariable("number") String number)
			throws Exception {
		if (!isNumeric(number)) {
			throw new UnsupportedMathOperationException("Please, set a numeric value");
		}

		return simpleMath.squareRoot(convertToDouble(number));
	}
}
