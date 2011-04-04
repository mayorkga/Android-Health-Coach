package android.health.pedometer;
/**
 * 	This class is responsible for storing, managing, and allowing access to the history
 * of all the user's exercise sessions recorded by this session. Ultimately, all non-pedometer
 * components of the application that wish to access pedometer-related information <b>must use</b>
 * this class to access the data further down.
 * 
 * @author Joel Botner
 *
 */
public class ExcerciseSessionList {
	/**
	 * Creates a new ExerciseSession according to the specified type and
	 * monitoring method.
	 * 
	 * @param travelType - The type of exercise the user is doing: 1 for walking, 2 for running, and 3 for biking.
	 * @param useGPS - Boolean value whether to use the GPS to monitor the exercise or not. If the GPS is not used,
	 * the application will fall back to using the built-in accelerometer.
	 */
	public void addSession(int travelType, boolean useGPS){
		ExcerciseSession newSession = new ExcerciseSession(travelType, useGPS);
		//TODO: Add the session to the list and store it to the filesystem
	}
	
	/**
	 * Removes the specified ExerciseSession from the user's history.
	 * 
	 * @param session The specific session to remove.
	 */
	public void deleteSession(ExcerciseSession session){
		//TODO: Remove the session
	}
	
	/**
	 * Generates and returns key statistics about all recorded exercise from a certain
	 * date onwards.
	 * 
	 * @param date - The date of the exercise session(s) to begin analyze
	 * @return A String containing the core statistics about all exercise
	 * sessions from this point onwards.
	 */
	public String getExcerciseStatistics(String date){
		return null;
	}
	/**
	 * Returns the ExcerciseSession that occurred on a specific day and sequence number.
	 * 
	 * @param date - The date of the desired exercise session (with the session 
	 * number for that day concatenated e.g. <b>"4-4-2011 3"</b> for the third
	 * session on April 4th, 2011).
	 * @return The ExerciseSession specified by that specific date string, null if not found.
	 */
	public ExcerciseSession getExcerciseSession(String date){
		return null;
	}
}
