package com.ip.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringExercisesTest {

	@Test
    public void noLowercaseLettersInAnEmptyString() {
        Assert.assertEquals(0, com.ip.demo.StringExercises.countLowercaseLetters(""));
    }
	
	 @Test
	    public void countsLowercaseLetterExample() {
	        Assert.assertEquals(3, com.ip.demo.StringExercises.countLowercaseLetters("aBcDeF"));
	    }
	 
	  @Test
	    public void suppoertsNoLowercaseLetters() {
	        Assert.assertEquals(0, com.ip.demo.StringExercises.countLowercaseLetters("ABCDEF"));
	    }
	  
	  @Test
	    public void noStringReturnedForEmptyList() {
	        Assert.assertFalse(com.ip.demo.StringExercises.mostLowercaseString(Collections.<String>emptyList()).isPresent());
	    }
	  
	  @Test
	    public void findsMostLowercaseString() {
	        Optional<String> result = StringExercises.mostLowercaseString(Arrays.asList("a", "abc", "ABCde"));
	        Assert.assertEquals(Optional.of("abc"), result);
	    }
}
