package android.health.gui;

import android.app.Activity;
import android.content.Intent;
import android.health.manager.R;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        final EditText sessionTitle = (EditText) findViewById(R.id.title_edit);
        sessionTitle.setOnKeyListener(new OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                    (keyCode == KeyEvent.KEYCODE_ENTER)) {
                  // Perform action on key press
                  Toast.makeText(NewExerciseSessionActivity.this, sessionTitle.getText(), Toast.LENGTH_SHORT).show();
                  return true;
                }
                return false;
            }
        });
	}

}