package com.elektrikfish.userinterface;

import com.elektrikfish.prompt.Prompt;

/**
 * A class used to interact with the user through the command line.
 * @author Ian Baldwin
 */
public class CommandLineInterface {
	
	/**
	 * The prompt object used to prompt a user 
	 */
	private Prompt prompt;
	
	/**
	 * Default constructor for CommandLineInterface object
	 * @param prompt The message with which to prompt the user
	 * @param error The message with which to prompt the user in the event of an error
	 * @param minVal The minimum expected value for an integer input
	 */
	public CommandLineInterface(String prompt, String error, int minVal){
		this.prompt = new Prompt(prompt, error, minVal);
	}
	
	
	/**
	 * Prompt the user for an integer with the given prompt
	 * @return The integer the user enters
	 */
	public int intPrompt(){
		return this.prompt.intPrompt();
	}
}
