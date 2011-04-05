package android.health.gui;

import android.app.Activity;
import android.content.Intent;
import android.health.manager.R;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MealLoggerActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meal_logger_tab);
        final Button button_back_logger = (Button) findViewById(R.id.button_back_logger);
        button_back_logger.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
            	Intent intent = new Intent().setClass(MealLoggerActivity.this, TabSelector.class);
            	startActivity(intent);
                
            }
        });
	}

}
