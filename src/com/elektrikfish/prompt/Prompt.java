/**
 * 
 */
package com.elektrikfish.prompt;

import java.util.Scanner;

/**
 * Class responsilbe for prompting a user over via
 * The command line
 * @author Ian Baldwin
 *
 */
public class Prompt {
	
	/**
	 * User defined prompt message
	 */
    private String promptMessage;
    
    /**
     * User defined error message
     */
    private String errorMessage;
    
    /**
     * Minimum value for an integer input
     */
    private int minVal;

    /**
     * Default constructor for a prompt
     * @param promptMessage The input message presented to the user
     * @param errorMessage The error message presented to the user
     * @param minVal The minimum acceptable value for an integer response
     */
    public Prompt(String promptMessage, String errorMessage, int minVal){
    	this.promptMessage = promptMessage;
    	this.errorMessage = errorMessage;
    	this.minVal = minVal;
    }

    /**
     * Prompt the user for an integer with the supplied prompting information
     * @return The user's integer response
     */
    public int intPrompt(){
    	Scanner userInput = new Scanner(System.in);
        System.out.print(this.promptMessage);
    	return intErrorChecking(userInput);
    }

    /**
     * Checks for errors when an integer input is required
     * @param userInput A scanner tied to System.in
     * @return a valid integer response
     */
    private int intErrorChecking(Scanner userInput){
    	// Value to hold the user's integer
    	int intVal;

    	// Ensure that user enters an integer
    	while (!userInput.hasNextInt()){
    		// Show error message and reprompt
    		intError(userInput);
    	}

    	// Store that value into variable
    	intVal = userInput.nextInt();

    	// Ensure that value is greater than a specified minimum value
    	while(intVal < this.minVal){
    		// Show error message and reprompt
    		intError(userInput);
    		// Store that value into variable
    		intVal = userInput.nextInt();
    	}

    	// Return user's valid integer
    	return intVal;
    }

    /**
     * Handles integer error and re-prompt
     * @param userInput Scanner object tied to Sytem.in
     */
    private void intError(Scanner userInput){
    	// Print error message
    	System.out.println(this.errorMessage);
    	// Throw out bad entry
    	userInput.nextLine();
    	// Print prompt message
    	System.out.print(this.promptMessage);	
    }
}
