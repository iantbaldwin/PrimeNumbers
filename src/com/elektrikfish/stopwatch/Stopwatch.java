/**
 * 
 */
package com.elektrikfish.stopwatch;

/**
 * Use to measure a duration of an event
 * @author Ian Baldwin
 */
public class Stopwatch {
	
	/**
	 * The system time when the stopwatch is started
	 */
    private long startTime;
    
    /**
     * The system time when the stopwatch is ended
     */
    private long endTime;
    
    /**
     * The duration of the event timed
     */
    private double duration;
    
    /**
     * Default constructor for Stopwatch objects
     */
    public Stopwatch(){
    	this.duration = 0;
    	this.startTime = -1L;
    	this.endTime = -1L;
    }

    /**
     * Starts the stopwatch by setting start time to system time
     */
    public void start(){
    	this.startTime = System.nanoTime();
    }

    /**
     * Ends the stopwatch by setting the end time to system time
     */
    public void end(){
    	this.endTime = System.nanoTime();
    }

    /**
     * Calculates and returns the duration of the event logged by the stopwatch object
     * @return double The duration of the event
     */
    public double getDuration(){
    	this.duration = (double)(endTime - startTime);
    	return this.duration;
    }

    /**
     * Returns the start time of an event
     * @return long The start time
     */
    public long getStartTime(){
    	return this.startTime;
    }

    /**
     * Returns the end time of an event
     * @return long the end time
     */
    public long getEndTime(){
    	return this.endTime;
    }
    
    /**
     * Resets the stopwatch to its defualt state
     */
    public void reset(){
    	this.startTime = -1l;
    	this.endTime = -1l;
    	this.duration = 0;
    }
}
