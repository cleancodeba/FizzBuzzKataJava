package org.cleancodeba;

public class ApplyFizz extends ApplyWord {

	public ApplyFizz() {
	}

	public ApplyFizz(ApplyWord next) {
		super(next);
	}

	public String apply(Integer number){
		return (number % 3 == 0) ? "Fizz" : "";
	}
}
