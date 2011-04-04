package android.health.pedometer;

/**
 * This class encapsuates the core information about a particular exercise session
 * and obtains the estimated number of calories the user burned during the session.
 * 
 * @author Joel Botner
 *
 */
public class ExcerciseSession {

	/** Stores the date of the exercise session with the session number concatenated to the end
	    * e.g. "4-4-2011" + " 3" for the third session on April 4th, 2011*/
	private String date;
	private int calories = 0;
	private DistanceChecker theChecker;
	private ExcerciseSessionInfo theInfo;
	
	/**
	 * This method calculates the estimated number of calories consumed for the given 
	 * exercise session data if not already calculated.
	 * 
	 * @param info The exercise session data to obtain the estimated calories for.
	 * @return The estimated number of calories burned during the exercise session.
	 */
	public static int getCalories(ExcerciseSessionInfo info){
		//TODO: Calorie calculating equations		
		return 0;
	}
	
	/**
	 * Start up a new exercise session. Type of exercise and method of monitoring must be
	 * specified here.
	 * 
	 * @param excerciseType - The type of exercise this session will be. 1 is walking, 2 is running, 3 is biking.
	 * @param useGPS - Boolean value whether to use the GPS to monitor the exercise or not. If the GPS is not used,
	 * the application will fall back to using the built-in accelerometer.
	 */
	public ExcerciseSession(int excerciseType, boolean useGPS){
		theChecker = new DistanceChecker();
		theInfo = new ExcerciseSessionInfo(excerciseType, theChecker);
	}
	
	/**
	 * This is the recommended way of accessing the estimated number of calories burned
	 * through this exercise session.
	 * 
	 * @return The estimated number of calories burned during this information session.
	 */
	public int getMyCalories(){
		calories = calories == 0 ? getCalories(theInfo) : calories;
		return calories;
	}
}
