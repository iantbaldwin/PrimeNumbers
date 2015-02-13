/**
 * 
 */
package com.elektrikfish.prime_numbers;

import com.elektrikfish.output.Output;
import com.elektrikfish.stopwatch.Stopwatch;
import com.elektrikfish.userinterface.CommandLineInterface;

/**
 * Main execution class for this program. 
 * Interacts with all over classes to gather and display information
 * @author Ian Baldwin
 */
public class PrimeCounter {
	/**
	 * The prompt to be displayed to the user
	 */
	private static final String PROMPT = "Count all primes under: ";
	
	/**
	 * If an error is encountered, this is displayed to the user
	 */
	private static final String ERROR = "Please enter an integer above 1.";
	
	/**
	 * The minimum value that is acceptable for a user to input
	 */
	private static final int MIN_VAL = 1;

	/**
	 * Method used to execute the program.
	 * @param args Not used in this program
	 */
	public static void main(String[] args) {
   		CommandLineInterface menu = new CommandLineInterface(PROMPT, ERROR, MIN_VAL);
   		PrimeList primes = new PrimeList();
   		Stopwatch timer = new Stopwatch();
   		int upperLimit = menu.intPrompt();
   		timer.start();
        primes.computeUnder(upperLimit);
        timer.end();
        Output results = new Output(primes.getPrimesFound(),timer.getDuration(),primes.getUpperLimit());
        results.generateMessage();
        results.print();
   	}
}
