package android.health.pedometer;
/**
 * This class stores the core information about the excercise itself from the
 * exercise session: estimated distance, time taken, method taken to estimate
 * distance, average estimated speed, max estimated speed, minimum estimated
 * speed, etc.
 * @author Joel Botner
 *
 */
public class ExcerciseSessionInfo {
	/** Specifies whether the user walked, ran, or biked (1, 2, or 3 respectively)*/
	private int typeOfTravel = 0;
	private int distanceTraveled = 0; //Distance in hundredths of a mile
	private DistanceChecker sensorWatcher;
	
	/**
	 * This creates a new ExcerciseSessionInfo to store the important details about the 
	 * specified means of exercise. After creation, it will begin to poll the DistanceChecker
	 * for updated distance counts until the session ends.
	 * 
	 * @param travelType - The type of exercise the user is doing: 1 for walking, 2 for running, and 3 for biking
	 * @param checker - The specific DistanceChecker to obtain distance counts from.
	 */
	public ExcerciseSessionInfo(int travelType, DistanceChecker checker){
		typeOfTravel = travelType;
		sensorWatcher = checker;
		
		//TODO: BEGIN TRACKING OF THE DISTANCE COUNTS
	}
	
	/**
	 * Returns the type of travel the user indicated they were using for this exercise session.
	 * 
	 * @return 1 for walking, 2 for running, and 3 for biking
	 */
	public int getTravel(){
		return typeOfTravel;
	}
	
	/**
	 * Returns the current tallied distance traveled as estimated by the
	 * DistanceChecker.
	 * 
	 * @return The current distance traveled in hundredths of a mile.
	 */
	public int getDistance(){
		return distanceTraveled;
	}
}
