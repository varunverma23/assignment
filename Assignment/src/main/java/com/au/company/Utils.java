package com.au.company;

import java.util.regex.Pattern;

public class Utils {
	/*
	 * validate the input string with the regex 
	 */
		public static boolean validateInput(String input){
			    Pattern pattern = Pattern.compile("[0-9]+[.]?[0-9]*");
			    return pattern.matcher(input).matches();
			
		}
}
