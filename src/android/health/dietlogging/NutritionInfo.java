package android.health.dietlogging;

/*
 * This Class takes the values from the repository of information
 * and creates an object that contains the various pieces of
 * nutrition info needed for reference, upon request, by the user
 * 
 * @author John Mauldin
 */
public class NutritionInfo {

	//int that keeps track of the amount of sodium in a specific food
	int sodium;
	
	//int that keeps track of the amount fat in a specific food
	int totalFat;
	
	//int that keeps track of the amount of cholesterol in a specific food
	int Cholesterol;
	
	//int that keeps track of the amount of carbohydrates in a specific food
	int Carbohydrates;

	//int that keeps track of the amount of fiber in a specific food
	int Fiber;

	//int that keeps track of the amount of sugar in a specific food
	int Sugar;

	//int that keeps track of the amount of protein in a specific food
	int Protein;
	
	//int that keeps track of the amount of calories in a specific food
	int calories;

	/*
	 * int Array of constants that keep track of the recommended daily value for
	 * for each piece of nutrition info
	 * 0 - sodium
	 * 1 - totalFat
	 * 2 - cholesterol
	 * 3 - Carbohydrates
	 * 4 - Fiber
	 * 5 - Sugar
	 * 6 - Protein
	 * 7 - Calories
	 * Each value will be defined from standards established by the  USDA
	 */
	//TODO recalculate Daily Percentage Values
	final int Daily[] = { 0, 0, 0, 0, 0, 0, 0};
	
	//Returns the nutritional info condensed into one string
	String getInfo(){
		//TODO:Condense and return the nutrition info into a string
		return null;
	}
	
	//Returns a specified piece of nutrition info
	//TODO: Write every get... method needed
	int getVariable(){
		//TODO: return a piece of nutrition info
		//i.e. "return this.sodium;" or "return this. totalFat;"
		int a = 0;
		return a;
	}
	
	/*
	 * Returns the daily percentage of a specific variabale that corresponds to the
	 * list of daily values
	 * 
	 * @param variable 
	 */
	int getDailyPercent(int variable){
		//TODO: return the daily amount recommended for the specific variable
		int a = 0;
		return a;
	}
}

