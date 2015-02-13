/**
 * 
 */
package com.elektrikfish.prime_numbers;

import java.util.ArrayList;

/**
 * A class the stores prime numbers in an Array List
 * @author Ian Baldwin
 */
public class PrimeList {
	
	/**
	 * The number under which the primes are to be found
	 */
	private int upperLimit;
	
	/**
	 * The number of primes found under the upper limit
	 */
	private int primesFound; 

	/**
	 * Default constructor for a PrimeList
	 */
    public PrimeList(){
    	this.primesFound = 0;
    }

    /**
     * Uses Ian's algorithm to find all primes under the upper limit
     * @param upperLimit The number under which the primes are to be found
     */
    public void computeUnder(int upperLimit){
    	this.upperLimit = upperLimit;
    	// Is a number prime or not
		boolean prime = true;
		// Create ArrayList of integers of length 1 to hold all found prime numbers
		ArrayList<Integer> primes = new ArrayList<Integer>(1);
		// Preload first prime into list
		primes.add(2);
		// Begin search for prime numbers
		for (int i = 2; i <= this.upperLimit; i++){
			// Assume that a number is prime
			prime = true;
			// Test number, i, to invalidate prime status 
			for (int j = 2; j <= primes.size(); j++){
				// If a number is divisible by a prime, it cannot be prime
				if (i%primes.get(j-2) == 0){
					// Invalidate prime status
					prime = false;
					j = primes.size();
				}
			}
			// Do this, if prime
			if (prime){
				// Add value to list of primes
				primes.add(i);
			}
		}
		primes.remove(0);
		this.primesFound = primes.size();
    }

    /**
     * Returns the number under which primes were/are found
     * @return the upper limit as an integer
     */
    public int getUpperLimit(){
    	return this.upperLimit;
    }

    /**
     * Returns the number of primes found
     * @return The number of primes found
     */
    public int getPrimesFound(){
    	return this.primesFound;
    }
}
