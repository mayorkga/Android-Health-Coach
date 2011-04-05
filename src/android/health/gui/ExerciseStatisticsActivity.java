package android.health.gui;

/**
 * This class takes care of the display for the Detailed Statistics button 
 * from the default Exercise Tab
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

public class ExerciseStatisticsActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_exercise_stat_tab);
        
        final Button button_back_stat = (Button) findViewById(R.id.button_back_stat);
        button_back_stat.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
            	Intent intent = new Intent().setClass(ExerciseStatisticsActivity.this, TabSelector.class);
            	startActivity(intent);
                
            }
        });
	}

}