package android.health.gui;

import android.app.Activity;
import android.health.manager.R;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DietTabActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diet_tab);
        
        final Button button_meal_logger = (Button) findViewById(R.id.button_meal_logger);
        button_meal_logger.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
                setContentView(R.layout.meal_logger_tab);
                final Button button_back = (Button) findViewById(R.id.button_back);
                button_back.setOnClickListener(new OnClickListener() {
                    public void onClick(View v) {
                        // Perform action on clicks
                        setContentView(R.layout.diet_tab);
                    }
                });
            }
        });
    }
}