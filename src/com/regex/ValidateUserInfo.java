package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserInfo {
	public void firstName(String firstName){
		//regex pattern
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		checkPattern(regex, firstName);
	}
	
	public void lastName(String lastName){
		//regex pattern
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		checkPattern(regex, lastName);
	}
	
	public void emailId(String emailId) {
		//regex pattern
        String regex = "^[a-zA-z0-9]+([.][0-9a-zA-z]+)*@[a-zA-z]+.[a-z]{2,3}([.][a-z]{2,3})*$";
        checkPattern(regex, emailId);
    }

	//check regex pattern and input
	public void checkPattern(String regexPattern, String userInput) {
		Pattern pattern = Pattern.compile(regexPattern);

		Matcher matcher = pattern.matcher(userInput);

		//checking input is valid or not
		if (matcher.matches()) {
			System.out.println("Input is Valid");
		} else {
			System.out.println("Input is InValid");
		}
	}
}
