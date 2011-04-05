package android.health.dietlogging;

/*
 * This class is responsible for storing, managing, and allowing access to the history
 * of all the user's meals recorded during a day.
 * 
 *  @author John Mauldin
 */

public class MealList {
	
	/*
	 * Keeps track of the date in which said meal list was created (one meal list
	 * per day)
	 */
	int date;
	
	/*
	 * An array that holds all individuals meals for a meal list
	 */
	MealList meal[];
	
	
	/*
	 * constructor for a new MealList for a specific date
	 */
	public MealList(int date){
		this.date = date;
	}
	
	/*
	 * Adds a meal to the array
	 * 
	 * @param meal object denoting the meal to be added to the list
	 */
	void addMeal(Meal meal){
		//TODO: add meal to the list
	}
	/*
	 * Removes a specific meal from the list
	 * 
	 * @param meal integer denoting the instance of the meal object to
	 *  be removed from the list
	 */
	void removeMeal(int meal){
		//TODO: remove meal from the list
	}
	
	/*
	 * Returns the added calories of all the meals in the list
	 */
	int getTotalCalories(){
		//TODO: rewrite to add the totals of all the calories in each meal
		int a = 0;
		return a;
	}
	
	/*
	 * Returns the specified instance of a desired meal object from the list
	 * 
	 * @param instance integer referring to a specific spot in the list
	 */
	int getMeal(int instance){
		//TODO: rewrite to return the  specific item from the list
		int a = 0;
		return a;
	}
}

