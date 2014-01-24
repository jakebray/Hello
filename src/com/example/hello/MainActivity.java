package com.example.hello;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.i("MainActivity", "Create");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	@Override
	protected void onDestroy() {
		Log.i("MainActivity", "Destroy");
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		Log.i("MainActivity", "Pause");
		super.onPause();
	}

	@Override
	protected void onRestart() {
		Log.i("MainActivity", "Restart");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		Log.i("MainActivity", "Resume");
		super.onResume();
	}

	@Override
	protected void onStart() {
		Log.i("MainActivity", "Start");
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.i("MainActivity", "Stop");
		super.onStop();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
