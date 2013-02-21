package edu.Drake.androidcollaboration;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private static final String TAG = "MainActivity";
	Button button;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button = (Button) findViewById(R.id.joesBtn);
        button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.v(TAG, "Joes btn Pressed");
				Intent intent = new Intent(v.getContext(), JoesActivity.class);
				startActivity(intent);
			}
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
