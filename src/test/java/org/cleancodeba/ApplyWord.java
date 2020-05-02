package org.cleancodeba;

public abstract class ApplyWord {
	private ApplyWord next;

	public abstract String apply(Integer number);

	public ApplyWord() {
	}

	public ApplyWord(ApplyWord next) {
		this.next = next;
	}

	public String applyNext(Integer number){
		return next.applyNext(number) + apply(number);
	}
}
