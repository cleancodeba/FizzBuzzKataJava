package org.cleancodeba;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void fizzBuzzTest() {
        assertEquals("1", covertToFizzBuzz(1));
        assertEquals("2", covertToFizzBuzz(2));
        assertEquals("Fizz", covertToFizzBuzz(3));
        assertEquals("4", covertToFizzBuzz(4));
        assertEquals("Buzz", covertToFizzBuzz(5));
        assertEquals("FizzBuzz", covertToFizzBuzz(15));
        assertEquals("FizzBuzz", covertToFizzBuzz(60));
        assertEquals("Fizz", covertToFizzBuzz(99));
        assertEquals("77", covertToFizzBuzz(77));
    }

    private String covertToFizzBuzzFromChain(Integer number) {
        ApplyWord applyWord = new ApplyBuzz(new ApplyFizz(new ApplyEmpty()));
        String result = applyWord.applyNext(number);
        return result.isEmpty() ? number.toString() : result;
    }

    private String covertToFizzBuzzArray(Integer number) {
        StringBuilder result = new StringBuilder();
        ApplyWord[] applyWords = {new ApplyFizz(), new ApplyBuzz()};

        for (ApplyWord applyWord : applyWords)
            result.append(applyWord.apply(number));

        return (result.length() == 0) ? number.toString() : result.toString();
    }

    private String covertToFizzBuzz(Integer number) {
        ApplyWord applyWordFizz = ApplyDivisible.fromNextDivisorAndWord(new ApplyEmpty(), 3, "Fizz");
        ApplyWord applyWord = ApplyDivisible.fromNextDivisorAndWord(applyWordFizz, 5, "Buzz");
        String result = applyWord.applyNext(number);
        return result.isEmpty() ? number.toString() : result;
    }
}
