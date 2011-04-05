package android.health.gui;

/**
 * This class takes care of the display for the default Exercise Tab
 * 
 * @author Dan Abrams
 */

import android.app.Activity;
import android.content.Intent;
import android.health.manager.R;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ExerciseTabActivity extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise_tab);
        
        final Button button_stat = (Button) findViewById(R.id.button_stat);
        button_stat.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
            	Intent intent = new Intent(ExerciseTabActivity.this, ExerciseStatisticsActivity.class);
            	startActivity(intent);
            }
        });
        final Button button_new_session = (Button) findViewById(R.id.button_new_session);
        button_new_session.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
                // Perform action on clicks
            	Intent intent = new Intent(ExerciseTabActivity.this, NewExerciseSessionActivity.class);
            	startActivity(intent);
            }
        });
    }
	
}