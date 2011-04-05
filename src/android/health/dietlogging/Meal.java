package android.health.dietlogging;

import java.util.LinkedList;

/*
 * This class is essentially a linked list responsible for storing, managing,
 * and allowing access to the food objects stored within a specific meal object.
 * 
 *  @author John Mauldin
 */

public class Meal {

	/*
	 * An array that holds a collections of all the specific food objects that
	 * make up said meal
	 */
	LinkedList<Food> FoodList[];
	/*
	 * Keeps track of how many calories are contained in said meal
	 */
	int calories;
	
	
	/*
	 * Adds a food object to the list of food objects within a meal
	 */
	void addFood(Food food){
		//TODO: instert food object to list;
	}
	
	/*
	 * Removes a food object from the list
	 * 
	 * @param food instance of food item to be deleted
	 */
	void removeFood(int food){
		//TODO: remove food object at specific instance from the list
	}
	
	/*
	 * Returns specified food item from the list
	 * 
	 * @param instance location of food item within the array
	 */
	Food getFood(int instance){
		//TODO: returns object at instance from the list
		return null;
	}
	
	/*
	 * Returns the added calorie total of every food item in the array
	 */
	int getMealCalories(){
		//TODO: return the added calories
		int a = 0;
		return 0;
	}
}
