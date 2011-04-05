package android.health.gui;

/**
 * This class takes care of the display for the default Overall Tab
 * 
 * @author Dan Abrams
 */

import android.app.Activity;
import android.health.manager.R;
import android.os.Bundle;

public class OverallTabActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.overall_tab);
	}
}
