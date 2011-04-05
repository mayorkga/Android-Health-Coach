package android.health.gui;

/**
 * This class takes care of the display for the default Diet Tab
 * 
 * @author Dan Abrams
 */

import java.util.Calendar;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.health.manager.R;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class DietTabActivity extends Activity {
	private TextView myDisplayDate;
    private Button myPickDate;
    static int myYear;
    static int myMonth;
    static int myDay;

    static final int DATE_DIALOG_ID = 0;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diet_tab);
        
     // capture our View elements
        myDisplayDate = (TextView) findViewById(R.id.display_date);
        myPickDate = (Button) findViewById(R.id.pick_date);

        // add a click listener to the button
        myPickDate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showDialog(DATE_DIALOG_ID);
            }
        });

        // get the current date
        final Calendar c = Calendar.getInstance();
        myYear = c.get(Calendar.YEAR);
        myMonth = c.get(Calendar.MONTH);
        myDay = c.get(Calendar.DAY_OF_MONTH);

        // display the current date (this method is below)
        updateDisplay();
        
        final Button button_meal_logger = (Button) findViewById(R.id.button_meal_logger);
        button_meal_logger.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
            	Intent intent = new Intent(DietTabActivity.this, MealLoggerActivity.class);
            	startActivity(intent);
            }
        });
	}
	// updates the date in the TextView
    private void updateDisplay() {
        myDisplayDate.setText(
            new StringBuilder()
                    // Month is 0 based so add 1
                    .append(myMonth + 1).append("-")
                    .append(myDay).append("-")
                    .append(myYear).append(" "));
    }
    private DatePickerDialog.OnDateSetListener myDateSetListener =
        new DatePickerDialog.OnDateSetListener() {

            public void onDateSet(DatePicker view, int year, 
                                  int monthOfYear, int dayOfMonth) {
                myYear = year;
                myMonth = monthOfYear;
                myDay = dayOfMonth;
                updateDisplay();
            }
        };
    protected Dialog onCreateDialog(int id) {
            switch (id) {
            case DATE_DIALOG_ID:
                return new DatePickerDialog(this,
                            myDateSetListener,
                            myYear, myMonth, myDay);
            }
            return null;
    }
}