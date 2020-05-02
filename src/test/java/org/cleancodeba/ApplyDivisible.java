package org.cleancodeba;

public class ApplyDivisible extends ApplyWord {
	private int divisor;
	private String word;

	private ApplyDivisible(ApplyWord next, int divisor, String word) {
		super(next);
		this.divisor = divisor;
		this.word = word;
	}

	@Override
	public String apply(Integer number) {
		return number % divisor == 0 ? word : "";
	}

	public static ApplyDivisible fromNextDivisorAndWord(ApplyWord next, int divisor, String word){
		return new ApplyDivisible(next, divisor, word);
	}
}
