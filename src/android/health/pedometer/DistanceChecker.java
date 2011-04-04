package android.health.pedometer;
/**
 * This class is responsible for abstracting all sensor handling away from the rest
 * of the core pedometer components (ExerciseSession, ExcerciseSessionList, and ExcerciseSessionInfo).
 * This class handles the sensors and estimates the distance traveled according to the specific
 * monitoring mode it is assigned to use.
 * @author Joel Botner
 */
public class DistanceChecker {
	/** Stores the distance currently traveled (in hundredths of a mile)*/
	private static int distanceTraveled = 0;
	
	/**
	 * Initialize and utilize the GPS sensors to estimate the distance traveled by the
	 * user.
	 */
	public static void useGPS(){
		
	}
	
	/**
	 * Initialize and utilize the built-in accelerometer to estimate the distance traveled by the
	 * user.
	 */
	public static void useAccel(){
		
	}
	
	/**
	 * Returns the latest estimate on the distance traveled by the user during this session.
	 * 
	 * @return The estimated currently traveled distance.
	 */
	public int getDistance(){
		//TODO: Ensure distanceTraveled is up-to-date
		return distanceTraveled;
	}
}
