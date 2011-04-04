package android.health.gui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ExerciseTabActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("This is the Exercise tab");
        setContentView(textview);
    }
}