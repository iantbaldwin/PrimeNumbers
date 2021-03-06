/**
 * 
 */
package com.elektrikfish.output;


/**
 * @author iantbaldwin
 *
 */
public class Output {
	
	/**
	 * Number of nanoseconds in one second
	 */
	private static final double NANOSECOND_TO_SECOND = Math.pow(10,9);
	
	/**
	 * Number of seconds in a minute
	 */
	private static final int SECONDS_IN_MINUTE = 60;

	/**
	 * Number of primes found
	 */
	private int found;
	
	/**
	 * Duration of the prime calculation in nanoseconds
	 */
	private double duration;
	
	/**
	 * The number under which primes are calculated
	 */
	private int upperLimit;
	
	/**
	 * Output message generated by Output object
	 */
	private String message;
	
	/**
	 * Duration formatted as a string
	 */
	private String durationString;

	/**
	 * Default constructor for Output class
	 * @param found Number of primes found during calculation
	 * @param duration Duration of the calculation
	 * @param upperLimit The number under which primes are calculated and counted
	 */
    public Output(int found, double duration, int upperLimit){
    	// duration for output
    	this.duration = duration;
    	// List of found primes
    	this.found = found;
    	// Value for which to find primes under
    	this.upperLimit = upperLimit;
    }

    /**
     * Generates a message from the values in an Output object
     */
    public void generateMessage(){
    	// Convert duration into a formatted string
    	this.durationString = formatTime(duration);
    	// Create first line of output message
    	this.message = "Found " + this.found + " prime numbers under " + this.upperLimit + ".";
    	// Add second line to message
    	this.message = this.message + "\n";
    	// Append duration information
    	this.message = this.message + "Took: " + durationString + ".";
    }

    /**
     * Formats a duration into an easily readable string
     * @param duration The duration in nanoseconds
     * @return The duration formatted as a string
     */
    private String formatTime(double duration){
    	double minutes = (duration / (SECONDS_IN_MINUTE*NANOSECOND_TO_SECOND)) - ((duration / (SECONDS_IN_MINUTE*NANOSECOND_TO_SECOND))%1);
		double seconds = ((duration - minutes*SECONDS_IN_MINUTE*NANOSECOND_TO_SECOND)/NANOSECOND_TO_SECOND) - 
			(((duration - minutes*60*NANOSECOND_TO_SECOND)/NANOSECOND_TO_SECOND)%1);
		double milliseconds = (((duration - (NANOSECOND_TO_SECOND*(minutes*SECONDS_IN_MINUTE+seconds)))/Math.pow(10,6)) 
			- ((duration - (NANOSECOND_TO_SECOND*(minutes*SECONDS_IN_MINUTE+seconds)))/Math.pow(10,6)%1));
		String minutesString = addZeros(minutes,1,10);
		String secondsString = addZeros(seconds,1,10);
		String millisecondsString = addZeros(milliseconds,2,100);
		return (minutesString + ":" + secondsString + ":" + millisecondsString);
    }

    /**
     * Adds leading zeros to converted time values
     * @param input The time value (double) for which zeros are to be added
     * @param numZeros The number of leading zeros to add
     * @param shiftValue The value for which additional leading zeros are added
     * @return The formatted time value as a string
     */
    private static String addZeros(double input, int numZeros, int shiftValue){
		String output = "" + (int)input;
		if (input > 10){
			numZeros = 1;
		}
		if (input < shiftValue){
			for (int i = 0; i < numZeros; i++){
				output = 0 + output;
			}
		}
		return output;
	}

    /**
     * Prints the Output's generated message to the console
     */
    public void print(){
    	System.out.println(this.message);
    }
}
