package org.cleancodeba;

public class ApplyEmpty extends ApplyWord {
	public ApplyEmpty() {
	}

	public ApplyEmpty(ApplyWord next) {
		super(next);
	}

	@Override
	public String apply(Integer number) {
		return "";
	}

	@Override
	public String applyNext(Integer number) {
		return apply(number);
	}
}
