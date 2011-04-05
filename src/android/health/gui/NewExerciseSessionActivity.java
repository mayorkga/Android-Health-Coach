package android.health.gui;

import android.app.Activity;
import android.content.Intent;
import android.health.manager.R;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NewExerciseSessionActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_exercise_session_tab);
        final Button button_back_new_session = (Button) findViewById(R.id.button_back_new_session);
        button_back_new_session.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
            	Intent intent = new Intent().setClass(NewExerciseSessionActivity.this, TabSelector.class);
            	startActivity(intent);
                
            }
        });
	}

}