package android.health.gui;

import android.app.Activity;
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
                setContentView(R.layout.detailed_exercise_stat_tab);
                final Button button_back = (Button) findViewById(R.id.button_back);
                button_back.setOnClickListener(new OnClickListener() {
                    public void onClick(View v) {
                        // Perform action on clicks
                        setContentView(R.layout.exercise_tab);
                    }
                });
            }
        });
        final Button button_new_session = (Button) findViewById(R.id.button_new_session);
        button_new_session.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
                setContentView(R.layout.new_exercise_session_tab);
                final Button button_back = (Button) findViewById(R.id.button_back);
                button_back.setOnClickListener(new OnClickListener() {
                    public void onClick(View v) {
                        // Perform action on clicks
                        setContentView(R.layout.exercise_tab);
                    }
                });
            }
        });
    }
}