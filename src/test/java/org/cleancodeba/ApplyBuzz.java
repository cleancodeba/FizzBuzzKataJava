package org.cleancodeba;

public class ApplyBuzz extends ApplyWord {

	public ApplyBuzz() {
	}

	public ApplyBuzz(ApplyWord next) {
		super(next);
	}

	public String apply(Integer number){
		return (number % 5 == 0) ? "Buzz" : "";
	}
}
