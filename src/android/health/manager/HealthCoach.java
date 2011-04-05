package android.health.manager;

/**
 * This class is responsible for managing the health coach functionality,
 * which includes doling out advice to the user based on their relative
 * habits towards diet and exercise.
 * 
 * @author John Mauldin
 */

public class HealthCoach {

	/*Keeps a running total of calories, obtained from both the Pedometer
	 * and Diet Plan part of the application.
	 */
	int totalCalories;
	/*Array filled with the different pieces of advice that the HealthCoach
	 * will return to the user.
	 */
	String advice[];
	
	/*Takes in a piece of nutrition info and compares it with the recommended
	 * daily percent, returning true if higher than the dailypercent
	 * 
	 * @param variable the specific piece of nutrition info being tested
	 * @return returns true if the specific variable is higher than
	 * the recommended daily amount
	 */
	boolean isValueHigh(String variable){
		//TODO: check if specific variable is higher than the suggested
		//daily percent value
		
		return true;
	}
	
	/*
	 * Based on certain criteria (to be determined as proect developes)
	 * said method will return premade pieces of advice that will better
	 * inform the user of their relative health habits
	 */
	String returnAdvice(){
		//TODO: establish criteria and return specific string when
		// said criteria is met
		return null;
	}
	/*
	 * Calculates the total calorie value by adding the total calorie values
	 * given from the Pedometer and Diet Logging Functions
	 */
	int getTotalCalories(){
		//TODO: add total calories
		int a = 0;
		return a;
	}
	
	/*Takes the current number of calories burned/consumed for the day, and
	 * recommends how many more calories should be burned/consumed
	 * 
	 * @param calories the total caloric debt of the user
	 */
	int recommendCalories(int calories){
		//TODO: returns the relative difference denoting how many more/less
		//calories should be consumed in a day
		int a = 0;
		return a;
	}
}
